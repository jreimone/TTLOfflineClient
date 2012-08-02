/**
 */
package net.reimone.ttloc.model.ttloc;

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
 * @see net.reimone.ttloc.model.ttloc.TtlocFactory
 * @model kind="package"
 * @generated
 */
public interface TtlocPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ttloc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.reimone.net/ttloc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ttloc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TtlocPackage eINSTANCE = net.reimone.ttloc.model.ttloc.impl.TtlocPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.reimone.ttloc.model.ttloc.impl.TTLOCApplicationImpl <em>TTLOC Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.reimone.ttloc.model.ttloc.impl.TTLOCApplicationImpl
	 * @see net.reimone.ttloc.model.ttloc.impl.TtlocPackageImpl#getTTLOCApplication()
	 * @generated
	 */
	int TTLOC_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLOC_APPLICATION__USER = 0;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLOC_APPLICATION__BASE_URL = 1;

	/**
	 * The feature id for the '<em><b>Games Of User URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLOC_APPLICATION__GAMES_OF_USER_URL = 2;

	/**
	 * The feature id for the '<em><b>Game Report URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLOC_APPLICATION__GAME_REPORT_URL = 3;

	/**
	 * The number of structural features of the '<em>TTLOC Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTLOC_APPLICATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.reimone.ttloc.model.ttloc.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.reimone.ttloc.model.ttloc.impl.UserImpl
	 * @see net.reimone.ttloc.model.ttloc.impl.TtlocPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 2;

	/**
	 * The feature id for the '<em><b>Games</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__GAMES = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link net.reimone.ttloc.model.ttloc.TTLOCApplication <em>TTLOC Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTLOC Application</em>'.
	 * @see net.reimone.ttloc.model.ttloc.TTLOCApplication
	 * @generated
	 */
	EClass getTTLOCApplication();

	/**
	 * Returns the meta object for the containment reference '{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see net.reimone.ttloc.model.ttloc.TTLOCApplication#getUser()
	 * @see #getTTLOCApplication()
	 * @generated
	 */
	EReference getTTLOCApplication_User();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getBaseURL <em>Base URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URL</em>'.
	 * @see net.reimone.ttloc.model.ttloc.TTLOCApplication#getBaseURL()
	 * @see #getTTLOCApplication()
	 * @generated
	 */
	EAttribute getTTLOCApplication_BaseURL();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getGamesOfUserURL <em>Games Of User URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Games Of User URL</em>'.
	 * @see net.reimone.ttloc.model.ttloc.TTLOCApplication#getGamesOfUserURL()
	 * @see #getTTLOCApplication()
	 * @generated
	 */
	EAttribute getTTLOCApplication_GamesOfUserURL();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.ttloc.TTLOCApplication#getGameReportURL <em>Game Report URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Report URL</em>'.
	 * @see net.reimone.ttloc.model.ttloc.TTLOCApplication#getGameReportURL()
	 * @see #getTTLOCApplication()
	 * @generated
	 */
	EAttribute getTTLOCApplication_GameReportURL();

	/**
	 * Returns the meta object for class '{@link net.reimone.ttloc.model.ttloc.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see net.reimone.ttloc.model.ttloc.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.ttloc.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.reimone.ttloc.model.ttloc.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.ttloc.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see net.reimone.ttloc.model.ttloc.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link net.reimone.ttloc.model.ttloc.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.reimone.ttloc.model.ttloc.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the reference list '{@link net.reimone.ttloc.model.ttloc.User#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Games</em>'.
	 * @see net.reimone.ttloc.model.ttloc.User#getGames()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Games();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TtlocFactory getTtlocFactory();

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
		 * The meta object literal for the '{@link net.reimone.ttloc.model.ttloc.impl.TTLOCApplicationImpl <em>TTLOC Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.reimone.ttloc.model.ttloc.impl.TTLOCApplicationImpl
		 * @see net.reimone.ttloc.model.ttloc.impl.TtlocPackageImpl#getTTLOCApplication()
		 * @generated
		 */
		EClass TTLOC_APPLICATION = eINSTANCE.getTTLOCApplication();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTLOC_APPLICATION__USER = eINSTANCE.getTTLOCApplication_User();

		/**
		 * The meta object literal for the '<em><b>Base URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTLOC_APPLICATION__BASE_URL = eINSTANCE.getTTLOCApplication_BaseURL();

		/**
		 * The meta object literal for the '<em><b>Games Of User URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTLOC_APPLICATION__GAMES_OF_USER_URL = eINSTANCE.getTTLOCApplication_GamesOfUserURL();

		/**
		 * The meta object literal for the '<em><b>Game Report URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTLOC_APPLICATION__GAME_REPORT_URL = eINSTANCE.getTTLOCApplication_GameReportURL();

		/**
		 * The meta object literal for the '{@link net.reimone.ttloc.model.ttloc.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.reimone.ttloc.model.ttloc.impl.UserImpl
		 * @see net.reimone.ttloc.model.ttloc.impl.TtlocPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Games</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__GAMES = eINSTANCE.getUser_Games();

	}

} //TtlocPackage
