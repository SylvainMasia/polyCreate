package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.MoveForward;
import fr.univcotedazur.webots.polycreate.SensorChecker;
import fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect;
import fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectProperties;
import fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspect;

@Aspect(className = MoveForward.class)
@SuppressWarnings("all")
public class MoveForwardAspect extends ActionAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final MoveForward _self, final PolyCreateControler controler, final SensorChecker logicalVerifications) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(PolyCreateControler,SensorChecker)
    if (_self instanceof fr.univcotedazur.webots.polycreate.MoveForward){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.MoveForward)_self,controler,logicalVerifications);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler,logicalVerifications}, command, "MoveForward", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final MoveForwardAspectMoveForwardAspectProperties _self_, final MoveForward _self, final PolyCreateControler controler, final SensorChecker logicalVerifications) {
    int i = 0;
    int _distance = _self.getDistance();
    boolean _lessThan = (i < _distance);
    boolean _while = _lessThan;
    while (_while) {
      {
        boolean _runIt = SensorCheckerAspect.runIt(logicalVerifications, controler);
        if (_runIt) {
          controler.stop();
          return;
        }
        controler.goForward();
        controler.passiveWait((5 * 0.05));
      }
      int _i = i;
      i = (_i + 5);
      int _distance_1 = _self.getDistance();
      boolean _lessThan_1 = (i < _distance_1);
      _while = _lessThan_1;
    }
  }
}
