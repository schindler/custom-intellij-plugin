// This is a generated file. Not intended for manual editing.
package br.com.phoebus.wmls.editor.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static br.com.phoebus.wmls.editor.parser.psi.WmlsTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class WmlsParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ARGUMENT_LIST) {
      r = argumentList(b, 0);
    }
    else if (t == ARGUMENTS) {
      r = arguments(b, 0);
    }
    else if (t == ASSIGMENT_EXPRESSION) {
      r = assigmentExpression(b, 0);
    }
    else if (t == BLOCK) {
      r = block(b, 0);
    }
    else if (t == FORMAL_PARAMETER_LIST) {
      r = formalParameterList(b, 0);
    }
    else if (t == FUNCTION_DECLARATION) {
      r = functionDeclaration(b, 0);
    }
    else if (t == FUNCTION_NAME) {
      r = functionName(b, 0);
    }
    else if (t == LOCAL_FUNCTION_CALL) {
      r = localFunctionCall(b, 0);
    }
    else if (t == PACKAGE_STATEMENT) {
      r = packageStatement(b, 0);
    }
    else if (t == PRAGMA_DECLARATION) {
      r = pragmaDeclaration(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return wmlsFile(b, l + 1);
  }

  /* ********************************************************** */
  // assigmentExpression | argumentList COMMA assigmentExpression
  public static boolean argumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assigmentExpression(b, l + 1);
    if (!r) r = argumentList_1(b, l + 1);
    exit_section_(b, m, ARGUMENT_LIST, r);
    return r;
  }

  // argumentList COMMA assigmentExpression
  private static boolean argumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argumentList(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && assigmentExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_PAREN argumentList? RIGHT_PAREN
  public static boolean arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments")) return false;
    if (!nextTokenIs(b, LEFT_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && arguments_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, ARGUMENTS, r);
    return r;
  }

  // argumentList?
  private static boolean arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1")) return false;
    argumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER OP_ASSIGN IDENTIFIER
  public static boolean assigmentExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assigmentExpression")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, OP_ASSIGN, IDENTIFIER);
    exit_section_(b, m, ASSIGMENT_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACE (localFunctionCall)? RIGHT_BRACE
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && block_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  // (localFunctionCall)?
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    block_1_0(b, l + 1);
    return true;
  }

  // (localFunctionCall)
  private static boolean block_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = localFunctionCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | (formalParameterList COMMA IDENTIFIER)?
  public static boolean formalParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, FORMAL_PARAMETER_LIST, "<formal parameter list>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = formalParameterList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (formalParameterList COMMA IDENTIFIER)?
  private static boolean formalParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList_1")) return false;
    formalParameterList_1_0(b, l + 1);
    return true;
  }

  // formalParameterList COMMA IDENTIFIER
  private static boolean formalParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formalParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formalParameterList(b, l + 1);
    r = r && consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (extern | native)? function identifier LEFT_PAREN formalParameterList? RIGHT_PAREN (block)? (SEMICOLON)?
  public static boolean functionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DECLARATION, "<function declaration>");
    r = functionDeclaration_0(b, l + 1);
    r = r && consumeTokens(b, 0, FUNCTION, IDENTIFIER, LEFT_PAREN);
    r = r && functionDeclaration_4(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    r = r && functionDeclaration_6(b, l + 1);
    r = r && functionDeclaration_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (extern | native)?
  private static boolean functionDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_0")) return false;
    functionDeclaration_0_0(b, l + 1);
    return true;
  }

  // extern | native
  private static boolean functionDeclaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, NATIVE);
    exit_section_(b, m, null, r);
    return r;
  }

  // formalParameterList?
  private static boolean functionDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_4")) return false;
    formalParameterList(b, l + 1);
    return true;
  }

  // (block)?
  private static boolean functionDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6")) return false;
    functionDeclaration_6_0(b, l + 1);
    return true;
  }

  // (block)
  private static boolean functionDeclaration_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SEMICOLON)?
  private static boolean functionDeclaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_7")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean functionName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionName")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, FUNCTION_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // functionDeclaration       |
  //              packageStatement               |
  //              pragmaDeclaration              |
  //              CRLF                           |
  //              DOC_COMMENT                    |
  //              BLOCK_COMMENT                  |
  //              LINE_COMMENT
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionDeclaration(b, l + 1);
    if (!r) r = packageStatement(b, l + 1);
    if (!r) r = pragmaDeclaration(b, l + 1);
    if (!r) r = consumeToken(b, CRLF);
    if (!r) r = consumeToken(b, DOC_COMMENT);
    if (!r) r = consumeToken(b, BLOCK_COMMENT);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // functionName arguments SEMICOLON
  public static boolean localFunctionCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localFunctionCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionName(b, l + 1);
    r = r && arguments(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, LOCAL_FUNCTION_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // package PACKAGE_IDENTIFIER SEMICOLON
  public static boolean packageStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packageStatement")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PACKAGE, PACKAGE_IDENTIFIER, SEMICOLON);
    exit_section_(b, m, PACKAGE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // use (url) IDENTIFIER STRING SEMICOLON
  public static boolean pragmaDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaDeclaration")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && consumeToken(b, URL);
    r = r && consumeTokens(b, 0, IDENTIFIER, STRING, SEMICOLON);
    exit_section_(b, m, PRAGMA_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // item_+
  static boolean wmlsFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wmlsFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = item_(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "wmlsFile", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

}
