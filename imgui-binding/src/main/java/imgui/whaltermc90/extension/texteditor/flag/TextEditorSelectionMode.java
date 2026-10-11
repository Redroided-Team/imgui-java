package imgui.whaltermc90.extension.texteditor.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;
import imgui.whaltermc90.binding.annotation.ExcludedSource;

@ExcludedSource
@BindingSource
public final class TextEditorSelectionMode {
    private TextEditorSelectionMode() {
    }

    @BindingAstEnum(file = "ast-TextEditor.json", qualType = "TextEditor::SelectionMode")
    public Void __;
}
