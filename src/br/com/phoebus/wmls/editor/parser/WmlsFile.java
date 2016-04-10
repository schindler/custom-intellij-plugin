package br.com.phoebus.wmls.editor.parser;

import br.com.phoebus.wmls.editor.WmlsFileType;
import br.com.phoebus.wmls.editor.WmlsLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

/**
 * Created by raunysouza on 4/8/16.
 */
public class WmlsFile extends PsiFileBase {

    protected WmlsFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, WmlsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return WmlsFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "WMLS File";
    }
}
