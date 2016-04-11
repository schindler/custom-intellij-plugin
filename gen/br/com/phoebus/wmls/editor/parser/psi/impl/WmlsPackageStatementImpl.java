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

public class WmlsPackageStatementImpl extends ASTWrapperPsiElement implements WmlsPackageStatement {

  public WmlsPackageStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WmlsVisitor visitor) {
    visitor.visitPackageStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WmlsVisitor) accept((WmlsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getPackageIdentifier() {
    return findNotNullChildByType(PACKAGE_IDENTIFIER);
  }

}
