package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Action;
import fr.univcotedazur.webots.polycreate.SensorChecker;
import fr.univcotedazur.webots.polycreate.Sequence;
import fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect;
import fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectProperties;

@Aspect(className = Sequence.class)
@SuppressWarnings("all")
public class SequenceAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final Sequence _self, final PolyCreateControler controler, final SensorChecker logicalVerifications) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(PolyCreateControler,SensorChecker)
    if (_self instanceof fr.univcotedazur.webots.polycreate.Sequence){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.Sequence)_self,controler,logicalVerifications);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler,logicalVerifications}, command, "Sequence", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self, final PolyCreateControler controler, final SensorChecker logicalVerifications) {
    System.out.println("Running sequence");
    for (int i = 0; (i < _self.getActions().size()); i++) {
      {
        final Action action = _self.getActions().get(i);
        ActionAspect.runIt(action, controler, logicalVerifications);
      }
    }
  }
}
