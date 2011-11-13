/*
* generated by Xtext
*/
package de.bmw.carit.jnario.spec.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.bmw.carit.jnario.spec.services.SpecGrammarAccess;

public class SpecParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SpecGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected de.bmw.carit.jnario.spec.parser.antlr.internal.InternalSpecParser createParser(XtextTokenStream stream) {
		return new de.bmw.carit.jnario.spec.parser.antlr.internal.InternalSpecParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SpecFile";
	}
	
	public SpecGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SpecGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
