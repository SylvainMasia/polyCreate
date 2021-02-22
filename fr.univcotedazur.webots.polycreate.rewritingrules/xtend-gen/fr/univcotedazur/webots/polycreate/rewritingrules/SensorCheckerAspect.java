package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Condition;
import fr.univcotedazur.webots.polycreate.SensorChecker;
import fr.univcotedazur.webots.polycreate.Sequence;
import fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspect;
import fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspectSensorCheckerAspectProperties;
import fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = SensorChecker.class)
@SuppressWarnings("all")
public class SensorCheckerAspect {
  @Step
  @ReplaceAspectMethod
  public static boolean runIt(final SensorChecker _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspectSensorCheckerAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspectSensorCheckerAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean runIt(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.SensorChecker){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.SensorChecker)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "SensorChecker", "runIt");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  private static boolean firstCondition(final SensorChecker _self) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspectSensorCheckerAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspectSensorCheckerAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean firstCondition()
    if (_self instanceof fr.univcotedazur.webots.polycreate.SensorChecker){
    	result = fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspect._privk3_firstCondition(_self_, (fr.univcotedazur.webots.polycreate.SensorChecker)_self);
    };
    return (boolean)result;
  }
  
  private static void firstCondition(final SensorChecker _self, final boolean firstCondition) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspectSensorCheckerAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspectSensorCheckerAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void firstCondition(boolean)
    if (_self instanceof fr.univcotedazur.webots.polycreate.SensorChecker){
    	fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspect._privk3_firstCondition(_self_, (fr.univcotedazur.webots.polycreate.SensorChecker)_self,firstCondition);
    };
  }
  
  protected static boolean _privk3_runIt(final SensorCheckerAspectSensorCheckerAspectProperties _self_, final SensorChecker _self, final PolyCreateControler controler) {
    boolean _firstCondition = SensorCheckerAspect.firstCondition(_self);
    if (_firstCondition) {
      SensorCheckerAspect.firstCondition(_self, false);
      return false;
    }
    EList<Condition> _conditions = _self.getConditions();
    for (final Condition condition : _conditions) {
      boolean _isValid = ConditionAspect.isValid(condition, controler);
      if (_isValid) {
        controler.stop();
        Sequence _alternativeSequence = condition.getAlternativeSequence();
        SequenceAspect.isAlternative(_alternativeSequence, true);
        SequenceAspect.runIt(condition.getAlternativeSequence(), controler, _self);
        return true;
      }
    }
    return false;
  }
  
  protected static boolean _privk3_firstCondition(final SensorCheckerAspectSensorCheckerAspectProperties _self_, final SensorChecker _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isFirstCondition") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.firstCondition;
  }
  
  protected static void _privk3_firstCondition(final SensorCheckerAspectSensorCheckerAspectProperties _self_, final SensorChecker _self, final boolean firstCondition) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setFirstCondition")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, firstCondition);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.firstCondition = firstCondition;
    }
  }
}
