/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package de.bmw.carit.jnario.validation;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.Issue.IssueImpl;
import org.eclipse.xtext.validation.ResourceValidatorImpl;

public class JnarioResourceValidator extends ResourceValidatorImpl {

	private static final String REFERENCE_ERROR_MESSAGE = "Couldn't resolve reference to ";

	@Override
	public List<Issue> validate(Resource resource, CheckMode mode,
			CancelIndicator mon) {
		List<Issue> validate = super.validate(resource, mode, mon);
		if(validate == null){
			return null;
		}
		for(Issue issue: validate){
			if(issue.getMessage().startsWith(REFERENCE_ERROR_MESSAGE + "Step")){
				IssueImpl issueImpl = (IssueImpl) issue;
				issueImpl.setSeverity(Severity.WARNING);
			}
		}
		return validate;
	}
}
