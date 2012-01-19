/**
 * <copyright>
 * </copyright>
 *

 */
package de.bmw.carit.jnario.jnario.util;

import de.bmw.carit.jnario.jnario.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.xtend2.xtend2.XtendAnnotationTarget;
import org.eclipse.xtext.xtend2.xtend2.XtendClass;
import org.eclipse.xtext.xtend2.xtend2.XtendFile;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.bmw.carit.jnario.jnario.JnarioPackage
 * @generated
 */
public class JnarioSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JnarioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JnarioSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = JnarioPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case JnarioPackage.FEATURE:
			{
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseXtendClass(feature);
				if (result == null) result = caseXtendAnnotationTarget(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.BACKGROUND:
			{
				Background background = (Background)theEObject;
				T result = caseBackground(background);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.SCENARIO:
			{
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = caseXtendMember(scenario);
				if (result == null) result = caseXtendAnnotationTarget(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.STEP:
			{
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseXtendMember(step);
				if (result == null) result = caseXtendAnnotationTarget(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.GIVEN:
			{
				Given given = (Given)theEObject;
				T result = caseGiven(given);
				if (result == null) result = caseStep(given);
				if (result == null) result = caseXtendMember(given);
				if (result == null) result = caseXtendAnnotationTarget(given);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.WHEN:
			{
				When when = (When)theEObject;
				T result = caseWhen(when);
				if (result == null) result = caseStep(when);
				if (result == null) result = caseXtendMember(when);
				if (result == null) result = caseXtendAnnotationTarget(when);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.THEN:
			{
				Then then = (Then)theEObject;
				T result = caseThen(then);
				if (result == null) result = caseStep(then);
				if (result == null) result = caseXtendMember(then);
				if (result == null) result = caseXtendAnnotationTarget(then);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.AND:
			{
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseStep(and);
				if (result == null) result = caseXtendMember(and);
				if (result == null) result = caseXtendAnnotationTarget(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.CODE:
			{
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.EXAMPLE_TABLE:
			{
				ExampleTable exampleTable = (ExampleTable)theEObject;
				T result = caseExampleTable(exampleTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.EXAMPLE_HEADING:
			{
				ExampleHeading exampleHeading = (ExampleHeading)theEObject;
				T result = caseExampleHeading(exampleHeading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.EXAMPLE_ROW:
			{
				ExampleRow exampleRow = (ExampleRow)theEObject;
				T result = caseExampleRow(exampleRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.EXAMPLE_CELL:
			{
				ExampleCell exampleCell = (ExampleCell)theEObject;
				T result = caseExampleCell(exampleCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.JNARIO:
			{
				Jnario jnario = (Jnario)theEObject;
				T result = caseJnario(jnario);
				if (result == null) result = caseXtendFile(jnario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.GIVEN_REF:
			{
				GivenRef givenRef = (GivenRef)theEObject;
				T result = caseGivenRef(givenRef);
				if (result == null) result = caseRef(givenRef);
				if (result == null) result = caseStep(givenRef);
				if (result == null) result = caseXtendMember(givenRef);
				if (result == null) result = caseXtendAnnotationTarget(givenRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.WHEN_REF:
			{
				WhenRef whenRef = (WhenRef)theEObject;
				T result = caseWhenRef(whenRef);
				if (result == null) result = caseRef(whenRef);
				if (result == null) result = caseStep(whenRef);
				if (result == null) result = caseXtendMember(whenRef);
				if (result == null) result = caseXtendAnnotationTarget(whenRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.THEN_REF:
			{
				ThenRef thenRef = (ThenRef)theEObject;
				T result = caseThenRef(thenRef);
				if (result == null) result = caseRef(thenRef);
				if (result == null) result = caseStep(thenRef);
				if (result == null) result = caseXtendMember(thenRef);
				if (result == null) result = caseXtendAnnotationTarget(thenRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.AND_REF:
			{
				AndRef andRef = (AndRef)theEObject;
				T result = caseAndRef(andRef);
				if (result == null) result = caseRef(andRef);
				if (result == null) result = caseStep(andRef);
				if (result == null) result = caseXtendMember(andRef);
				if (result == null) result = caseXtendAnnotationTarget(andRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JnarioPackage.REF:
			{
				Ref ref = (Ref)theEObject;
				T result = caseRef(ref);
				if (result == null) result = caseStep(ref);
				if (result == null) result = caseXtendMember(ref);
				if (result == null) result = caseXtendAnnotationTarget(ref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackground(Background object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Given</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Given</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGiven(Given object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhen(When object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Then</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Then</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThen(Then object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleTable(ExampleTable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Heading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Heading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleHeading(ExampleHeading object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleRow(ExampleRow object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleCell(ExampleCell object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jnario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jnario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJnario(Jnario object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Given Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Given Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGivenRef(GivenRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenRef(WhenRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Then Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Then Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThenRef(ThenRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndRef(AndRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRef(Ref object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtend Annotation Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtend Annotation Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendAnnotationTarget(XtendAnnotationTarget object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtend Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtend Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendClass(XtendClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtend Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtend Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendMember(XtendMember object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xtend File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xtend File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXtendFile(XtendFile object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //JnarioSwitch
