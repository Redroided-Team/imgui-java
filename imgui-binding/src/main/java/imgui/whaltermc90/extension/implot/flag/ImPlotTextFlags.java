package imgui.whaltermc90.extension.implot.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class ImPlotTextFlags {
    private ImPlotTextFlags() {
    }

    @BindingAstEnum(file = "ast-implot.json", qualType = "ImPlotTextFlags_")
    public Void __;
}
