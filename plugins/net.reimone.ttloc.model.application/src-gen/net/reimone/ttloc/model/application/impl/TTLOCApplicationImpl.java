/**
 */
package net.reimone.ttloc.model.application.impl;

import net.reimone.ttloc.model.application.ApplicationPackage;
import net.reimone.ttloc.model.application.TTLOCApplication;
import net.reimone.ttloc.model.application.User;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTLOC Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.reimone.ttloc.model.application.impl.TTLOCApplicationImpl#getUser <em>User</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.application.impl.TTLOCApplicationImpl#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.application.impl.TTLOCApplicationImpl#getGamesOfUserURL <em>Games Of User URL</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.application.impl.TTLOCApplicationImpl#getGameReportURL <em>Game Report URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TTLOCApplicationImpl extends EObjectImpl implements TTLOCApplication {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The default value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected String baseURL = BASE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGamesOfUserURL() <em>Games Of User URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamesOfUserURL()
	 * @generated
	 * @ordered
	 */
	protected static final String GAMES_OF_USER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGamesOfUserURL() <em>Games Of User URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamesOfUserURL()
	 * @generated
	 * @ordered
	 */
	protected String gamesOfUserURL = GAMES_OF_USER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGameReportURL() <em>Game Report URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameReportURL()
	 * @generated
	 * @ordered
	 */
	protected static final String GAME_REPORT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGameReportURL() <em>Game Report URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameReportURL()
	 * @generated
	 * @ordered
	 */
	protected String gameReportURL = GAME_REPORT_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTLOCApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.TTLOC_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.TTLOC_APPLICATION__USER, oldUser, newUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.TTLOC_APPLICATION__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.TTLOC_APPLICATION__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TTLOC_APPLICATION__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURL() {
		return baseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURL(String newBaseURL) {
		String oldBaseURL = baseURL;
		baseURL = newBaseURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TTLOC_APPLICATION__BASE_URL, oldBaseURL, baseURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGamesOfUserURL() {
		return gamesOfUserURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamesOfUserURL(String newGamesOfUserURL) {
		String oldGamesOfUserURL = gamesOfUserURL;
		gamesOfUserURL = newGamesOfUserURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TTLOC_APPLICATION__GAMES_OF_USER_URL, oldGamesOfUserURL, gamesOfUserURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGameReportURL() {
		return gameReportURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameReportURL(String newGameReportURL) {
		String oldGameReportURL = gameReportURL;
		gameReportURL = newGameReportURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.TTLOC_APPLICATION__GAME_REPORT_URL, oldGameReportURL, gameReportURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.TTLOC_APPLICATION__USER:
				return basicSetUser(null, msgs);
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
			case ApplicationPackage.TTLOC_APPLICATION__USER:
				return getUser();
			case ApplicationPackage.TTLOC_APPLICATION__BASE_URL:
				return getBaseURL();
			case ApplicationPackage.TTLOC_APPLICATION__GAMES_OF_USER_URL:
				return getGamesOfUserURL();
			case ApplicationPackage.TTLOC_APPLICATION__GAME_REPORT_URL:
				return getGameReportURL();
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
			case ApplicationPackage.TTLOC_APPLICATION__USER:
				setUser((User)newValue);
				return;
			case ApplicationPackage.TTLOC_APPLICATION__BASE_URL:
				setBaseURL((String)newValue);
				return;
			case ApplicationPackage.TTLOC_APPLICATION__GAMES_OF_USER_URL:
				setGamesOfUserURL((String)newValue);
				return;
			case ApplicationPackage.TTLOC_APPLICATION__GAME_REPORT_URL:
				setGameReportURL((String)newValue);
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
			case ApplicationPackage.TTLOC_APPLICATION__USER:
				setUser((User)null);
				return;
			case ApplicationPackage.TTLOC_APPLICATION__BASE_URL:
				setBaseURL(BASE_URL_EDEFAULT);
				return;
			case ApplicationPackage.TTLOC_APPLICATION__GAMES_OF_USER_URL:
				setGamesOfUserURL(GAMES_OF_USER_URL_EDEFAULT);
				return;
			case ApplicationPackage.TTLOC_APPLICATION__GAME_REPORT_URL:
				setGameReportURL(GAME_REPORT_URL_EDEFAULT);
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
			case ApplicationPackage.TTLOC_APPLICATION__USER:
				return user != null;
			case ApplicationPackage.TTLOC_APPLICATION__BASE_URL:
				return BASE_URL_EDEFAULT == null ? baseURL != null : !BASE_URL_EDEFAULT.equals(baseURL);
			case ApplicationPackage.TTLOC_APPLICATION__GAMES_OF_USER_URL:
				return GAMES_OF_USER_URL_EDEFAULT == null ? gamesOfUserURL != null : !GAMES_OF_USER_URL_EDEFAULT.equals(gamesOfUserURL);
			case ApplicationPackage.TTLOC_APPLICATION__GAME_REPORT_URL:
				return GAME_REPORT_URL_EDEFAULT == null ? gameReportURL != null : !GAME_REPORT_URL_EDEFAULT.equals(gameReportURL);
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
		result.append(" (baseURL: ");
		result.append(baseURL);
		result.append(", gamesOfUserURL: ");
		result.append(gamesOfUserURL);
		result.append(", gameReportURL: ");
		result.append(gameReportURL);
		result.append(')');
		return result.toString();
	}

} //TTLOCApplicationImpl
