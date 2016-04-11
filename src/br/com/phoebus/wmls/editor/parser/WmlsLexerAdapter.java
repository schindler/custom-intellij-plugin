package br.com.phoebus.wmls.editor.parser;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by raunysouza on 4/8/16.
 */
public class WmlsLexerAdapter extends FlexAdapter {

    public WmlsLexerAdapter() {
        super(new _WmlsLexer((Reader) null));
    }
}
