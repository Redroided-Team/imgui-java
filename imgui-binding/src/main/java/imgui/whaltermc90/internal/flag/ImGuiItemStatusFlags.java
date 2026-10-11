package imgui.whaltermc90.internal.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public class ImGuiItemStatusFlags {
    private ImGuiItemStatusFlags() {
    }

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiItemStatusFlags_")
    public Void __;
}
