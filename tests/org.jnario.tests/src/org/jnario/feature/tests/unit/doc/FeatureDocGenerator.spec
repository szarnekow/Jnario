/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.doc

import static org.junit.Assert.*
import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.FeatureTestCreator
import org.jnario.feature.doc.FeatureDocGenerator
import org.jnario.feature.feature.FeatureFile
import org.jnario.feature.feature.Feature
import java.io.File
import java.io.FileOutputStream
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.jnario.report.Executable2ResultMapping
import org.jnario.report.Failed
import org.junit.runner.notification.Failure
import org.jnario.report.SpecFailure

@CreateWith(typeof(FeatureTestCreator))
describe FeatureDocGenerator {
	
	
	@Inject extension ModelStore 
	@Inject InMemoryFileSystemAccess fsa
	
	fact "generates scenario documentation"{
		val actual = 
		"
			package test

			Feature: Example Feature
				
				This is a description.
				
				Scenario: Example Scenario
				
					String input
				
					Given a step with an argument \"something\", another \"argument\" and a multiline string:
					'''
						import java.util.Collections.*;
						
						public class Greeter{
							public static void main(String args[]){
								List<String> list = new ArrayList<String>(); // should escape angle brackets
								Systen.out.println('Hello World');
							}
						}''' 
						input = args.first
						println(args.last)
					When I do something that is pending.
					Then it results in \"something else\"
						input + ' else' => args.first                                    
		".generateDoc
		
		val expected = '''
				<p>This is a description.</p>
				<div class=""><h3  id="Scenario_Example_Scenario">Scenario: Example Scenario
				</h3>
				<ul>
				<li><div class="step "><p><strong>Given</strong> a step with an argument <code>"something"</code>, another <code>"argument"</code> and a multiline string:</p><pre>import java.util.Collections.*;
				
				public class Greeter{
				  public static void main(String args[]){
				    List&lt;String&gt; list = new ArrayList&lt;String&gt;(); // should escape angle brackets
				    Systen.out.println('Hello World');
				  }
				}</pre>
				</div>
				<ul>
				</ul>
				</li>
				<li><div class="step "><p><strong>When</strong> I do something that is pending. [PENDING]</p>
				</div>
				<ul>
				</ul>
				</li>
				<li><div class="step "><p><strong>Then</strong> it results in <code>"something else"</code></p>
				</div>
				<ul>
				</ul>
				</li>
				</ul>
				</div>
			'''.toString
		
		assertEquals(expected, actual)
	}
	
	fact "Includes failure state in Feature"{
		'''
			Feature: Example
			
			Scenario: A failing Scenario
			
			Given something
			When something happens 
			Then there is an error
		'''.generateDocWithError
	}
	
	@Inject JavaIoFileSystemAccess fsa2
	Executable2ResultMapping mapping = [Failed::failingSpec("org.jnario.Class", "This Feature", 0.3,  new SpecFailure("There was a problem", "Exception", '''
		java.lang.StringIndexOutOfBoundsException: String index out of range: -1
			at java.lang.String.substring(String.java:1937)
			at java.lang.String.substring(String.java:1904)
			at org.jnario.feature.doc.FeatureDocGenerator$1.apply(FeatureDocGenerator.java:44)
			at org.jnario.feature.doc.FeatureDocGenerator$1.apply(FeatureDocGenerator.java:1)
			at org.jnario.doc.HtmlFile.newHtmlFile(HtmlFile.java:21)
			at org.jnario.feature.doc.FeatureDocGenerator.createHtmlFile(FeatureDocGenerator.java:57)
			at org.jnario.doc.AbstractDocGenerator$2$1.apply(AbstractDocGenerator.java:88)
	'''.toString))]
	
	def generateDocWithError(CharSequence input){
		val resource = parseScenario(input)
		fsa2.setOutputPath("DOC_OUTPUT", "tmp/")
		subject.doGenerate(resource, fsa2, mapping)
	}
	
	def generateDoc(CharSequence input){
		val resource = parseScenario(input)
		val featureFile= resource.contents.head as FeatureFile
		return subject.generateContent(featureFile.xtendClasses.head as Feature).toString
	}
}