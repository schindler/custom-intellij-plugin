package br.com.phoebus.wmls.editor.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import br.com.phoebus.wmls.editor.parser.psi.WmlsTypes;
import com.intellij.psi.TokenType;

%%

%class WmlsLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
FIRST_VALUE_CHARACTER=[^ \n\r\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\r\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("#"|"!")[^\r\n]*
SEPARATOR=[:=]
KEY_CHARACTER=[^:=\ \n\r\t\f\\] | "\\ "

%state YYSTRING

%%

<YYINITIAL> {
    'package'                       { return TokenType.CODE_FRAGMENT; }
    'use'                           { return TokenType.CODE_FRAGMENT; }
}

