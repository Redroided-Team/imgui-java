package imgui.whaltermc90.internal;

import imgui.whaltermc90.binding.ImGuiStruct;

public class ImGuiContext extends ImGuiStruct {
    public ImGuiContext(final long ptr) {
        super(ptr);
        ImGui.init();
    }
}
