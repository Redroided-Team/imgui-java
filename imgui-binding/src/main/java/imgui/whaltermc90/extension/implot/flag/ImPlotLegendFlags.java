package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotLegendFlags {
    private ImPlotLegendFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotLegendFlags_")
    public Void __;
}
