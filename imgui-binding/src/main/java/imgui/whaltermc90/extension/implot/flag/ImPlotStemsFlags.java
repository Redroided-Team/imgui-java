package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotStemsFlags {
    private ImPlotStemsFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotStemsFlags_")
    public Void __;
}
