package imgui.whaltermc90.internal.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

/**
 * Extend ImGuiDockNodeFlags
 */
@BindingSource
public final class ImGuiDockNodeFlags {
    private ImGuiDockNodeFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiDockNodeFlags_")
    public Void __;

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiDockNodeFlagsPrivate_", sanitizeName = "ImGuiDockNodeFlags_")
    public Void ___;
}
