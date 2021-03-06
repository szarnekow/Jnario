package org.jnario.jnario.tests.unit.jnario;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class StringsStartsWithWordSpecExamples extends ExampleTableRow {
  public StringsStartsWithWordSpecExamples(final List<String> cellNames, final String string, final String word, final int index) {
    super(cellNames);
    this.string = string;
    this.word = word;
    this.index = index;
  }
  
  public String string;
  
  public String getString() {
    return string;
  }
  
  public String word;
  
  public String getWord() {
    return word;
  }
  
  public int index;
  
  public int getIndex() {
    return index;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(string) ,toString(word) ,toString(index));
  }
}
