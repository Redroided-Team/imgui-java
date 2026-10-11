package imgui.whaltermc90.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

/**
 * Flags for ImGui::InputText()
 */
@BindingSource
public final class ImGuiInputTextFlags {
    private ImGuiInputTextFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImGuiInputTextFlags_")
    public Void __;
}
