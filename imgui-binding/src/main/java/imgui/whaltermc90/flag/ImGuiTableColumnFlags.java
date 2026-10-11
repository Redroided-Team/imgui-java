package imgui.whaltermc90.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

/**
 * Flags for {@link imgui.whaltermc90.ImGui#tableSetupColumn(String, int)}
 */
@BindingSource
public final class ImGuiTableColumnFlags {
    private ImGuiTableColumnFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiTableColumnFlags_")
    public Void __;
}
