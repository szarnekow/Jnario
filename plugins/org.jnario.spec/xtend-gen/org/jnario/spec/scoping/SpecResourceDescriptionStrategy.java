package org.jnario.spec.scoping;

import com.google.common.collect.ImmutableMap.Builder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.resource.XtendResourceDescriptionStrategy;
import org.jnario.spec.spec.ExampleGroup;

@SuppressWarnings("all")
public class SpecResourceDescriptionStrategy extends XtendResourceDescriptionStrategy {
  public final static String ROOT_SPEC = "root";
  
  public final static String TRUE = "1";
  
  public final static String FALSE = "0";
  
  public void createUserData(final EObject eObject, final Builder<String,String> userData) {
    super.createUserData(eObject, userData);
    if ((eObject instanceof ExampleGroup)) {
      final ExampleGroup exampleGroup = ((ExampleGroup) eObject);
      String _isRoot = this.isRoot(exampleGroup);
      String _valueOf = String.valueOf(_isRoot);
      userData.put(SpecResourceDescriptionStrategy.ROOT_SPEC, _valueOf);
    }
  }
  
  public String isRoot(final ExampleGroup exampleGroup) {
    String _xifexpression = null;
    EObject _eContainer = exampleGroup.eContainer();
    boolean _not = (!(_eContainer instanceof ExampleGroup));
    if (_not) {
      _xifexpression = SpecResourceDescriptionStrategy.TRUE;
    } else {
      _xifexpression = SpecResourceDescriptionStrategy.FALSE;
    }
    return _xifexpression;
  }
}
