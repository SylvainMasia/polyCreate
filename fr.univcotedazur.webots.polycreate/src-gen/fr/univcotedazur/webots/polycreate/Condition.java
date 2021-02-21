/**
 */
package fr.univcotedazur.webots.polycreate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.webots.polycreate.Condition#getAlternativeSequence <em>Alternative Sequence</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {

	/**
	 * Returns the value of the '<em><b>Alternative Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Sequence</em>' containment reference.
	 * @see #setAlternativeSequence(AlternativeSequence)
	 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getCondition_AlternativeSequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AlternativeSequence getAlternativeSequence();

	/**
	 * Sets the value of the '{@link fr.univcotedazur.webots.polycreate.Condition#getAlternativeSequence <em>Alternative Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Sequence</em>' containment reference.
	 * @see #getAlternativeSequence()
	 * @generated
	 */
	void setAlternativeSequence(AlternativeSequence value);
} // Condition
