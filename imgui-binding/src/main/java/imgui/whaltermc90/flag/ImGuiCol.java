package imgui.whaltermc90.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

/**
 * Enumeration for PushStyleColor() / PopStyleColor()
 */
@BindingSource
public final class ImGuiCol {
    private ImGuiCol() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiCol_")
    public Void __;
}
