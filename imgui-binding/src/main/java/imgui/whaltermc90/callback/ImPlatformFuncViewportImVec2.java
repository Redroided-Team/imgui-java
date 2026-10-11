package imgui.whaltermc90.callback;

import imgui.whaltermc90.ImGuiViewport;
import imgui.whaltermc90.ImVec2;

/**
 * Callback to represent ImGuiPlatformIO function with args: (ImGuiViewport*, ImVec2)
 */
public abstract class ImPlatformFuncViewportImVec2 {
    public abstract void accept(ImGuiViewport vp, ImVec2 imVec2);
}
