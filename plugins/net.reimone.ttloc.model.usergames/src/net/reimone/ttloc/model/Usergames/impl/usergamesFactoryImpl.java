/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.Usergames.impl;

import net.reimone.ttloc.model.Usergames.*;

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
public class usergamesFactoryImpl extends EFactoryImpl implements usergamesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static usergamesFactory init() {
		try {
			usergamesFactory theusergamesFactory = (usergamesFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/net.reimone.ttloc.model.usergames/metamodel/usergames.xsd"); 
			if (theusergamesFactory != null) {
				return theusergamesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new usergamesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public usergamesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case usergamesPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case usergamesPackage.SPIELPLAN_TYPE: return createSpielplanType();
			case usergamesPackage.SPIEL_TYPE: return createSpielType();
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
	public usergamesPackage getusergamesPackage() {
		return (usergamesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static usergamesPackage getPackage() {
		return usergamesPackage.eINSTANCE;
	}

} //usergamesFactoryImpl
