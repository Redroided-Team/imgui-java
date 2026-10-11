package imgui.whaltermc90.extension.imguiknobs.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiKnobVariant {
    private ImGuiKnobVariant() {
    }

    @BindingAstEnum(file = "ast-imgui-knobs.json", qualType = "ImGuiKnobVariant_")
    public Void __;
}
