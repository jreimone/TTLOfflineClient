/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.UserSpiele.impl;

import net.reimone.ttloc.model.UserSpiele.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserSpieleFactoryImpl extends EFactoryImpl implements UserSpieleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserSpieleFactory init() {
		try {
			UserSpieleFactory theUserSpieleFactory = (UserSpieleFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/net.reimone.ttloc.model.usergames/metamodel/UserSpiele.xsd"); 
			if (theUserSpieleFactory != null) {
				return theUserSpieleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UserSpieleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSpieleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UserSpielePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case UserSpielePackage.SPIELPLAN_TYPE: return createSpielplanType();
			case UserSpielePackage.SPIEL_TYPE: return createSpielType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpielplanType createSpielplanType() {
		SpielplanTypeImpl spielplanType = new SpielplanTypeImpl();
		return spielplanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpielType createSpielType() {
		SpielTypeImpl spielType = new SpielTypeImpl();
		return spielType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSpielePackage getUserSpielePackage() {
		return (UserSpielePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UserSpielePackage getPackage() {
		return UserSpielePackage.eINSTANCE;
	}

} //UserSpieleFactoryImpl
