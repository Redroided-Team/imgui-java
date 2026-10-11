package imgui.whaltermc90.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

/**
 * Flags for ImGui::TreeNodeEx(), ImGui::CollapsingHeader*()
 */
@BindingSource
public final class ImGuiTreeNodeFlags {
    private ImGuiTreeNodeFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiTreeNodeFlags_")
    public Void __;
}
