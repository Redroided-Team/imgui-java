package imgui.whaltermc90.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

/**
 * Configuration flags stored in io.ConfigFlags. Set by user/application.
 */
@BindingSource
public final class ImGuiConfigFlags {
    private ImGuiConfigFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiConfigFlags_")
    public Void __;
}
