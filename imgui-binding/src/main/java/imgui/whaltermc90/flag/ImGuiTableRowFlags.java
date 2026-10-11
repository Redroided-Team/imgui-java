package imgui.whaltermc90.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

/**
 * Flags for {@link imgui.whaltermc90.ImGui#tableNextRow(int)}
 */
@BindingSource
public final class ImGuiTableRowFlags {
    private ImGuiTableRowFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiTableRowFlags_")
    public Void __;
}
