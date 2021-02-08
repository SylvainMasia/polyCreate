/**
 */
package fr.univcotedazur.webots.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.webots.polycreate.AlternativeSequence#getNextSequence <em>Next Sequence</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getAlternativeSequence()
 * @model
 * @generated
 */
public interface AlternativeSequence extends Sequence {
	/**
	 * Returns the value of the '<em><b>Next Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Sequence</em>' reference.
	 * @see #setNextSequence(Sequence)
	 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getAlternativeSequence_NextSequence()
	 * @model required="true"
	 * @generated
	 */
	Sequence getNextSequence();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.webots.polycreate.AlternativeSequence#getNextSequence <em>Next Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Sequence</em>' reference.
	 * @see #getNextSequence()
	 * @generated
	 */
	void setNextSequence(Sequence value);

} // AlternativeSequence
