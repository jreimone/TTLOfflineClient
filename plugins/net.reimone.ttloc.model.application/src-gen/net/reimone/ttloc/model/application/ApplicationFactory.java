/**
 */
package net.reimone.ttloc.model.application;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.reimone.ttloc.model.application.ApplicationPackage
 * @generated
 */
public interface ApplicationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationFactory eINSTANCE = net.reimone.ttloc.model.application.impl.ApplicationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TTLOC Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTLOC Application</em>'.
	 * @generated
	 */
	TTLOCApplication createTTLOCApplication();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApplicationPackage getApplicationPackage();

} //ApplicationFactory
