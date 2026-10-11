package imgui.whaltermc90.internal.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiButtonFlags {
    private ImGuiButtonFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiButtonFlags_")
    public Void __;

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiButtonFlagsPrivate_", sanitizeName = "ImGuiButtonFlags_")
    public Void ___;
}
