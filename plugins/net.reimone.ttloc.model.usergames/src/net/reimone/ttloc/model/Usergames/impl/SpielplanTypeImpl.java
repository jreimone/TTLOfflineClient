/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.Usergames.impl;

import java.util.Collection;

import net.reimone.ttloc.model.Usergames.SpielType;
import net.reimone.ttloc.model.Usergames.SpielplanType;
import net.reimone.ttloc.model.Usergames.usergamesPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spielplan Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielplanTypeImpl#getSpiel <em>Spiel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpielplanTypeImpl extends EObjectImpl implements SpielplanType {
	/**
	 * The cached value of the '{@link #getSpiel() <em>Spiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpiel()
	 * @generated
	 * @ordered
	 */
	protected EList spiel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpielplanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return usergamesPackage.Literals.SPIELPLAN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSpiel() {
		if (spiel == null) {
			spiel = new EObjectContainmentEList(SpielType.class, this, usergamesPackage.SPIELPLAN_TYPE__SPIEL);
		}
		return spiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case usergamesPackage.SPIELPLAN_TYPE__SPIEL:
				return ((InternalEList)getSpiel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case usergamesPackage.SPIELPLAN_TYPE__SPIEL:
				return getSpiel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case usergamesPackage.SPIELPLAN_TYPE__SPIEL:
				getSpiel().clear();
				getSpiel().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case usergamesPackage.SPIELPLAN_TYPE__SPIEL:
				getSpiel().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case usergamesPackage.SPIELPLAN_TYPE__SPIEL:
				return spiel != null && !spiel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpielplanTypeImpl
