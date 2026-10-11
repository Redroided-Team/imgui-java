package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotCol {
    private ImPlotCol() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotCol_")
    public Void __;
}
