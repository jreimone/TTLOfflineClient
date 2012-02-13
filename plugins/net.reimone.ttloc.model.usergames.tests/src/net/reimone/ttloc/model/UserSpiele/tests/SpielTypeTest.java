/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.UserSpiele.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.reimone.ttloc.model.UserSpiele.SpielType;
import net.reimone.ttloc.model.UserSpiele.UserSpieleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Spiel Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpielTypeTest extends TestCase {

	/**
	 * The fixture for this Spiel Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpielType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpielTypeTest.class);
	}

	/**
	 * Constructs a new Spiel Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpielTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Spiel Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SpielType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Spiel Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpielType getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UserSpieleFactory.eINSTANCE.createSpielType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SpielTypeTest
