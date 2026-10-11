package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotLocation {
    private ImPlotLocation() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotLocation_")
    public Void __;
}
