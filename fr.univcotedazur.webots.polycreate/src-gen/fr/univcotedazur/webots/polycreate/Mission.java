/**
 */
package fr.univcotedazur.webots.polycreate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.webots.polycreate.Mission#getSequences <em>Sequences</em>}</li>
 *   <li>{@link fr.univcotedazur.webots.polycreate.Mission#getTime <em>Time</em>}</li>
 *   <li>{@link fr.univcotedazur.webots.polycreate.Mission#getSensorChecker <em>Sensor Checker</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.webots.polycreate.Sequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getMission_Sequences()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sequence> getSequences();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getMission_Time()
	 * @model default="0"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.webots.polycreate.Mission#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Sensor Checker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor Checker</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Checker</em>' containment reference.
	 * @see #setSensorChecker(SensorChecker)
	 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getMission_SensorChecker()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SensorChecker getSensorChecker();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.webots.polycreate.Mission#getSensorChecker <em>Sensor Checker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Checker</em>' containment reference.
	 * @see #getSensorChecker()
	 * @generated
	 */
	void setSensorChecker(SensorChecker value);

} // Mission
