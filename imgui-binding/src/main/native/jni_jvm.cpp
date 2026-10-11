#include "jni_jvm.h"

static JavaVM* jvm;

namespace Jni
{
    void InitJvm(JNIEnv* env) {
        env->GetJavaVM(&jvm);
    }

    JNIEnv* GetEnv() {
        JNIEnv* env;
#ifdef __ANDROID__
        // Android's jni.h tops out at JNI_VERSION_1_6; 1.6 is supported by every JVM/ART.
        jint res = jvm->GetEnv((void**)(&env), JNI_VERSION_1_6);
#else
        jint res = jvm->GetEnv((void**)(&env), JNI_VERSION_1_8);
#endif
        assert(res == JNI_OK);
        return env;
    }
}
