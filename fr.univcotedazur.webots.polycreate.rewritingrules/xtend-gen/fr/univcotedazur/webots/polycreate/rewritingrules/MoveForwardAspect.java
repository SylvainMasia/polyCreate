package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.MoveForward;
import fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectProperties;
import fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspect;

@Aspect(className = MoveForward.class)
@SuppressWarnings("all")
public class MoveForwardAspect extends PhysicalActionAspect {
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
    int _distance = _self.getDistance();
    String _plus = ("Going forward " + Integer.valueOf(_distance));
    String _plus_1 = (_plus + "cm");
    System.out.println(_plus_1);
    controler.goForward();
    int _distance_1 = _self.getDistance();
    double _multiply = (_distance_1 * 0.05);
    controler.passiveWait(_multiply);
  }
}
