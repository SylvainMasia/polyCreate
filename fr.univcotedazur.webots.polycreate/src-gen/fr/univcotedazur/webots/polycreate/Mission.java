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

} // Mission
