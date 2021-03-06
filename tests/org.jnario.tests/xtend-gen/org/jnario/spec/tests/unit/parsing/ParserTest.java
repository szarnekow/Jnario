package org.jnario.spec.tests.unit.parsing;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.jnario.jnario.test.util.AbstractParserTest;
import org.jnario.spec.SpecInjectorProvider;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = SpecInjectorProvider.class)
@SuppressWarnings("all")
public class ParserTest extends AbstractParserTest {
  public Class<? extends Object> context() {
    return ParserTest.class;
  }
}
