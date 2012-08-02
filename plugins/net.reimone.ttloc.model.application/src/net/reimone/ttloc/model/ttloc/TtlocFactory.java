/**
 */
package net.reimone.ttloc.model.ttloc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.reimone.ttloc.model.ttloc.TtlocPackage
 * @generated
 */
public interface TtlocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TtlocFactory eINSTANCE = net.reimone.ttloc.model.ttloc.impl.TtlocFactoryImpl.init();

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
	TtlocPackage getTtlocPackage();

} //TtlocFactory
