package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Condition;
import fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspectConditionAspectProperties;

@Aspect(className = Condition.class)
@SuppressWarnings("all")
public abstract class ConditionAspect {
  @Step
  @ReplaceAspectMethod
  @Abstract
  public static boolean isValid(final Condition _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspectConditionAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspectConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isValid(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.Condition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspect._privk3_isValid(_self_, (fr.univcotedazur.webots.polycreate.Condition)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "Condition", "isValid");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_isValid(final ConditionAspectConditionAspectProperties _self_, final Condition _self, final PolyCreateControler controler) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
