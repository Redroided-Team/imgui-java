package imgui.whaltermc90.extension.nodeditor.flag;

import imgui.whaltermc90.binding.annotation.BindingAstEnum;
import imgui.whaltermc90.binding.annotation.BindingSource;

@BindingSource
public final class NodeEditorPinKind {
    private NodeEditorPinKind() {
    }

    @BindingAstEnum(file = "ast-imgui_node_editor.json", qualType = "ax::NodeEditor::PinKind")
    public Void __;
}
