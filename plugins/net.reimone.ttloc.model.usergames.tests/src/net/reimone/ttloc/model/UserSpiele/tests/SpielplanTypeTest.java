/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.reimone.ttloc.model.UserSpiele.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.reimone.ttloc.model.UserSpiele.SpielplanType;
import net.reimone.ttloc.model.UserSpiele.UserSpieleFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Spielplan Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpielplanTypeTest extends TestCase {

	/**
	 * The fixture for this Spielplan Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpielplanType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SpielplanTypeTest.class);
	}

	/**
	 * Constructs a new Spielplan Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpielplanTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Spielplan Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SpielplanType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Spielplan Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpielplanType getFixture() {
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
		setFixture(UserSpieleFactory.eINSTANCE.createSpielplanType());
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

} //SpielplanTypeTest
