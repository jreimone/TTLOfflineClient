/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.UserSpiele.impl;

import net.reimone.ttloc.model.UserSpiele.DocumentRoot;
import net.reimone.ttloc.model.UserSpiele.SpielType;
import net.reimone.ttloc.model.UserSpiele.SpielplanType;
import net.reimone.ttloc.model.UserSpiele.UserSpieleFactory;
import net.reimone.ttloc.model.UserSpiele.UserSpielePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserSpielePackageImpl extends EPackageImpl implements UserSpielePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spielplanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spielTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UserSpielePackageImpl() {
		super(eNS_URI, UserSpieleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UserSpielePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UserSpielePackage init() {
		if (isInited) return (UserSpielePackage)EPackage.Registry.INSTANCE.getEPackage(UserSpielePackage.eNS_URI);

		// Obtain or create and register package
		UserSpielePackageImpl theUserSpielePackage = (UserSpielePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UserSpielePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UserSpielePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUserSpielePackage.createPackageContents();

		// Initialize created meta-data
		theUserSpielePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUserSpielePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UserSpielePackage.eNS_URI, theUserSpielePackage);
		return theUserSpielePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Spielplan() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpielplanType() {
		return spielplanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpielplanType_Spiel() {
		return (EReference)spielplanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpielType() {
		return spielTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpielType_ID() {
		return (EAttribute)spielTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpielType_Staffelname() {
		return (EAttribute)spielTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpielType_Nr() {
		return (EAttribute)spielTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpielType_Tag() {
		return (EAttribute)spielTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpielType_Datum() {
		return (EAttribute)spielTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpielType_Heimmannschaft() {
		return (EAttribute)spielTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpielType_Gastmannschaft() {
		return (EAttribute)spielTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpielType_Ergebnis() {
		return (EAttribute)spielTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpielType_Kennzeichnung() {
		return (EAttribute)spielTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpielType_Link() {
		return (EAttribute)spielTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSpieleFactory getUserSpieleFactory() {
		return (UserSpieleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPIELPLAN);

		spielplanTypeEClass = createEClass(SPIELPLAN_TYPE);
		createEReference(spielplanTypeEClass, SPIELPLAN_TYPE__SPIEL);

		spielTypeEClass = createEClass(SPIEL_TYPE);
		createEAttribute(spielTypeEClass, SPIEL_TYPE__ID);
		createEAttribute(spielTypeEClass, SPIEL_TYPE__STAFFELNAME);
		createEAttribute(spielTypeEClass, SPIEL_TYPE__NR);
		createEAttribute(spielTypeEClass, SPIEL_TYPE__TAG);
		createEAttribute(spielTypeEClass, SPIEL_TYPE__DATUM);
		createEAttribute(spielTypeEClass, SPIEL_TYPE__HEIMMANNSCHAFT);
		createEAttribute(spielTypeEClass, SPIEL_TYPE__GASTMANNSCHAFT);
		createEAttribute(spielTypeEClass, SPIEL_TYPE__ERGEBNIS);
		createEAttribute(spielTypeEClass, SPIEL_TYPE__KENNZEICHNUNG);
		createEAttribute(spielTypeEClass, SPIEL_TYPE__LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Spielplan(), this.getSpielplanType(), null, "spielplan", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(spielplanTypeEClass, SpielplanType.class, "SpielplanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpielplanType_Spiel(), this.getSpielType(), null, "spiel", null, 1, -1, SpielplanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spielTypeEClass, SpielType.class, "SpielType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpielType_ID(), theXMLTypePackage.getInt(), "iD", null, 1, 1, SpielType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpielType_Staffelname(), theXMLTypePackage.getString(), "staffelname", null, 1, 1, SpielType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpielType_Nr(), theXMLTypePackage.getString(), "nr", null, 1, 1, SpielType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpielType_Tag(), theXMLTypePackage.getString(), "tag", null, 1, 1, SpielType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpielType_Datum(), theXMLTypePackage.getDateTime(), "datum", null, 1, 1, SpielType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpielType_Heimmannschaft(), theXMLTypePackage.getString(), "heimmannschaft", null, 1, 1, SpielType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpielType_Gastmannschaft(), theXMLTypePackage.getString(), "gastmannschaft", null, 1, 1, SpielType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpielType_Ergebnis(), theXMLTypePackage.getString(), "ergebnis", null, 1, 1, SpielType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpielType_Kennzeichnung(), theXMLTypePackage.getString(), "kennzeichnung", null, 1, 1, SpielType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpielType_Link(), theXMLTypePackage.getString(), "link", null, 1, 1, SpielType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Spielplan(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "spielplan",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (spielplanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "spielplanType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpielplanType_Spiel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Spiel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (spielTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SpielType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpielType_ID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpielType_Staffelname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Staffelname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpielType_Nr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Nr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpielType_Tag(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Tag",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpielType_Datum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Datum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpielType_Heimmannschaft(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Heimmannschaft",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpielType_Gastmannschaft(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Gastmannschaft",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpielType_Ergebnis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Ergebnis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpielType_Kennzeichnung(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Kennzeichnung",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpielType_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Link",
			 "namespace", "##targetNamespace"
		   });
	}

} //UserSpielePackageImpl
