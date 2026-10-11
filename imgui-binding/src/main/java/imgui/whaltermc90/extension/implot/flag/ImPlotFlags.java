package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotFlags {
    private ImPlotFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotFlags_")
    public Void __;
}
