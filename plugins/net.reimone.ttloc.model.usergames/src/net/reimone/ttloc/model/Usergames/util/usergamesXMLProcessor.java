/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.Usergames.util;

import java.util.Map;

import net.reimone.ttloc.model.Usergames.usergamesPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class usergamesXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public usergamesXMLProcessor() {
		super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
		extendedMetaData.putPackage(null, usergamesPackage.eINSTANCE);
	}
	
	/**
	 * Register for "*" and "xml" file extensions the usergamesResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new usergamesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new usergamesResourceFactoryImpl());
		}
		return registrations;
	}

} //usergamesXMLProcessor
