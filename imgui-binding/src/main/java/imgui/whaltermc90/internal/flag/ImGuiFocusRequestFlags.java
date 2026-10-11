package imgui.whaltermc90.internal.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImGuiFocusRequestFlags {
    private ImGuiFocusRequestFlags() {
    }

    @BindingAstEnum(file = "ast-imgui_internal.json", qualType = "ImGuiFocusRequestFlags_")
    public Void __;
}
