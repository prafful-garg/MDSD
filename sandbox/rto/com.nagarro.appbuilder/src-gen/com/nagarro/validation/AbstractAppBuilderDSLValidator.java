/*
 * generated by Xtext
 */
package com.nagarro.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractAppBuilderDSLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.nagarro.appBuilderDSL.AppBuilderDSLPackage.eINSTANCE);
		return result;
	}
}
