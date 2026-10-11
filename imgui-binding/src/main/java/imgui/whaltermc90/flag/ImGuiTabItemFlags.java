package imgui.whaltermc90.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

/**
 * Flags for ImGui::BeginTabItem()
 */
@BindingSource
public final class ImGuiTabItemFlags {
    private ImGuiTabItemFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiTabItemFlags_")
    public Void __;
}
