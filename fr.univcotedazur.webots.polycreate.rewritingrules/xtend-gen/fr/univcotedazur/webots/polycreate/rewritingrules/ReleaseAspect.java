package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Release;
import fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspect;
import fr.univcotedazur.webots.polycreate.rewritingrules.ReleaseAspectReleaseAspectProperties;

@Aspect(className = Release.class)
@SuppressWarnings("all")
public class ReleaseAspect extends PhysicalActionAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final Release _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.ReleaseAspectReleaseAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.ReleaseAspectReleaseAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.Release){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.ReleaseAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.Release)_self,controler);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "Release", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final ReleaseAspectReleaseAspectProperties _self_, final Release _self, final PolyCreateControler controler) {
    System.out.println("Grabing object");
    controler.openGripper();
    controler.passiveWait(0.5);
  }
}
