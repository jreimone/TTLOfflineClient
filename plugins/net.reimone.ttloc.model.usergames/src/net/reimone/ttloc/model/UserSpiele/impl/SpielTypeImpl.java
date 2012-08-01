/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.UserSpiele.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import net.reimone.ttloc.model.UserSpiele.SpielType;
import net.reimone.ttloc.model.UserSpiele.UserSpielePackage;

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
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielTypeImpl#getStaffelname <em>Staffelname</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielTypeImpl#getNr <em>Nr</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielTypeImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielTypeImpl#getDatum <em>Datum</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielTypeImpl#getHeimmannschaft <em>Heimmannschaft</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielTypeImpl#getGastmannschaft <em>Gastmannschaft</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielTypeImpl#getErgebnis <em>Ergebnis</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielTypeImpl#getKennzeichnung <em>Kennzeichnung</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.UserSpiele.impl.SpielTypeImpl#getZeit <em>Zeit</em>}</li>
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
	protected static final String NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNr() <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNr()
	 * @generated
	 * @ordered
	 */
	protected String nr = NR_EDEFAULT;

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
	protected static final XMLGregorianCalendar DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatum() <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar datum = DATUM_EDEFAULT;

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
	 * The default value of the '{@link #getZeit() <em>Zeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeit()
	 * @generated
	 * @ordered
	 */
	protected static final String ZEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeit() <em>Zeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeit()
	 * @generated
	 * @ordered
	 */
	protected String zeit = ZEIT_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return UserSpielePackage.Literals.SPIEL_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserSpielePackage.SPIEL_TYPE__ID, oldID, iD, !oldIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, UserSpielePackage.SPIEL_TYPE__ID, oldID, ID_EDEFAULT, oldIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserSpielePackage.SPIEL_TYPE__STAFFELNAME, oldStaffelname, staffelname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNr() {
		return nr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNr(String newNr) {
		String oldNr = nr;
		nr = newNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserSpielePackage.SPIEL_TYPE__NR, oldNr, nr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserSpielePackage.SPIEL_TYPE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDatum() {
		return datum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatum(XMLGregorianCalendar newDatum) {
		XMLGregorianCalendar oldDatum = datum;
		datum = newDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserSpielePackage.SPIEL_TYPE__DATUM, oldDatum, datum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserSpielePackage.SPIEL_TYPE__HEIMMANNSCHAFT, oldHeimmannschaft, heimmannschaft));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserSpielePackage.SPIEL_TYPE__GASTMANNSCHAFT, oldGastmannschaft, gastmannschaft));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserSpielePackage.SPIEL_TYPE__ERGEBNIS, oldErgebnis, ergebnis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserSpielePackage.SPIEL_TYPE__KENNZEICHNUNG, oldKennzeichnung, kennzeichnung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserSpielePackage.SPIEL_TYPE__LINK, oldLink, link));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZeit() {
		return zeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZeit(String newZeit) {
		String oldZeit = zeit;
		zeit = newZeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserSpielePackage.SPIEL_TYPE__ZEIT, oldZeit, zeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserSpielePackage.SPIEL_TYPE__ID:
				return getID();
			case UserSpielePackage.SPIEL_TYPE__STAFFELNAME:
				return getStaffelname();
			case UserSpielePackage.SPIEL_TYPE__NR:
				return getNr();
			case UserSpielePackage.SPIEL_TYPE__TAG:
				return getTag();
			case UserSpielePackage.SPIEL_TYPE__DATUM:
				return getDatum();
			case UserSpielePackage.SPIEL_TYPE__HEIMMANNSCHAFT:
				return getHeimmannschaft();
			case UserSpielePackage.SPIEL_TYPE__GASTMANNSCHAFT:
				return getGastmannschaft();
			case UserSpielePackage.SPIEL_TYPE__ERGEBNIS:
				return getErgebnis();
			case UserSpielePackage.SPIEL_TYPE__KENNZEICHNUNG:
				return getKennzeichnung();
			case UserSpielePackage.SPIEL_TYPE__LINK:
				return getLink();
			case UserSpielePackage.SPIEL_TYPE__ZEIT:
				return getZeit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UserSpielePackage.SPIEL_TYPE__ID:
				setID((Integer)newValue);
				return;
			case UserSpielePackage.SPIEL_TYPE__STAFFELNAME:
				setStaffelname((String)newValue);
				return;
			case UserSpielePackage.SPIEL_TYPE__NR:
				setNr((String)newValue);
				return;
			case UserSpielePackage.SPIEL_TYPE__TAG:
				setTag((String)newValue);
				return;
			case UserSpielePackage.SPIEL_TYPE__DATUM:
				setDatum((XMLGregorianCalendar)newValue);
				return;
			case UserSpielePackage.SPIEL_TYPE__HEIMMANNSCHAFT:
				setHeimmannschaft((String)newValue);
				return;
			case UserSpielePackage.SPIEL_TYPE__GASTMANNSCHAFT:
				setGastmannschaft((String)newValue);
				return;
			case UserSpielePackage.SPIEL_TYPE__ERGEBNIS:
				setErgebnis((String)newValue);
				return;
			case UserSpielePackage.SPIEL_TYPE__KENNZEICHNUNG:
				setKennzeichnung((String)newValue);
				return;
			case UserSpielePackage.SPIEL_TYPE__LINK:
				setLink((String)newValue);
				return;
			case UserSpielePackage.SPIEL_TYPE__ZEIT:
				setZeit((String)newValue);
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
			case UserSpielePackage.SPIEL_TYPE__ID:
				unsetID();
				return;
			case UserSpielePackage.SPIEL_TYPE__STAFFELNAME:
				setStaffelname(STAFFELNAME_EDEFAULT);
				return;
			case UserSpielePackage.SPIEL_TYPE__NR:
				setNr(NR_EDEFAULT);
				return;
			case UserSpielePackage.SPIEL_TYPE__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case UserSpielePackage.SPIEL_TYPE__DATUM:
				setDatum(DATUM_EDEFAULT);
				return;
			case UserSpielePackage.SPIEL_TYPE__HEIMMANNSCHAFT:
				setHeimmannschaft(HEIMMANNSCHAFT_EDEFAULT);
				return;
			case UserSpielePackage.SPIEL_TYPE__GASTMANNSCHAFT:
				setGastmannschaft(GASTMANNSCHAFT_EDEFAULT);
				return;
			case UserSpielePackage.SPIEL_TYPE__ERGEBNIS:
				setErgebnis(ERGEBNIS_EDEFAULT);
				return;
			case UserSpielePackage.SPIEL_TYPE__KENNZEICHNUNG:
				setKennzeichnung(KENNZEICHNUNG_EDEFAULT);
				return;
			case UserSpielePackage.SPIEL_TYPE__LINK:
				setLink(LINK_EDEFAULT);
				return;
			case UserSpielePackage.SPIEL_TYPE__ZEIT:
				setZeit(ZEIT_EDEFAULT);
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
			case UserSpielePackage.SPIEL_TYPE__ID:
				return isSetID();
			case UserSpielePackage.SPIEL_TYPE__STAFFELNAME:
				return STAFFELNAME_EDEFAULT == null ? staffelname != null : !STAFFELNAME_EDEFAULT.equals(staffelname);
			case UserSpielePackage.SPIEL_TYPE__NR:
				return NR_EDEFAULT == null ? nr != null : !NR_EDEFAULT.equals(nr);
			case UserSpielePackage.SPIEL_TYPE__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case UserSpielePackage.SPIEL_TYPE__DATUM:
				return DATUM_EDEFAULT == null ? datum != null : !DATUM_EDEFAULT.equals(datum);
			case UserSpielePackage.SPIEL_TYPE__HEIMMANNSCHAFT:
				return HEIMMANNSCHAFT_EDEFAULT == null ? heimmannschaft != null : !HEIMMANNSCHAFT_EDEFAULT.equals(heimmannschaft);
			case UserSpielePackage.SPIEL_TYPE__GASTMANNSCHAFT:
				return GASTMANNSCHAFT_EDEFAULT == null ? gastmannschaft != null : !GASTMANNSCHAFT_EDEFAULT.equals(gastmannschaft);
			case UserSpielePackage.SPIEL_TYPE__ERGEBNIS:
				return ERGEBNIS_EDEFAULT == null ? ergebnis != null : !ERGEBNIS_EDEFAULT.equals(ergebnis);
			case UserSpielePackage.SPIEL_TYPE__KENNZEICHNUNG:
				return KENNZEICHNUNG_EDEFAULT == null ? kennzeichnung != null : !KENNZEICHNUNG_EDEFAULT.equals(kennzeichnung);
			case UserSpielePackage.SPIEL_TYPE__LINK:
				return LINK_EDEFAULT == null ? link != null : !LINK_EDEFAULT.equals(link);
			case UserSpielePackage.SPIEL_TYPE__ZEIT:
				return ZEIT_EDEFAULT == null ? zeit != null : !ZEIT_EDEFAULT.equals(zeit);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (iD: ");
		if (iDESet) result.append(iD); else result.append("<unset>");
		result.append(", staffelname: ");
		result.append(staffelname);
		result.append(", nr: ");
		result.append(nr);
		result.append(", tag: ");
		result.append(tag);
		result.append(", datum: ");
		result.append(datum);
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
		result.append(", zeit: ");
		result.append(zeit);
		result.append(')');
		return result.toString();
	}

} //SpielTypeImpl
