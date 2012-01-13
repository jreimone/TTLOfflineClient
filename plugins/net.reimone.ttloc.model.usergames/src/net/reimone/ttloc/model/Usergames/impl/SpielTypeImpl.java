/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.Usergames.impl;

import net.reimone.ttloc.model.Usergames.SpielType;
import net.reimone.ttloc.model.Usergames.usergamesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spiel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl#getStaffelname <em>Staffelname</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl#getNr <em>Nr</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl#getDatum <em>Datum</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl#getZeit <em>Zeit</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl#getHeimmannschaft <em>Heimmannschaft</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl#getGastmannschaft <em>Gastmannschaft</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl#getErgebnis <em>Ergebnis</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl#getKennzeichnung <em>Kennzeichnung</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.Usergames.impl.SpielTypeImpl#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpielTypeImpl extends EObjectImpl implements SpielType {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int iD = ID_EDEFAULT;

	/**
	 * This is true if the ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDESet;

	/**
	 * The default value of the '{@link #getStaffelname() <em>Staffelname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffelname()
	 * @generated
	 * @ordered
	 */
	protected static final String STAFFELNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaffelname() <em>Staffelname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffelname()
	 * @generated
	 * @ordered
	 */
	protected String staffelname = STAFFELNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNr() <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNr()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNr() <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNr()
	 * @generated
	 * @ordered
	 */
	protected int nr = NR_EDEFAULT;

	/**
	 * This is true if the Nr attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nrESet;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatum() <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatum() <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected Object datum = DATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeit() <em>Zeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeit()
	 * @generated
	 * @ordered
	 */
	protected static final Object ZEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeit() <em>Zeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeit()
	 * @generated
	 * @ordered
	 */
	protected Object zeit = ZEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeimmannschaft() <em>Heimmannschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeimmannschaft()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIMMANNSCHAFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeimmannschaft() <em>Heimmannschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeimmannschaft()
	 * @generated
	 * @ordered
	 */
	protected String heimmannschaft = HEIMMANNSCHAFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGastmannschaft() <em>Gastmannschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGastmannschaft()
	 * @generated
	 * @ordered
	 */
	protected static final String GASTMANNSCHAFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGastmannschaft() <em>Gastmannschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGastmannschaft()
	 * @generated
	 * @ordered
	 */
	protected String gastmannschaft = GASTMANNSCHAFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getErgebnis() <em>Ergebnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErgebnis()
	 * @generated
	 * @ordered
	 */
	protected static final String ERGEBNIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErgebnis() <em>Ergebnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErgebnis()
	 * @generated
	 * @ordered
	 */
	protected String ergebnis = ERGEBNIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getKennzeichnung() <em>Kennzeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennzeichnung()
	 * @generated
	 * @ordered
	 */
	protected static final String KENNZEICHNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKennzeichnung() <em>Kennzeichnung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennzeichnung()
	 * @generated
	 * @ordered
	 */
	protected String kennzeichnung = KENNZEICHNUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected String link = LINK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpielTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return usergamesPackage.Literals.SPIEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = iD;
		iD = newID;
		boolean oldIDESet = iDESet;
		iDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, usergamesPackage.SPIEL_TYPE__ID, oldID, iD, !oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetID() {
		int oldID = iD;
		boolean oldIDESet = iDESet;
		iD = ID_EDEFAULT;
		iDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, usergamesPackage.SPIEL_TYPE__ID, oldID, ID_EDEFAULT, oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetID() {
		return iDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaffelname() {
		return staffelname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffelname(String newStaffelname) {
		String oldStaffelname = staffelname;
		staffelname = newStaffelname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, usergamesPackage.SPIEL_TYPE__STAFFELNAME, oldStaffelname, staffelname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNr() {
		return nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNr(int newNr) {
		int oldNr = nr;
		nr = newNr;
		boolean oldNrESet = nrESet;
		nrESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, usergamesPackage.SPIEL_TYPE__NR, oldNr, nr, !oldNrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNr() {
		int oldNr = nr;
		boolean oldNrESet = nrESet;
		nr = NR_EDEFAULT;
		nrESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, usergamesPackage.SPIEL_TYPE__NR, oldNr, NR_EDEFAULT, oldNrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNr() {
		return nrESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, usergamesPackage.SPIEL_TYPE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDatum() {
		return datum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatum(Object newDatum) {
		Object oldDatum = datum;
		datum = newDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, usergamesPackage.SPIEL_TYPE__DATUM, oldDatum, datum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getZeit() {
		return zeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZeit(Object newZeit) {
		Object oldZeit = zeit;
		zeit = newZeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, usergamesPackage.SPIEL_TYPE__ZEIT, oldZeit, zeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeimmannschaft() {
		return heimmannschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeimmannschaft(String newHeimmannschaft) {
		String oldHeimmannschaft = heimmannschaft;
		heimmannschaft = newHeimmannschaft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, usergamesPackage.SPIEL_TYPE__HEIMMANNSCHAFT, oldHeimmannschaft, heimmannschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGastmannschaft() {
		return gastmannschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGastmannschaft(String newGastmannschaft) {
		String oldGastmannschaft = gastmannschaft;
		gastmannschaft = newGastmannschaft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, usergamesPackage.SPIEL_TYPE__GASTMANNSCHAFT, oldGastmannschaft, gastmannschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErgebnis() {
		return ergebnis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErgebnis(String newErgebnis) {
		String oldErgebnis = ergebnis;
		ergebnis = newErgebnis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, usergamesPackage.SPIEL_TYPE__ERGEBNIS, oldErgebnis, ergebnis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKennzeichnung() {
		return kennzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKennzeichnung(String newKennzeichnung) {
		String oldKennzeichnung = kennzeichnung;
		kennzeichnung = newKennzeichnung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, usergamesPackage.SPIEL_TYPE__KENNZEICHNUNG, oldKennzeichnung, kennzeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(String newLink) {
		String oldLink = link;
		link = newLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, usergamesPackage.SPIEL_TYPE__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case usergamesPackage.SPIEL_TYPE__ID:
				return new Integer(getID());
			case usergamesPackage.SPIEL_TYPE__STAFFELNAME:
				return getStaffelname();
			case usergamesPackage.SPIEL_TYPE__NR:
				return new Integer(getNr());
			case usergamesPackage.SPIEL_TYPE__TAG:
				return getTag();
			case usergamesPackage.SPIEL_TYPE__DATUM:
				return getDatum();
			case usergamesPackage.SPIEL_TYPE__ZEIT:
				return getZeit();
			case usergamesPackage.SPIEL_TYPE__HEIMMANNSCHAFT:
				return getHeimmannschaft();
			case usergamesPackage.SPIEL_TYPE__GASTMANNSCHAFT:
				return getGastmannschaft();
			case usergamesPackage.SPIEL_TYPE__ERGEBNIS:
				return getErgebnis();
			case usergamesPackage.SPIEL_TYPE__KENNZEICHNUNG:
				return getKennzeichnung();
			case usergamesPackage.SPIEL_TYPE__LINK:
				return getLink();
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
			case usergamesPackage.SPIEL_TYPE__ID:
				setID(((Integer)newValue).intValue());
				return;
			case usergamesPackage.SPIEL_TYPE__STAFFELNAME:
				setStaffelname((String)newValue);
				return;
			case usergamesPackage.SPIEL_TYPE__NR:
				setNr(((Integer)newValue).intValue());
				return;
			case usergamesPackage.SPIEL_TYPE__TAG:
				setTag((String)newValue);
				return;
			case usergamesPackage.SPIEL_TYPE__DATUM:
				setDatum(newValue);
				return;
			case usergamesPackage.SPIEL_TYPE__ZEIT:
				setZeit(newValue);
				return;
			case usergamesPackage.SPIEL_TYPE__HEIMMANNSCHAFT:
				setHeimmannschaft((String)newValue);
				return;
			case usergamesPackage.SPIEL_TYPE__GASTMANNSCHAFT:
				setGastmannschaft((String)newValue);
				return;
			case usergamesPackage.SPIEL_TYPE__ERGEBNIS:
				setErgebnis((String)newValue);
				return;
			case usergamesPackage.SPIEL_TYPE__KENNZEICHNUNG:
				setKennzeichnung((String)newValue);
				return;
			case usergamesPackage.SPIEL_TYPE__LINK:
				setLink((String)newValue);
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
			case usergamesPackage.SPIEL_TYPE__ID:
				unsetID();
				return;
			case usergamesPackage.SPIEL_TYPE__STAFFELNAME:
				setStaffelname(STAFFELNAME_EDEFAULT);
				return;
			case usergamesPackage.SPIEL_TYPE__NR:
				unsetNr();
				return;
			case usergamesPackage.SPIEL_TYPE__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case usergamesPackage.SPIEL_TYPE__DATUM:
				setDatum(DATUM_EDEFAULT);
				return;
			case usergamesPackage.SPIEL_TYPE__ZEIT:
				setZeit(ZEIT_EDEFAULT);
				return;
			case usergamesPackage.SPIEL_TYPE__HEIMMANNSCHAFT:
				setHeimmannschaft(HEIMMANNSCHAFT_EDEFAULT);
				return;
			case usergamesPackage.SPIEL_TYPE__GASTMANNSCHAFT:
				setGastmannschaft(GASTMANNSCHAFT_EDEFAULT);
				return;
			case usergamesPackage.SPIEL_TYPE__ERGEBNIS:
				setErgebnis(ERGEBNIS_EDEFAULT);
				return;
			case usergamesPackage.SPIEL_TYPE__KENNZEICHNUNG:
				setKennzeichnung(KENNZEICHNUNG_EDEFAULT);
				return;
			case usergamesPackage.SPIEL_TYPE__LINK:
				setLink(LINK_EDEFAULT);
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
			case usergamesPackage.SPIEL_TYPE__ID:
				return isSetID();
			case usergamesPackage.SPIEL_TYPE__STAFFELNAME:
				return STAFFELNAME_EDEFAULT == null ? staffelname != null : !STAFFELNAME_EDEFAULT.equals(staffelname);
			case usergamesPackage.SPIEL_TYPE__NR:
				return isSetNr();
			case usergamesPackage.SPIEL_TYPE__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case usergamesPackage.SPIEL_TYPE__DATUM:
				return DATUM_EDEFAULT == null ? datum != null : !DATUM_EDEFAULT.equals(datum);
			case usergamesPackage.SPIEL_TYPE__ZEIT:
				return ZEIT_EDEFAULT == null ? zeit != null : !ZEIT_EDEFAULT.equals(zeit);
			case usergamesPackage.SPIEL_TYPE__HEIMMANNSCHAFT:
				return HEIMMANNSCHAFT_EDEFAULT == null ? heimmannschaft != null : !HEIMMANNSCHAFT_EDEFAULT.equals(heimmannschaft);
			case usergamesPackage.SPIEL_TYPE__GASTMANNSCHAFT:
				return GASTMANNSCHAFT_EDEFAULT == null ? gastmannschaft != null : !GASTMANNSCHAFT_EDEFAULT.equals(gastmannschaft);
			case usergamesPackage.SPIEL_TYPE__ERGEBNIS:
				return ERGEBNIS_EDEFAULT == null ? ergebnis != null : !ERGEBNIS_EDEFAULT.equals(ergebnis);
			case usergamesPackage.SPIEL_TYPE__KENNZEICHNUNG:
				return KENNZEICHNUNG_EDEFAULT == null ? kennzeichnung != null : !KENNZEICHNUNG_EDEFAULT.equals(kennzeichnung);
			case usergamesPackage.SPIEL_TYPE__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (iD: ");
		if (iDESet) result.append(iD); else result.append("<unset>");
		result.append(", staffelname: ");
		result.append(staffelname);
		result.append(", nr: ");
		if (nrESet) result.append(nr); else result.append("<unset>");
		result.append(", tag: ");
		result.append(tag);
		result.append(", datum: ");
		result.append(datum);
		result.append(", zeit: ");
		result.append(zeit);
		result.append(", heimmannschaft: ");
		result.append(heimmannschaft);
		result.append(", gastmannschaft: ");
		result.append(gastmannschaft);
		result.append(", ergebnis: ");
		result.append(ergebnis);
		result.append(", kennzeichnung: ");
		result.append(kennzeichnung);
		result.append(", link: ");
		result.append(link);
		result.append(')');
		return result.toString();
	}

} //SpielTypeImpl
