package tool.generator

import com.badlogic.gdx.jnigen.NativeCodeGenerator
import groovy.transform.CompileStatic
import org.gradle.api.DefaultTask
import org.gradle.api.file.CopySpec
import org.gradle.api.file.DuplicatesStrategy
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction

/**
 * Builds the imgui-java JNI library for Android (arm64-v8a only).
 *
 * Mirrors the source-staging half of {@link GenerateLibs} (same vendored
 * sources, same imconfig.h, same package-relocated hand-written JNI), but
 * cross-compiles with the Android Clang toolchain instead of the desktop
 * Ant builds. Run on an Android host (e.g. Termux) or with ANDROID_CXX
 * pointing at an NDK Clang.
 *
 * Headers come from the toolchain sysroot (which matches ART's jni.h).
 * The desktop JDK's jni.h is deliberately NOT used: its C++ JNIEnv struct
 * tag mangles differently and would produce unloadable binaries.
 * Override with ANDROID_JNI_INCLUDE=/path/to/include if needed.
 *
 * Output: imgui-binding/build/android/arm64-v8a/libimgui-java64.so
 * Copy it into your app under src/main/jniLibs/arm64-v8a/ and load with
 * System.loadLibrary("imgui-java64") (or -Dimgui.library.path).
 */
@CompileStatic
class GenerateAndroidLibs extends DefaultTask {
    private static final String[] INCLUDES = [
        'include/imgui',
        'include/imnodes',
        'include/imgui-node-editor',
        'include/imguizmo',
        'include/implot',
        'include/ImGuiColorTextEdit',
        'include/imgui_club/imgui_memory_editor',
        'include/imgui-knobs'
    ]

    private static final String ABI = 'arm64-v8a'
    private static final String LIB_NAME = 'libimgui-java64.so'

    @Internal
    String group = 'build'
    @Internal
    String description = 'Build imgui-java native library for Android (arm64-v8a).'

    // Resolved at configuration time (Gradle 9 configuration cache requirement).
    // Staging lives under build/ (gitignored) — Termux/Android hosts have no /tmp.
    private final String rootDir = project.rootDir.path
    private final String jniDir = project.file('build/jni-android').path
    private final String objDir = project.file('build/obj-android').path
    private final String sourceDir = project.file('src/generated/java').path
    private final String classpath = project.file('build/classes/java/main').path
    private final String outDir = project.file('build/android/' + ABI).path
    private final String cxx = System.getenv('ANDROID_CXX') ?: 'clang++'
    private final String jniInclude = System.getenv('ANDROID_JNI_INCLUDE') ?: ''

    @TaskAction
    void generate() {
        println 'Generating Android native library (arm64-v8a)...'
        println "C++ compiler: $cxx"
        println '====================================='

        stageSources()
        compileAndroid()
        checkLibExist()
        println "Android library ready: $outDir/$LIB_NAME"
    }

    private void stageSources() {
        new File(jniDir).deleteDir()

        // Generate h/cpp files for JNI (package-aware: picks up relocated classes).
        new NativeCodeGenerator().generate(sourceDir, classpath, jniDir)

        // Copy ImGui h/cpp files.
        project.copy { CopySpec spec ->
            INCLUDES.each {
                spec.from(new File(rootDir, it)) { CopySpec s -> s.include('*.h', '*.cpp', '*.inl') }
            }
            spec.from(new File(rootDir, 'imgui-binding/src/main/native'))
            spec.into(jniDir)
            spec.duplicatesStrategy = DuplicatesStrategy.INCLUDE
        }

        // Ensure we overwrite imconfig.h with our own.
        project.copy { CopySpec spec ->
            spec.from(new File(rootDir, 'imgui-binding/src/main/native/imconfig.h'))
            spec.into(jniDir)
        }

        // Ensure the active ImGuiColorTextEdit snapshot wins.
        project.copy { CopySpec spec ->
            spec.from(new File(rootDir, 'include/ImGuiColorTextEdit')) { CopySpec s -> s.include('TextEditor.h', 'TextEditor.cpp') }
            spec.into(jniDir)
        }

        // Copy dirent for ImGuiFileDialog (header-only, unused unless referenced).
        project.copy { CopySpec spec ->
            spec.from(new File(rootDir, 'include/ImGuiFileDialog/dirent')) { CopySpec s -> s.include('*.h', '*.cpp', '*.inl') }
            spec.into(jniDir + '/dirent')
        }
    }

    private void compileAndroid() {
        new File(outDir).mkdirs()

        // Per-file compilation (then a single link): compiling all sources in
        // one compiler invocation exhausts memory on device hosts.
        File objDirFile = new File(objDir)
        objDirFile.deleteDir()
        objDirFile.mkdirs()

        List<String> sources = []
        new File(jniDir).eachFileRecurse { File f ->
            if (f.name.endsWith('.cpp')) {
                sources += f.path
            }
        }
        if (sources.isEmpty()) {
            throw new IllegalStateException("No C++ sources staged in $jniDir")
        }
        println "Compiling ${sources.size()} translation units..."

        // Sysroot (toolchain-default) headers match ART. Only add an explicit
        // -I when the caller overrides via ANDROID_JNI_INCLUDE.
        List<String> includeFlags = []
        if (!jniInclude.isEmpty()) {
            includeFlags += ['-I', jniInclude]
        }
        List<String> objects = []
        sources.sort().each { String src ->
            // Flatten relative path into the object name (collision-proof).
            String obj = objDir + '/' + src.substring(jniDir.length() + 1).replace('/', '_').replace('.cpp', '.o')
            objects += obj
            println "  CC ${new File(src).name}"
            project.providers.exec { spec ->
                spec.commandLine([cxx, '-std=c++17', '-O2', '-fPIC',
                                  '-I', jniDir] + includeFlags +
                    ['-c', src, '-o', obj])
            }.result.get()
        }

        println "Linking $LIB_NAME..."
        project.providers.exec { spec ->
            spec.commandLine([cxx, '-shared'] + objects + ['-o', outDir + '/' + LIB_NAME])
        }.result.get()
    }

    private void checkLibExist() {
        File lib = new File("$outDir/$LIB_NAME")
        if (!lib.exists() || lib.length() == 0) {
            throw new IllegalStateException("$lib was not produced")
        }
    }
}
