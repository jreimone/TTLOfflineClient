/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.Usergames;

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
 *   <li>{@link net.reimone.ttloc.model.Usergames.SpielplanType#getSpiel <em>Spiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.reimone.ttloc.model.Usergames.usergamesPackage#getSpielplanType()
 * @model extendedMetaData="name='spielplanType' kind='elementOnly'"
 * @generated
 */
public interface SpielplanType extends EObject {
	/**
	 * Returns the value of the '<em><b>Spiel</b></em>' containment reference list.
	 * The list contents are of type {@link net.reimone.ttloc.model.Usergames.SpielType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spiel</em>' containment reference list.
	 * @see net.reimone.ttloc.model.Usergames.usergamesPackage#getSpielplanType_Spiel()
	 * @model type="net.reimone.ttloc.model.Usergames.SpielType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Spiel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getSpiel();

} // SpielplanType
