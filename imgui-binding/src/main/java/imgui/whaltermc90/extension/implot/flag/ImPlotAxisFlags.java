package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotAxisFlags {
    private ImPlotAxisFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotAxisFlags_")
    public Void __;
}
