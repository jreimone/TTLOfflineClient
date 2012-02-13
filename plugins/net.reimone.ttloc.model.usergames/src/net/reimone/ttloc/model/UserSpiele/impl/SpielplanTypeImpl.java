/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.UserSpiele.impl;

import java.util.Collection;

import net.reimone.ttloc.model.UserSpiele.SpielType;
import net.reimone.ttloc.model.UserSpiele.SpielplanType;
import net.reimone.ttloc.model.UserSpiele.UserSpielePackage;

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
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielplanTypeImpl#getSpiel <em>Spiel</em>}</li>
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
	protected EList<SpielType> spiel;

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
	@Override
	protected EClass eStaticClass() {
		return UserSpielePackage.Literals.SPIELPLAN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpielType> getSpiel() {
		if (spiel == null) {
			spiel = new EObjectContainmentEList<SpielType>(SpielType.class, this, UserSpielePackage.SPIELPLAN_TYPE__SPIEL);
		}
		return spiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UserSpielePackage.SPIELPLAN_TYPE__SPIEL:
				return ((InternalEList<?>)getSpiel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserSpielePackage.SPIELPLAN_TYPE__SPIEL:
				return getSpiel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UserSpielePackage.SPIELPLAN_TYPE__SPIEL:
				getSpiel().clear();
				getSpiel().addAll((Collection<? extends SpielType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UserSpielePackage.SPIELPLAN_TYPE__SPIEL:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UserSpielePackage.SPIELPLAN_TYPE__SPIEL:
				return spiel != null && !spiel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpielplanTypeImpl
