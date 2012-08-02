/**
 */
package net.reimone.ttloc.model.ttloc.util;

import java.util.Map;

import net.reimone.ttloc.model.ttloc.TtlocPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TtlocXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtlocXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		TtlocPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the TtlocResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new TtlocResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new TtlocResourceFactoryImpl());
		}
		return registrations;
	}

} //TtlocXMLProcessor
