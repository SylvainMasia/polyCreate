/**
 */
package fr.univcotedazur.webots.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.webots.polycreate.Rotate#getDegrees <em>Degrees</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getRotate()
 * @model abstract="true"
 * @generated
 */
public interface Rotate extends PhysicalAction {
	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' attribute.
	 * The default value is <code>"90"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degrees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' attribute.
	 * @see #setDegrees(int)
	 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getRotate_Degrees()
	 * @model default="90"
	 * @generated
	 */
	int getDegrees();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.webots.polycreate.Rotate#getDegrees <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' attribute.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(int value);

} // Rotate
