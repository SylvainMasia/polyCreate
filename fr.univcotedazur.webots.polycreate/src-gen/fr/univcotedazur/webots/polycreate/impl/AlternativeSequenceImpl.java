/**
 */
package fr.univcotedazur.webots.polycreate.impl;

import fr.univcotedazur.webots.polycreate.AlternativeSequence;
import fr.univcotedazur.webots.polycreate.PolycreatePackage;
import fr.univcotedazur.webots.polycreate.Sequence;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.webots.polycreate.impl.AlternativeSequenceImpl#getNextSequence <em>Next Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternativeSequenceImpl extends SequenceImpl implements AlternativeSequence {
	/**
	 * The cached value of the '{@link #getNextSequence() <em>Next Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence nextSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolycreatePackage.Literals.ALTERNATIVE_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getNextSequence() {
		if (nextSequence != null && nextSequence.eIsProxy()) {
			InternalEObject oldNextSequence = (InternalEObject) nextSequence;
			nextSequence = (Sequence) eResolveProxy(oldNextSequence);
			if (nextSequence != oldNextSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PolycreatePackage.ALTERNATIVE_SEQUENCE__NEXT_SEQUENCE, oldNextSequence, nextSequence));
			}
		}
		return nextSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence basicGetNextSequence() {
		return nextSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextSequence(Sequence newNextSequence) {
		Sequence oldNextSequence = nextSequence;
		nextSequence = newNextSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.ALTERNATIVE_SEQUENCE__NEXT_SEQUENCE,
					oldNextSequence, nextSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolycreatePackage.ALTERNATIVE_SEQUENCE__NEXT_SEQUENCE:
			if (resolve)
				return getNextSequence();
			return basicGetNextSequence();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PolycreatePackage.ALTERNATIVE_SEQUENCE__NEXT_SEQUENCE:
			setNextSequence((Sequence) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PolycreatePackage.ALTERNATIVE_SEQUENCE__NEXT_SEQUENCE:
			setNextSequence((Sequence) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PolycreatePackage.ALTERNATIVE_SEQUENCE__NEXT_SEQUENCE:
			return nextSequence != null;
		}
		return super.eIsSet(featureID);
	}

} //AlternativeSequenceImpl
