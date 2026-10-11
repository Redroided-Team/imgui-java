package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotErrorBarsFlags {
    private ImPlotErrorBarsFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotErrorBarsFlags_")
    public Void __;
}
