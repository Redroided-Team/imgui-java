package imgui.whaltermc90.internal.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiDockNodeState {
    private ImGuiDockNodeState() {
    }

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiDockNodeState", sanitizeName = "ImGuiDockNodeState_")
    public Void __;
}
