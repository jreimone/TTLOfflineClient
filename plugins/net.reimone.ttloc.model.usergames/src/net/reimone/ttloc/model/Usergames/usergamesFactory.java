/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.Usergames;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.reimone.ttloc.model.Usergames.usergamesPackage
 * @generated
 */
public interface usergamesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	usergamesFactory eINSTANCE = net.reimone.ttloc.model.Usergames.impl.usergamesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Spielplan Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spielplan Type</em>'.
	 * @generated
	 */
	SpielplanType createSpielplanType();

	/**
	 * Returns a new object of class '<em>Spiel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spiel Type</em>'.
	 * @generated
	 */
	SpielType createSpielType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	usergamesPackage getusergamesPackage();

} //usergamesFactory
