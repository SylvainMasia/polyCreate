package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Action;
import fr.univcotedazur.webots.polycreate.SensorChecker;
import fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public abstract class ActionAspect {
  @Step
  @Abstract
  public static void runIt(final Action _self, final PolyCreateControler controler, final SensorChecker logicalVerifications) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspectActionAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspectActionAspectContext.getSelf(_self);
    	// BeginInjectInto fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect#void runIt(PolyCreateControler,SensorChecker) from fr.univcotedazur.webots.polycreate.rewritingrules.ReleaseAspect
    		if (_self instanceof fr.univcotedazur.webots.polycreate.Release){
    			fr.univcotedazur.webots.polycreate.rewritingrules.ReleaseAspect.runIt((fr.univcotedazur.webots.polycreate.Release)_self,controler,logicalVerifications);
    		} else
    		// EndInjectInto fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect#void runIt(PolyCreateControler,SensorChecker) from fr.univcotedazur.webots.polycreate.rewritingrules.ReleaseAspect
    	// BeginInjectInto fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect#void runIt(PolyCreateControler,SensorChecker) from fr.univcotedazur.webots.polycreate.rewritingrules.MoveBackwardAspect
    		if (_self instanceof fr.univcotedazur.webots.polycreate.MoveBackward){
    			fr.univcotedazur.webots.polycreate.rewritingrules.MoveBackwardAspect.runIt((fr.univcotedazur.webots.polycreate.MoveBackward)_self,controler,logicalVerifications);
    		} else
    		// EndInjectInto fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect#void runIt(PolyCreateControler,SensorChecker) from fr.univcotedazur.webots.polycreate.rewritingrules.MoveBackwardAspect
    	// BeginInjectInto fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect#void runIt(PolyCreateControler,SensorChecker) from fr.univcotedazur.webots.polycreate.rewritingrules.RotateAspect
    		if (_self instanceof fr.univcotedazur.webots.polycreate.Rotate){
    			fr.univcotedazur.webots.polycreate.rewritingrules.RotateAspect.runIt((fr.univcotedazur.webots.polycreate.Rotate)_self,controler,logicalVerifications);
    		} else
    		// EndInjectInto fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect#void runIt(PolyCreateControler,SensorChecker) from fr.univcotedazur.webots.polycreate.rewritingrules.RotateAspect
    	// BeginInjectInto fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect#void runIt(PolyCreateControler,SensorChecker) from fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspect
    		if (_self instanceof fr.univcotedazur.webots.polycreate.MoveForward){
    			fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspect.runIt((fr.univcotedazur.webots.polycreate.MoveForward)_self,controler,logicalVerifications);
    		} else
    		// EndInjectInto fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect#void runIt(PolyCreateControler,SensorChecker) from fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspect
    	// BeginInjectInto fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect#void runIt(PolyCreateControler,SensorChecker) from fr.univcotedazur.webots.polycreate.rewritingrules.GrabAspect
    		if (_self instanceof fr.univcotedazur.webots.polycreate.Grab){
    			fr.univcotedazur.webots.polycreate.rewritingrules.GrabAspect.runIt((fr.univcotedazur.webots.polycreate.Grab)_self,controler,logicalVerifications);
    		} else
    		// EndInjectInto fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect#void runIt(PolyCreateControler,SensorChecker) from fr.univcotedazur.webots.polycreate.rewritingrules.GrabAspect
    // #DispatchPointCut_before# void runIt(PolyCreateControler,SensorChecker)
    if (_self instanceof fr.univcotedazur.webots.polycreate.Action){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.Action)_self,controler,logicalVerifications);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler,logicalVerifications}, command, "Action", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final ActionAspectActionAspectProperties _self_, final Action _self, final PolyCreateControler controler, final SensorChecker logicalVerifications) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
