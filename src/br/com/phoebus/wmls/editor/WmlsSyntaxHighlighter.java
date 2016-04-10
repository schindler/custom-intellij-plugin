package br.com.phoebus.wmls.editor;

import br.com.phoebus.wmls.editor.parser.WmlsLexerAdapter;
import br.com.phoebus.wmls.editor.parser.psi.WmlsTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * Created by raunysouza on 4/8/16.
 */
public class WmlsSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey OPERATION =
            TextAttributesKey.createTextAttributesKey("SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEYWORD =
            TextAttributesKey.createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE =
            TextAttributesKey.createTextAttributesKey("STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey LINE_COMMENT =
            TextAttributesKey.createTextAttributesKey("LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT =
            TextAttributesKey.createTextAttributesKey("BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey DOC_COMMENT =
            TextAttributesKey.createTextAttributesKey("DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            TextAttributesKey.createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] OPERATION_KEYS = new TextAttributesKey[]{OPERATION};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] LINE_COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT};
    private static final TextAttributesKey[] BLOCK_COMMENT_KEYS = new TextAttributesKey[]{BLOCK_COMMENT};
    private static final TextAttributesKey[] DOC_COMMENT_KEYS = new TextAttributesKey[]{DOC_COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new WmlsLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType iElementType) {

        if (iElementType.equals(WmlsTypes.OP_MULTIPLY)) {
            return OPERATION_KEYS;
        } else if (iElementType.equals(WmlsTypes.BITSHIFT_LEFT)) {
            return OPERATION_KEYS;
        } else if (iElementType.equals(WmlsTypes.BITSHIFT_RIGHT)) {
            return OPERATION_KEYS;
        } else if (iElementType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
