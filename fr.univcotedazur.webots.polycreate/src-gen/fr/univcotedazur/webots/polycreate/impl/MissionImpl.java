/**
 */
package fr.univcotedazur.webots.polycreate.impl;

import fr.univcotedazur.webots.polycreate.Mission;
import fr.univcotedazur.webots.polycreate.PolycreatePackage;
import fr.univcotedazur.webots.polycreate.SensorChecker;
import fr.univcotedazur.webots.polycreate.Sequence;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.webots.polycreate.impl.MissionImpl#getSequences <em>Sequences</em>}</li>
 *   <li>{@link fr.univcotedazur.webots.polycreate.impl.MissionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link fr.univcotedazur.webots.polycreate.impl.MissionImpl#getSensorChecker <em>Sensor Checker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends MinimalEObjectImpl.Container implements Mission {
	/**
	 * The cached value of the '{@link #getSequences() <em>Sequences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<Sequence> sequences;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensorChecker() <em>Sensor Checker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorChecker()
	 * @generated
	 * @ordered
	 */
	protected SensorChecker sensorChecker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolycreatePackage.Literals.MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sequence> getSequences() {
		if (sequences == null) {
			sequences = new EObjectContainmentEList<Sequence>(Sequence.class, this,
					PolycreatePackage.MISSION__SEQUENCES);
		}
		return sequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.MISSION__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorChecker getSensorChecker() {
		return sensorChecker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensorChecker(SensorChecker newSensorChecker, NotificationChain msgs) {
		SensorChecker oldSensorChecker = sensorChecker;
		sensorChecker = newSensorChecker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PolycreatePackage.MISSION__SENSOR_CHECKER, oldSensorChecker, newSensorChecker);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensorChecker(SensorChecker newSensorChecker) {
		if (newSensorChecker != sensorChecker) {
			NotificationChain msgs = null;
			if (sensorChecker != null)
				msgs = ((InternalEObject) sensorChecker).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PolycreatePackage.MISSION__SENSOR_CHECKER, null, msgs);
			if (newSensorChecker != null)
				msgs = ((InternalEObject) newSensorChecker).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PolycreatePackage.MISSION__SENSOR_CHECKER, null, msgs);
			msgs = basicSetSensorChecker(newSensorChecker, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.MISSION__SENSOR_CHECKER,
					newSensorChecker, newSensorChecker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PolycreatePackage.MISSION__SEQUENCES:
			return ((InternalEList<?>) getSequences()).basicRemove(otherEnd, msgs);
		case PolycreatePackage.MISSION__SENSOR_CHECKER:
			return basicSetSensorChecker(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolycreatePackage.MISSION__SEQUENCES:
			return getSequences();
		case PolycreatePackage.MISSION__TIME:
			return getTime();
		case PolycreatePackage.MISSION__SENSOR_CHECKER:
			return getSensorChecker();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PolycreatePackage.MISSION__SEQUENCES:
			getSequences().clear();
			getSequences().addAll((Collection<? extends Sequence>) newValue);
			return;
		case PolycreatePackage.MISSION__TIME:
			setTime((Integer) newValue);
			return;
		case PolycreatePackage.MISSION__SENSOR_CHECKER:
			setSensorChecker((SensorChecker) newValue);
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
		case PolycreatePackage.MISSION__SEQUENCES:
			getSequences().clear();
			return;
		case PolycreatePackage.MISSION__TIME:
			setTime(TIME_EDEFAULT);
			return;
		case PolycreatePackage.MISSION__SENSOR_CHECKER:
			setSensorChecker((SensorChecker) null);
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
		case PolycreatePackage.MISSION__SEQUENCES:
			return sequences != null && !sequences.isEmpty();
		case PolycreatePackage.MISSION__TIME:
			return time != TIME_EDEFAULT;
		case PolycreatePackage.MISSION__SENSOR_CHECKER:
			return sensorChecker != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //MissionImpl
