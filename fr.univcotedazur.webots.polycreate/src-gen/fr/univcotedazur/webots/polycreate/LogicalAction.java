/**
 */
package fr.univcotedazur.webots.polycreate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.webots.polycreate.LogicalAction#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getLogicalAction()
 * @model
 * @generated
 */
public interface LogicalAction extends Action {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazur.webots.polycreate.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#getLogicalAction_Conditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getConditions();

} // LogicalAction
