package br.com.phoebus.wmls.editor.parser.psi;

import br.com.phoebus.wmls.editor.WmlsLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by raunysouza on 4/8/16.
 */
public class WmlsTokenType extends IElementType {

    public WmlsTokenType(@NotNull @NonNls String debugName) {
        super(debugName, WmlsLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "WmlsTokenType." + super.toString();
    }
}
