package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Condition;
import fr.univcotedazur.webots.polycreate.SensorChecker;
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
  
  protected static boolean _privk3_runIt(final SensorCheckerAspectSensorCheckerAspectProperties _self_, final SensorChecker _self, final PolyCreateControler controler) {
    EList<Condition> _conditions = _self.getConditions();
    for (final Condition condition : _conditions) {
      boolean _isValid = ConditionAspect.isValid(condition, controler);
      if (_isValid) {
        SequenceAspect.runIt(condition.getAlternativeSequence(), controler, _self);
        return true;
      }
    }
    return false;
  }
}
