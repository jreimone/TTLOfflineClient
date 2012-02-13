/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.usergames.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import net.reimone.ttloc.model.UserSpiele.tests.UserSpieleTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>UserSpiele</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserSpieleAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new UserSpieleAllTests("UserSpiele Tests");
		suite.addTest(UserSpieleTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSpieleAllTests(String name) {
		super(name);
	}

} //UserSpieleAllTests
