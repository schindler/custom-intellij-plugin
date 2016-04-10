package br.com.phoebus.wmls.editor.parser.psi;

import br.com.phoebus.wmls.editor.WmlsLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by raunysouza on 4/8/16.
 */
public class WmlsElementType extends IElementType {

    public WmlsElementType(@NotNull @NonNls String debugName) {
        super(debugName, WmlsLanguage.INSTANCE);
    }
}
