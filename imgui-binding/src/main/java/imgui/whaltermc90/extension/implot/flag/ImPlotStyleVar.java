package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotStyleVar {
    private ImPlotStyleVar() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotStyleVar_")
    public Void __;
}
