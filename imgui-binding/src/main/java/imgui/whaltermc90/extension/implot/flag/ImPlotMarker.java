package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotMarker {
    private ImPlotMarker() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotMarker_")
    public Void __;
}
