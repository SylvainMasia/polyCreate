package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Condition;
import fr.univcotedazur.webots.polycreate.LogicalAction;
import fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect;
import fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspect;
import fr.univcotedazur.webots.polycreate.rewritingrules.LogicalActionAspectLogicalActionAspectProperties;
import fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = LogicalAction.class)
@SuppressWarnings("all")
public class LogicalActionAspect extends ActionAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final LogicalAction _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.LogicalActionAspectLogicalActionAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.LogicalActionAspectLogicalActionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.LogicalAction){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.LogicalActionAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.LogicalAction)_self,controler);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "LogicalAction", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final LogicalActionAspectLogicalActionAspectProperties _self_, final LogicalAction _self, final PolyCreateControler controler) {
    EList<Condition> _conditions = _self.getConditions();
    for (final Condition condition : _conditions) {
      boolean _isValid = ConditionAspect.isValid(condition, controler);
      if (_isValid) {
        SequenceAspect.runIt(condition.getAlternativeSequence(), controler);
        return;
      }
    }
  }
}
