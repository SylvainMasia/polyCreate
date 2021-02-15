package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.MoveForward;
import fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectProperties;

@Aspect(className = MoveForward.class)
@SuppressWarnings("all")
public class MoveForwardAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final MoveForward _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.MoveForward){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.MoveForward)_self,controler);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "MoveForward", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final MoveForwardAspectMoveForwardAspectProperties _self_, final MoveForward _self, final PolyCreateControler controler) {
    controler.goForward();
    controler.passiveWait(_self.getDistance());
    controler.stop();
  }
}
