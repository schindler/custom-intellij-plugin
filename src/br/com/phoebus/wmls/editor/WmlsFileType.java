package br.com.phoebus.wmls.editor;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by raunysouza on 4/8/16.
 */
public class WmlsFileType extends LanguageFileType {

    public static final WmlsFileType INSTANCE = new WmlsFileType();

    private WmlsFileType() {
        super(WmlsLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "WMLS File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "WMLS Language File";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "wmls";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return WmlsIcons.FILE;
    }
}
