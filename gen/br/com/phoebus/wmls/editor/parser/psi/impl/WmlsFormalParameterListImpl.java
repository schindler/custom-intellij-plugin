// This is a generated file. Not intended for manual editing.
package br.com.phoebus.wmls.editor.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static br.com.phoebus.wmls.editor.parser.psi.WmlsTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import br.com.phoebus.wmls.editor.parser.psi.*;

public class WmlsFormalParameterListImpl extends ASTWrapperPsiElement implements WmlsFormalParameterList {

  public WmlsFormalParameterListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WmlsVisitor visitor) {
    visitor.visitFormalParameterList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WmlsVisitor) accept((WmlsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WmlsFormalParameterList getFormalParameterList() {
    return findChildByClass(WmlsFormalParameterList.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
