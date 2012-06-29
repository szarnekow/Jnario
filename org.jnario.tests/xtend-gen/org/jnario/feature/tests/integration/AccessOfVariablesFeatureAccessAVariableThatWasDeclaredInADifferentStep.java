package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Access a variable that was declared in a different step")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableThatWasDeclaredInADifferentStep {
  @Test
  @Order(0)
  @Named("Given a jnario file")
  public void givenAJnarioFile() {
    this.jnarioFile = "\n\t\t\t\tpackage bootstrap2\n\t\t\t\tFeature: Variable test\n\t\t\t\t\tScenario: Some scenario\n\t\t\t\t\t\tint x\n\t\t\t\t\t\tGiven a step with a variable\n\t\t\t\t\t\t\tx = 3\n\t\t\t\t\t\tWhen I assign it a different value\n\t\t\t\t\t\t\tx = 5\n\t\t\t";
  }
  
  @Test
  @Order(1)
  @Named("When it is executed")
  public void whenItIsExecuted() {
    
  }
  
  @Test
  @Order(2)
  @Named("Then it should be successful")
  public void thenItShouldBeSuccessful() {
    FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}