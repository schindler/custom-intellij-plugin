package br.com.phoebus.wmls.editor;

import com.intellij.lang.Language;

/**
 * Created by raunysouza on 4/8/16.
 */
public class WmlsLanguage extends Language {

    public static final WmlsLanguage INSTANCE = new WmlsLanguage();

    private WmlsLanguage() {
        super("WMLS");
    }
}
