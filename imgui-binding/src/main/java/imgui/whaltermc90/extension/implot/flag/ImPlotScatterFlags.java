package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotScatterFlags {
    private ImPlotScatterFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotScatterFlags_")
    public Void __;
}
