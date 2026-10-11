package imgui.whaltermc90.callback;

import imgui.whaltermc90.ImGuiViewport;

/**
 * Callback to represent ImGuiPlatformIO function with args: (ImGuiViewport*) - Boolean
 */
public abstract class ImPlatformFuncViewportSuppFloat {
    public abstract float get(ImGuiViewport vp);
}
