/**
 */
package fr.univcotedazur.webots.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Backward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.webots.polycreate.MoveBackward#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getMoveBackward()
 * @model
 * @generated
 */
public interface MoveBackward extends Action {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getMoveBackward_Distance()
	 * @model default="5"
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.webots.polycreate.MoveBackward#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

} // MoveBackward
