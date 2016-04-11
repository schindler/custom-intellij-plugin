// This is a generated file. Not intended for manual editing.
package br.com.phoebus.wmls.editor.parser.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import br.com.phoebus.wmls.editor.parser.psi.impl.*;

public interface WmlsTypes {

  IElementType ARGUMENTS = new WmlsElementType("ARGUMENTS");
  IElementType ARGUMENT_LIST = new WmlsElementType("ARGUMENT_LIST");
  IElementType ASSIGMENT_EXPRESSION = new WmlsElementType("ASSIGMENT_EXPRESSION");
  IElementType BLOCK = new WmlsElementType("BLOCK");
  IElementType FORMAL_PARAMETER_LIST = new WmlsElementType("FORMAL_PARAMETER_LIST");
  IElementType FUNCTION_DECLARATION = new WmlsElementType("FUNCTION_DECLARATION");
  IElementType FUNCTION_NAME = new WmlsElementType("FUNCTION_NAME");
  IElementType LOCAL_FUNCTION_CALL = new WmlsElementType("LOCAL_FUNCTION_CALL");
  IElementType PACKAGE_STATEMENT = new WmlsElementType("PACKAGE_STATEMENT");
  IElementType PRAGMA_DECLARATION = new WmlsElementType("PRAGMA_DECLARATION");

  IElementType BITSHIFT_LEFT = new WmlsTokenType("<<");
  IElementType BITSHIFT_RIGHT = new WmlsTokenType(">>");
  IElementType BLOCK_COMMENT = new WmlsTokenType("BLOCK_COMMENT");
  IElementType COMMA = new WmlsTokenType(",");
  IElementType CRLF = new WmlsTokenType("CRLF");
  IElementType DOC_COMMENT = new WmlsTokenType("DOC_COMMENT");
  IElementType EXTERN = new WmlsTokenType("extern");
  IElementType FUNCTION = new WmlsTokenType("function");
  IElementType HEX = new WmlsTokenType("HEX");
  IElementType IDENTIFIER = new WmlsTokenType("identifier");
  IElementType LEFT_BRACE = new WmlsTokenType("{");
  IElementType LEFT_BRACKET = new WmlsTokenType("[");
  IElementType LEFT_PAREN = new WmlsTokenType("(");
  IElementType LINE_COMMENT = new WmlsTokenType("LINE_COMMENT");
  IElementType NATIVE = new WmlsTokenType("native");
  IElementType NUMBER = new WmlsTokenType("NUMBER");
  IElementType OP_ADD = new WmlsTokenType("+");
  IElementType OP_ADD_ASSIGN = new WmlsTokenType("+=");
  IElementType OP_AND = new WmlsTokenType("&&");
  IElementType OP_ASSIGN = new WmlsTokenType("=");
  IElementType OP_BITWISE_AND = new WmlsTokenType("&");
  IElementType OP_BITWISE_AND_ASSIGN = new WmlsTokenType("&=");
  IElementType OP_BITWISE_LEFT_ASSIGN = new WmlsTokenType("<<=");
  IElementType OP_BITWISE_NOT = new WmlsTokenType("~");
  IElementType OP_BITWISE_OR = new WmlsTokenType("|");
  IElementType OP_BITWISE_OR_ASSIGN = new WmlsTokenType("|=");
  IElementType OP_BITWISE_RIGHT_ASSIGN = new WmlsTokenType(">>=");
  IElementType OP_BITWISE_RIGHT_ZERO_ASSIGN = new WmlsTokenType(">>>=");
  IElementType OP_BITWISE_RIGTH_ZERO = new WmlsTokenType(">>>");
  IElementType OP_BITWISE_XOR = new WmlsTokenType("^");
  IElementType OP_BITWISE_XOR_ASSIGN = new WmlsTokenType("^=");
  IElementType OP_DECR = new WmlsTokenType("--");
  IElementType OP_DIVIDE = new WmlsTokenType("/");
  IElementType OP_DIV_ASSIGN = new WmlsTokenType("/=");
  IElementType OP_EQUAL = new WmlsTokenType("==");
  IElementType OP_GREATER_THAN = new WmlsTokenType(">");
  IElementType OP_GREATER_THAN_EQUAL = new WmlsTokenType(">=");
  IElementType OP_INCR = new WmlsTokenType("++");
  IElementType OP_INEQUALITY = new WmlsTokenType("!=");
  IElementType OP_INT_DIVIDE = new WmlsTokenType("div");
  IElementType OP_INT_DIV_ASSIGN = new WmlsTokenType("div=");
  IElementType OP_LESS_THAN = new WmlsTokenType("<");
  IElementType OP_LESS_THAN_EQUAL = new WmlsTokenType("<=");
  IElementType OP_MOD = new WmlsTokenType("%");
  IElementType OP_MOD_ASSIGN = new WmlsTokenType("%=");
  IElementType OP_MULTIPLY = new WmlsTokenType("*");
  IElementType OP_MULT_ASSIGN = new WmlsTokenType("*=");
  IElementType OP_NOT = new WmlsTokenType("!");
  IElementType OP_OR = new WmlsTokenType("||");
  IElementType OP_SUBTRACT = new WmlsTokenType("-");
  IElementType OP_SUB_ASSIGN = new WmlsTokenType("-=");
  IElementType PACKAGE = new WmlsTokenType("package");
  IElementType PACKAGE_IDENTIFIER = new WmlsTokenType("PACKAGE_IDENTIFIER");
  IElementType RIGHT_BRACE = new WmlsTokenType("}");
  IElementType RIGHT_BRACKET = new WmlsTokenType("]");
  IElementType RIGHT_PAREN = new WmlsTokenType(")");
  IElementType SEMICOLON = new WmlsTokenType(";");
  IElementType STRING = new WmlsTokenType("STRING");
  IElementType URL = new WmlsTokenType("url");
  IElementType USE = new WmlsTokenType("use");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARGUMENTS) {
        return new WmlsArgumentsImpl(node);
      }
      else if (type == ARGUMENT_LIST) {
        return new WmlsArgumentListImpl(node);
      }
      else if (type == ASSIGMENT_EXPRESSION) {
        return new WmlsAssigmentExpressionImpl(node);
      }
      else if (type == BLOCK) {
        return new WmlsBlockImpl(node);
      }
      else if (type == FORMAL_PARAMETER_LIST) {
        return new WmlsFormalParameterListImpl(node);
      }
      else if (type == FUNCTION_DECLARATION) {
        return new WmlsFunctionDeclarationImpl(node);
      }
      else if (type == FUNCTION_NAME) {
        return new WmlsFunctionNameImpl(node);
      }
      else if (type == LOCAL_FUNCTION_CALL) {
        return new WmlsLocalFunctionCallImpl(node);
      }
      else if (type == PACKAGE_STATEMENT) {
        return new WmlsPackageStatementImpl(node);
      }
      else if (type == PRAGMA_DECLARATION) {
        return new WmlsPragmaDeclarationImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
