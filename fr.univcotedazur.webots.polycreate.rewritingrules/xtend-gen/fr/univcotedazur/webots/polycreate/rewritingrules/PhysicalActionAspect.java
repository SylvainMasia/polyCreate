package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.PhysicalAction;
import fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspectPhysicalActionAspectProperties;

@Aspect(className = PhysicalAction.class)
@SuppressWarnings("all")
public abstract class PhysicalActionAspect {
  @Step
  @ReplaceAspectMethod
  @Abstract
  public static void runIt(final PhysicalAction _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspectPhysicalActionAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspectPhysicalActionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.PhysicalAction){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.PhysicalAction)_self,controler);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "PhysicalAction", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final PhysicalActionAspectPhysicalActionAspectProperties _self_, final PhysicalAction _self, final PolyCreateControler controler) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
