/**
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Method Call Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameters#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceMethodCallParameters()
 * @model
 * @generated
 */
public interface InterfaceMethodCallParameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.InterfaceMethodCallParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getInterfaceMethodCallParameters_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceMethodCallParameter> getParameters();

} // InterfaceMethodCallParameters
