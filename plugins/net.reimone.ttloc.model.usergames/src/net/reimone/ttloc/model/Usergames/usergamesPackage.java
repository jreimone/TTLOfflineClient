/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.Usergames;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.reimone.ttloc.model.Usergames.usergamesFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface usergamesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Usergames";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/net.reimone.ttloc.model.usergames/metamodel/usergames.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Usergames";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	usergamesPackage eINSTANCE = net.reimone.ttloc.model.Usergames.impl.usergamesPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.reimone.ttloc.model.Usergames.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.reimone.ttloc.model.Usergames.impl.DocumentRootImpl
	 * @see net.reimone.ttloc.model.Usergames.impl.usergamesPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Spielplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPIELPLAN = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.reimone.ttloc.model.Usergames.impl.SpielplanTypeImpl <em>Spielplan Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.reimone.ttloc.model.Usergames.impl.SpielplanTypeImpl
	 * @see net.reimone.ttloc.model.Usergames.impl.usergamesPackageImpl#getSpielplanType()
	 * @generated
	 */
	int SPIELPLAN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Spiel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIELPLAN_TYPE__SPIEL = 0;

	/**
	 * The number of structural features of the '<em>Spielplan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIELPLAN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl <em>Spiel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl
	 * @see net.reimone.ttloc.model.Usergames.impl.usergamesPackageImpl#getSpielType()
	 * @generated
	 */
	int SPIEL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Staffelname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE__STAFFELNAME = 1;

	/**
	 * The feature id for the '<em><b>Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE__NR = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE__TAG = 3;

	/**
	 * The feature id for the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE__DATUM = 4;

	/**
	 * The feature id for the '<em><b>Zeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE__ZEIT = 5;

	/**
	 * The feature id for the '<em><b>Heimmannschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE__HEIMMANNSCHAFT = 6;

	/**
	 * The feature id for the '<em><b>Gastmannschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE__GASTMANNSCHAFT = 7;

	/**
	 * The feature id for the '<em><b>Ergebnis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE__ERGEBNIS = 8;

	/**
	 * The feature id for the '<em><b>Kennzeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE__KENNZEICHNUNG = 9;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE__LINK = 10;

	/**
	 * The number of structural features of the '<em>Spiel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIEL_TYPE_FEATURE_COUNT = 11;


	/**
	 * Returns the meta object for class '{@link net.reimone.ttloc.model.Usergames.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.reimone.ttloc.model.Usergames.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.reimone.ttloc.model.Usergames.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.reimone.ttloc.model.Usergames.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.reimone.ttloc.model.Usergames.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.reimone.ttloc.model.Usergames.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.reimone.ttloc.model.Usergames.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.reimone.ttloc.model.Usergames.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.reimone.ttloc.model.Usergames.DocumentRoot#getSpielplan <em>Spielplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spielplan</em>'.
	 * @see net.reimone.ttloc.model.Usergames.DocumentRoot#getSpielplan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Spielplan();

	/**
	 * Returns the meta object for class '{@link net.reimone.ttloc.model.Usergames.SpielplanType <em>Spielplan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spielplan Type</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielplanType
	 * @generated
	 */
	EClass getSpielplanType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.reimone.ttloc.model.Usergames.SpielplanType#getSpiel <em>Spiel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spiel</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielplanType#getSpiel()
	 * @see #getSpielplanType()
	 * @generated
	 */
	EReference getSpielplanType_Spiel();

	/**
	 * Returns the meta object for class '{@link net.reimone.ttloc.model.Usergames.SpielType <em>Spiel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spiel Type</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType
	 * @generated
	 */
	EClass getSpielType();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.Usergames.SpielType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType#getID()
	 * @see #getSpielType()
	 * @generated
	 */
	EAttribute getSpielType_ID();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.Usergames.SpielType#getStaffelname <em>Staffelname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staffelname</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType#getStaffelname()
	 * @see #getSpielType()
	 * @generated
	 */
	EAttribute getSpielType_Staffelname();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.Usergames.SpielType#getNr <em>Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nr</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType#getNr()
	 * @see #getSpielType()
	 * @generated
	 */
	EAttribute getSpielType_Nr();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.Usergames.SpielType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType#getTag()
	 * @see #getSpielType()
	 * @generated
	 */
	EAttribute getSpielType_Tag();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.Usergames.SpielType#getDatum <em>Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datum</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType#getDatum()
	 * @see #getSpielType()
	 * @generated
	 */
	EAttribute getSpielType_Datum();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.Usergames.SpielType#getZeit <em>Zeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeit</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType#getZeit()
	 * @see #getSpielType()
	 * @generated
	 */
	EAttribute getSpielType_Zeit();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.Usergames.SpielType#getHeimmannschaft <em>Heimmannschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heimmannschaft</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType#getHeimmannschaft()
	 * @see #getSpielType()
	 * @generated
	 */
	EAttribute getSpielType_Heimmannschaft();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.Usergames.SpielType#getGastmannschaft <em>Gastmannschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gastmannschaft</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType#getGastmannschaft()
	 * @see #getSpielType()
	 * @generated
	 */
	EAttribute getSpielType_Gastmannschaft();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.Usergames.SpielType#getErgebnis <em>Ergebnis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ergebnis</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType#getErgebnis()
	 * @see #getSpielType()
	 * @generated
	 */
	EAttribute getSpielType_Ergebnis();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.Usergames.SpielType#getKennzeichnung <em>Kennzeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennzeichnung</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType#getKennzeichnung()
	 * @see #getSpielType()
	 * @generated
	 */
	EAttribute getSpielType_Kennzeichnung();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.Usergames.SpielType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see net.reimone.ttloc.model.Usergames.SpielType#getLink()
	 * @see #getSpielType()
	 * @generated
	 */
	EAttribute getSpielType_Link();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	usergamesFactory getusergamesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.reimone.ttloc.model.Usergames.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.reimone.ttloc.model.Usergames.impl.DocumentRootImpl
		 * @see net.reimone.ttloc.model.Usergames.impl.usergamesPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Spielplan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPIELPLAN = eINSTANCE.getDocumentRoot_Spielplan();

		/**
		 * The meta object literal for the '{@link net.reimone.ttloc.model.Usergames.impl.SpielplanTypeImpl <em>Spielplan Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.reimone.ttloc.model.Usergames.impl.SpielplanTypeImpl
		 * @see net.reimone.ttloc.model.Usergames.impl.usergamesPackageImpl#getSpielplanType()
		 * @generated
		 */
		EClass SPIELPLAN_TYPE = eINSTANCE.getSpielplanType();

		/**
		 * The meta object literal for the '<em><b>Spiel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPIELPLAN_TYPE__SPIEL = eINSTANCE.getSpielplanType_Spiel();

		/**
		 * The meta object literal for the '{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl <em>Spiel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl
		 * @see net.reimone.ttloc.model.Usergames.impl.usergamesPackageImpl#getSpielType()
		 * @generated
		 */
		EClass SPIEL_TYPE = eINSTANCE.getSpielType();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPIEL_TYPE__ID = eINSTANCE.getSpielType_ID();

		/**
		 * The meta object literal for the '<em><b>Staffelname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPIEL_TYPE__STAFFELNAME = eINSTANCE.getSpielType_Staffelname();

		/**
		 * The meta object literal for the '<em><b>Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPIEL_TYPE__NR = eINSTANCE.getSpielType_Nr();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPIEL_TYPE__TAG = eINSTANCE.getSpielType_Tag();

		/**
		 * The meta object literal for the '<em><b>Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPIEL_TYPE__DATUM = eINSTANCE.getSpielType_Datum();

		/**
		 * The meta object literal for the '<em><b>Zeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPIEL_TYPE__ZEIT = eINSTANCE.getSpielType_Zeit();

		/**
		 * The meta object literal for the '<em><b>Heimmannschaft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPIEL_TYPE__HEIMMANNSCHAFT = eINSTANCE.getSpielType_Heimmannschaft();

		/**
		 * The meta object literal for the '<em><b>Gastmannschaft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPIEL_TYPE__GASTMANNSCHAFT = eINSTANCE.getSpielType_Gastmannschaft();

		/**
		 * The meta object literal for the '<em><b>Ergebnis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPIEL_TYPE__ERGEBNIS = eINSTANCE.getSpielType_Ergebnis();

		/**
		 * The meta object literal for the '<em><b>Kennzeichnung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPIEL_TYPE__KENNZEICHNUNG = eINSTANCE.getSpielType_Kennzeichnung();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPIEL_TYPE__LINK = eINSTANCE.getSpielType_Link();

	}

} //usergamesPackage
