package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotPieChartFlags {
    private ImPlotPieChartFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotPieChartFlags_")
    public Void __;
}
