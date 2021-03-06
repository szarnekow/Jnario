package org.jnario.suite.scoping;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.jnario.spec.scoping.SpecResourceDescriptionStrategy;
import org.jnario.spec.spec.SpecPackage;

@SuppressWarnings("all")
public class SuiteSpecFilter implements Predicate<IEObjectDescription> {
  private final SpecPackage _specPackage = SpecPackage.eINSTANCE;
  
  public boolean apply(final IEObjectDescription input) {
    boolean _switchResult = false;
    EClass _eClass = input.getEClass();
    final EClass _switchValue = _eClass;
    boolean _matched = false;
    if (!_matched) {
      EClass _exampleGroup = this._specPackage.getExampleGroup();
      if (Objects.equal(_switchValue,_exampleGroup)) {
        _matched=true;
        boolean _isRoot = this.isRoot(input);
        _switchResult = _isRoot;
      }
    }
    if (!_matched) {
      _switchResult = true;
    }
    return _switchResult;
  }
  
  public boolean isRoot(final IEObjectDescription input) {
    String _userData = input.getUserData(SpecResourceDescriptionStrategy.ROOT_SPEC);
    boolean _equals = Objects.equal(_userData, SpecResourceDescriptionStrategy.TRUE);
    return _equals;
  }
}
