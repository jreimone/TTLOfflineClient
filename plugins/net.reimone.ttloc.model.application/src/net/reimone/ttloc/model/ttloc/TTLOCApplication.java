/**
 */
package net.reimone.ttloc.model.ttloc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTLOC Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getUser <em>User</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getGamesOfUserURL <em>Games Of User URL</em>}</li>
 *   <li>{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getGameReportURL <em>Game Report URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.reimone.ttloc.model.ttloc.TtlocPackage#getTTLOCApplication()
 * @model
 * @generated
 */
public interface TTLOCApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link net.reimone.ttloc.model.ttloc.User#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(User)
	 * @see net.reimone.ttloc.model.ttloc.TtlocPackage#getTTLOCApplication_User()
	 * @see net.reimone.ttloc.model.ttloc.User#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URL</em>' attribute.
	 * @see #setBaseURL(String)
	 * @see net.reimone.ttloc.model.ttloc.TtlocPackage#getTTLOCApplication_BaseURL()
	 * @model required="true"
	 * @generated
	 */
	String getBaseURL();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getBaseURL <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URL</em>' attribute.
	 * @see #getBaseURL()
	 * @generated
	 */
	void setBaseURL(String value);

	/**
	 * Returns the value of the '<em><b>Games Of User URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Games Of User URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games Of User URL</em>' attribute.
	 * @see #setGamesOfUserURL(String)
	 * @see net.reimone.ttloc.model.ttloc.TtlocPackage#getTTLOCApplication_GamesOfUserURL()
	 * @model required="true"
	 * @generated
	 */
	String getGamesOfUserURL();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getGamesOfUserURL <em>Games Of User URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Games Of User URL</em>' attribute.
	 * @see #getGamesOfUserURL()
	 * @generated
	 */
	void setGamesOfUserURL(String value);

	/**
	 * Returns the value of the '<em><b>Game Report URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Report URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Report URL</em>' attribute.
	 * @see #setGameReportURL(String)
	 * @see net.reimone.ttloc.model.ttloc.TtlocPackage#getTTLOCApplication_GameReportURL()
	 * @model required="true"
	 * @generated
	 */
	String getGameReportURL();

	/**
	 * Sets the value of the '{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getGameReportURL <em>Game Report URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Report URL</em>' attribute.
	 * @see #getGameReportURL()
	 * @generated
	 */
	void setGameReportURL(String value);

} // TTLOCApplication
