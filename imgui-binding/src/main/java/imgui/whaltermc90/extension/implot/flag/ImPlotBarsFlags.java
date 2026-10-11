package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotBarsFlags {
    private ImPlotBarsFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotBarsFlags_")
    public Void __;
}
