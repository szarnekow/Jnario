package org.jnario.feature.tests.unit.naming;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class FeatureClassNameProviderGetClassNameFeatureSpecExamples extends ExampleTableRow {
  public FeatureClassNameProviderGetClassNameFeatureSpecExamples(final List<String> cellNames, final String name, final String expectedClassName) {
    super(cellNames);
    this.name = name;
    this.expectedClassName = expectedClassName;
  }
  
  public String name;
  
  public String getName() {
    return name;
  }
  
  public String expectedClassName;
  
  public String getExpectedClassName() {
    return expectedClassName;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(name) ,toString(expectedClassName));
  }
}
