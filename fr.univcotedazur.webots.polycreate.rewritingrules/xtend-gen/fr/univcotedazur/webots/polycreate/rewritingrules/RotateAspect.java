package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Rotate;
import fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspect;
import fr.univcotedazur.webots.polycreate.rewritingrules.RotateAspectRotateAspectProperties;

@Aspect(className = Rotate.class)
@SuppressWarnings("all")
public class RotateAspect extends PhysicalActionAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final Rotate _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.RotateAspectRotateAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.RotateAspectRotateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.Rotate){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.RotateAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.Rotate)_self,controler);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "Rotate", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final RotateAspectRotateAspectProperties _self_, final Rotate _self, final PolyCreateControler controler) {
    int _degrees = _self.getDegrees();
    float _divide = (((float) _degrees) / 100);
    final double robotDegrees = (_divide * 2.3);
    System.out.println((("Turning " + Double.valueOf(robotDegrees)) + " degrees"));
    controler.turn(robotDegrees);
    controler.passiveWait((robotDegrees / 2.5));
  }
}
