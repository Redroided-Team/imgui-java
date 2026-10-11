package imgui.whaltermc90.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

/**
 * Flags for ImFontAtlas build
 */
@BindingSource
public final class ImFontAtlasFlags {
    private ImFontAtlasFlags() {
    }

    @BindingAstEnum(file = "ast-imgui.json", qualType = "ImFontAtlasFlags_")
    public Void __;
}
