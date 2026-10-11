package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotHistogramFlags {
    private ImPlotHistogramFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotHistogramFlags_")
    public Void __;
}
