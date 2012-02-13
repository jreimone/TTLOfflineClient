/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.UserSpiele;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spielplan Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.SpielplanType#getSpiel <em>Spiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielplanType()
 * @model extendedMetaData="name='spielplanType' kind='elementOnly'"
 * @generated
 */
public interface SpielplanType extends EObject {
	/**
	 * Returns the value of the '<em><b>Spiel</b></em>' containment reference list.
	 * The list contents are of type {@link net.reimone.ttloc.model.UserSpiele.SpielType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spiel</em>' containment reference list.
	 * @see net.reimone.ttloc.model.UserSpiele.UserSpielePackage#getSpielplanType_Spiel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Spiel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpielType> getSpiel();

} // SpielplanType
