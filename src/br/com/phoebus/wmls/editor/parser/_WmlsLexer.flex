package br.com.phoebus.wmls.editor.parser;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static br.com.phoebus.wmls.editor.parser.psi.WmlsTypes.*;

%%

%{
  public _WmlsLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _WmlsLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

IDENTIFIER=[a-zA-Z_0-9]+
PACKAGE_IDENTIFIER=[a-zA-Z0-9#]+
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
NUMBER=[0-9]+
HEX=0([xX])*([0-9a-fA-F])*
LINE_COMMENT="//".*
DOC_COMMENT="/"(\*){2}(.?|\n)*\*"/"
BLOCK_COMMENT="/"(\*){1}(.?|\n)*\*"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}             { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "="                       { return OP_ASSIGN; }
  "+="                      { return OP_ADD_ASSIGN; }
  "-="                      { return OP_SUB_ASSIGN; }
  "*="                      { return OP_MULT_ASSIGN; }
  "/="                      { return OP_DIV_ASSIGN; }
  "div="                    { return OP_INT_DIV_ASSIGN; }
  "%="                      { return OP_MOD_ASSIGN; }
  ">>="                     { return OP_BITWISE_RIGHT_ASSIGN; }
  "<<="                     { return OP_BITWISE_LEFT_ASSIGN; }
  ">>>="                    { return OP_BITWISE_RIGHT_ZERO_ASSIGN; }
  "&="                      { return OP_BITWISE_AND_ASSIGN; }
  "^="                      { return OP_BITWISE_XOR_ASSIGN; }
  "|="                      { return OP_BITWISE_OR_ASSIGN; }
  "+"                       { return OP_ADD; }
  "-"                       { return OP_SUBTRACT; }
  "*"                       { return OP_MULTIPLY; }
  "/"                       { return OP_DIVIDE; }
  "div"                     { return OP_INT_DIVIDE; }
  "%"                       { return OP_MOD; }
  "<<"                      { return BITSHIFT_LEFT; }
  ">>"                      { return BITSHIFT_RIGHT; }
  ">>>"                     { return OP_BITWISE_RIGTH_ZERO; }
  "&"                       { return OP_BITWISE_AND; }
  "|"                       { return OP_BITWISE_OR; }
  "^"                       { return OP_BITWISE_XOR; }
  "++"                      { return OP_INCR; }
  "--"                      { return OP_DECR; }
  "~"                       { return OP_BITWISE_NOT; }
  "&&"                      { return OP_AND; }
  "||"                      { return OP_OR; }
  "!"                       { return OP_NOT; }
  "<"                       { return OP_LESS_THAN; }
  "<="                      { return OP_LESS_THAN_EQUAL; }
  "=="                      { return OP_EQUAL; }
  ">="                      { return OP_GREATER_THAN_EQUAL; }
  ">"                       { return OP_GREATER_THAN; }
  "!="                      { return OP_INEQUALITY; }
  ";"                       { return SEMICOLON; }
  ","                       { return COMMA; }
  "{"                       { return LEFT_BRACE; }
  "}"                       { return RIGHT_BRACE; }
  "["                       { return LEFT_BRACKET; }
  "]"                       { return RIGHT_BRACKET; }
  "("                       { return LEFT_PAREN; }
  ")"                       { return RIGHT_PAREN; }
  "CRLF"                    { return CRLF; }
  "extern"                  { return EXTERN; }
  "native"                  { return NATIVE; }
  "function"                { return FUNCTION; }
  "use"                     { return USE; }
  "url"                     { return URL; }
  "package"                 { return PACKAGE; }

  {IDENTIFIER}              { return IDENTIFIER; }
  {PACKAGE_IDENTIFIER}      { return PACKAGE_IDENTIFIER; }
  {STRING}                  { return STRING; }
  {NUMBER}                  { return NUMBER; }
  {HEX}                     { return HEX; }
  {LINE_COMMENT}            { return LINE_COMMENT; }
  {DOC_COMMENT}             { return DOC_COMMENT; }
  {BLOCK_COMMENT}           { return BLOCK_COMMENT; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
