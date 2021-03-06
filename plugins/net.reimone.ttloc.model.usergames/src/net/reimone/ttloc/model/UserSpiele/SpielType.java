/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.UserSpiele;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spiel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielType#getID <em>ID</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielType#getStaffelname <em>Staffelname</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielType#getNr <em>Nr</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielType#getTag <em>Tag</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielType#getDatum <em>Datum</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielType#getHeimmannschaft <em>Heimmannschaft</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielType#getGastmannschaft <em>Gastmannschaft</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielType#getErgebnis <em>Ergebnis</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielType#getKennzeichnung <em>Kennzeichnung</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielType#getLink <em>Link</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielType#getZeit <em>Zeit</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType()
 * @model extendedMetaData="name='SpielType' kind='elementOnly'"
 * @generated
 */
public interface SpielType extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(int)
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType_ID()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Unsets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(int)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(int)
	 * @generated
	 */
	boolean isSetID();

	/**
	 * Returns the value of the '<em><b>Staffelname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staffelname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staffelname</em>' attribute.
	 * @see #setStaffelname(String)
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType_Staffelname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Staffelname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStaffelname();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getStaffelname <em>Staffelname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staffelname</em>' attribute.
	 * @see #getStaffelname()
	 * @generated
	 */
	void setStaffelname(String value);

	/**
	 * Returns the value of the '<em><b>Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr</em>' attribute.
	 * @see #setNr(String)
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType_Nr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Nr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNr();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getNr <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr</em>' attribute.
	 * @see #getNr()
	 * @generated
	 */
	void setNr(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Tag' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datum</em>' attribute.
	 * @see #setDatum(XMLGregorianCalendar)
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType_Datum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='Datum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDatum();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getDatum <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum</em>' attribute.
	 * @see #getDatum()
	 * @generated
	 */
	void setDatum(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Heimmannschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heimmannschaft</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heimmannschaft</em>' attribute.
	 * @see #setHeimmannschaft(String)
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType_Heimmannschaft()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Heimmannschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHeimmannschaft();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getHeimmannschaft <em>Heimmannschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heimmannschaft</em>' attribute.
	 * @see #getHeimmannschaft()
	 * @generated
	 */
	void setHeimmannschaft(String value);

	/**
	 * Returns the value of the '<em><b>Gastmannschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gastmannschaft</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gastmannschaft</em>' attribute.
	 * @see #setGastmannschaft(String)
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType_Gastmannschaft()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Gastmannschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGastmannschaft();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getGastmannschaft <em>Gastmannschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gastmannschaft</em>' attribute.
	 * @see #getGastmannschaft()
	 * @generated
	 */
	void setGastmannschaft(String value);

	/**
	 * Returns the value of the '<em><b>Ergebnis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ergebnis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ergebnis</em>' attribute.
	 * @see #setErgebnis(String)
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType_Ergebnis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Ergebnis' namespace='##targetNamespace'"
	 * @generated
	 */
	String getErgebnis();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getErgebnis <em>Ergebnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ergebnis</em>' attribute.
	 * @see #getErgebnis()
	 * @generated
	 */
	void setErgebnis(String value);

	/**
	 * Returns the value of the '<em><b>Kennzeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kennzeichnung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kennzeichnung</em>' attribute.
	 * @see #setKennzeichnung(String)
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType_Kennzeichnung()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Kennzeichnung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKennzeichnung();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getKennzeichnung <em>Kennzeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennzeichnung</em>' attribute.
	 * @see #getKennzeichnung()
	 * @generated
	 */
	void setKennzeichnung(String value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType_Link()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Link' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

	/**
	 * Returns the value of the '<em><b>Zeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zeit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zeit</em>' attribute.
	 * @see #setZeit(String)
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielType_Zeit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Zeit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZeit();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.UserSpiele.SpielType#getZeit <em>Zeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeit</em>' attribute.
	 * @see #getZeit()
	 * @generated
	 */
	void setZeit(String value);

} // SpielType
