/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package org.jnario;

import org.eclipse.xtext.xbase.XBinaryOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Should</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jnario.Should#isNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jnario.JnarioPackage#getShould()
 * @model
 * @generated
 */
public interface Should extends XBinaryOperation {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see org.jnario.JnarioPackage#getShould_Not()
	 * @model
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link org.jnario.Should#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

} // Should
