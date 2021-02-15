/**
 */
package fr.univcotedazur.webots.polycreate.impl;

import fr.univcotedazur.webots.polycreate.Action;
import fr.univcotedazur.webots.polycreate.AlternativeSequence;
import fr.univcotedazur.webots.polycreate.Condition;
import fr.univcotedazur.webots.polycreate.Grab;
import fr.univcotedazur.webots.polycreate.LogicalAction;
import fr.univcotedazur.webots.polycreate.Mission;
import fr.univcotedazur.webots.polycreate.MoveForward;
import fr.univcotedazur.webots.polycreate.PhysicalAction;
import fr.univcotedazur.webots.polycreate.PolycreateFactory;
import fr.univcotedazur.webots.polycreate.PolycreatePackage;
import fr.univcotedazur.webots.polycreate.Release;
import fr.univcotedazur.webots.polycreate.Rotate;
import fr.univcotedazur.webots.polycreate.Sequence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolycreatePackageImpl extends EPackageImpl implements PolycreatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveForwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.univcotedazur.webots.polycreate.PolycreatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolycreatePackageImpl() {
		super(eNS_URI, PolycreateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PolycreatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolycreatePackage init() {
		if (isInited)
			return (PolycreatePackage) EPackage.Registry.INSTANCE.getEPackage(PolycreatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPolycreatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PolycreatePackageImpl thePolycreatePackage = registeredPolycreatePackage instanceof PolycreatePackageImpl
				? (PolycreatePackageImpl) registeredPolycreatePackage
				: new PolycreatePackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePolycreatePackage.createPackageContents();

		// Initialize created meta-data
		thePolycreatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolycreatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolycreatePackage.eNS_URI, thePolycreatePackage);
		return thePolycreatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMission() {
		return missionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_Sequences() {
		return (EReference) missionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Actions() {
		return (EReference) sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequence__RunIt() {
		return sequenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__RunIt() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalAction() {
		return physicalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalAction() {
		return logicalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalAction_Conditions() {
		return (EReference) logicalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_AlternativeSequence() {
		return (EReference) conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCondition__IsValid() {
		return conditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCondition__RunIt() {
		return conditionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeSequence() {
		return alternativeSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeSequence_NextSequence() {
		return (EReference) alternativeSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotate() {
		return rotateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotate_Degrees() {
		return (EAttribute) rotateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveForward() {
		return moveForwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveForward_Distance() {
		return (EAttribute) moveForwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrab() {
		return grabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelease() {
		return releaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateFactory getPolycreateFactory() {
		return (PolycreateFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		missionEClass = createEClass(MISSION);
		createEReference(missionEClass, MISSION__SEQUENCES);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__ACTIONS);
		createEOperation(sequenceEClass, SEQUENCE___RUN_IT);

		actionEClass = createEClass(ACTION);
		createEOperation(actionEClass, ACTION___RUN_IT);

		physicalActionEClass = createEClass(PHYSICAL_ACTION);

		logicalActionEClass = createEClass(LOGICAL_ACTION);
		createEReference(logicalActionEClass, LOGICAL_ACTION__CONDITIONS);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__ALTERNATIVE_SEQUENCE);
		createEOperation(conditionEClass, CONDITION___IS_VALID);
		createEOperation(conditionEClass, CONDITION___RUN_IT);

		alternativeSequenceEClass = createEClass(ALTERNATIVE_SEQUENCE);
		createEReference(alternativeSequenceEClass, ALTERNATIVE_SEQUENCE__NEXT_SEQUENCE);

		rotateEClass = createEClass(ROTATE);
		createEAttribute(rotateEClass, ROTATE__DEGREES);

		moveForwardEClass = createEClass(MOVE_FORWARD);
		createEAttribute(moveForwardEClass, MOVE_FORWARD__DISTANCE);

		grabEClass = createEClass(GRAB);

		releaseEClass = createEClass(RELEASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		physicalActionEClass.getESuperTypes().add(this.getAction());
		logicalActionEClass.getESuperTypes().add(this.getAction());
		alternativeSequenceEClass.getESuperTypes().add(this.getSequence());
		rotateEClass.getESuperTypes().add(this.getPhysicalAction());
		moveForwardEClass.getESuperTypes().add(this.getPhysicalAction());
		grabEClass.getESuperTypes().add(this.getPhysicalAction());
		releaseEClass.getESuperTypes().add(this.getPhysicalAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMission_Sequences(), this.getSequence(), null, "sequences", null, 1, -1, Mission.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_Actions(), this.getAction(), null, "actions", null, 1, -1, Sequence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSequence__RunIt(), null, "runIt", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAction__RunIt(), null, "runIt", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(physicalActionEClass, PhysicalAction.class, "PhysicalAction", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalActionEClass, LogicalAction.class, "LogicalAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalAction_Conditions(), this.getCondition(), null, "conditions", null, 1, -1,
				LogicalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_AlternativeSequence(), this.getAlternativeSequence(), null, "alternativeSequence",
				null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCondition__IsValid(), null, "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCondition__RunIt(), null, "runIt", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(alternativeSequenceEClass, AlternativeSequence.class, "AlternativeSequence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternativeSequence_NextSequence(), this.getSequence(), null, "nextSequence", null, 1, 1,
				AlternativeSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotateEClass, Rotate.class, "Rotate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotate_Degrees(), ecorePackage.getEInt(), "degrees", "90", 0, 1, Rotate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveForwardEClass, MoveForward.class, "MoveForward", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveForward_Distance(), ecorePackage.getEInt(), "distance", "5", 0, 1, MoveForward.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grabEClass, Grab.class, "Grab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PolycreatePackageImpl
