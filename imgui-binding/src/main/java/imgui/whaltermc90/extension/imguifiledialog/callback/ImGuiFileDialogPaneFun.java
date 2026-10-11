package imgui.whaltermc90.extension.imguifiledialog.callback;

import imgui.whaltermc90.binding.annotation.ExcludedSource;

@ExcludedSource
public abstract class ImGuiFileDialogPaneFun {
    public abstract void accept(String filter, long userDatas, boolean canContinue);
}
