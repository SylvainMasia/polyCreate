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
  public static void runIt(final MoveForward _self, final PolyCreateControler controler, final SensorChecker logicalVerifications, final boolean isAlternative) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(PolyCreateControler,SensorChecker,boolean)
    if (_self instanceof fr.univcotedazur.webots.polycreate.MoveForward){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.MoveForward)_self,controler,logicalVerifications,isAlternative);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler,logicalVerifications,isAlternative}, command, "MoveForward", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final MoveForwardAspectMoveForwardAspectProperties _self_, final MoveForward _self, final PolyCreateControler controler, final SensorChecker logicalVerifications, final boolean isAlternative) {
    int _distance = _self.getDistance();
    String _plus = ("Going forward " + Integer.valueOf(_distance));
    String _plus_1 = (_plus + "cm");
    System.out.println(_plus_1);
    int _distance_1 = _self.getDistance();
    boolean _tripleEquals = (_distance_1 == (-1));
    if (_tripleEquals) {
      while (true) {
        {
          if (((!isAlternative) && SensorCheckerAspect.runIt(logicalVerifications, controler))) {
            return;
          }
          controler.goForward();
          controler.passiveWait((5 * 0.05));
        }
      }
    }
    {
      int i = 0;
      int _distance_2 = _self.getDistance();
      boolean _lessThan = (i < _distance_2);
      boolean _while = _lessThan;
      while (_while) {
        {
          if (((!isAlternative) && SensorCheckerAspect.runIt(logicalVerifications, controler))) {
            return;
          }
          controler.goForward();
          int _distance_3 = _self.getDistance();
          int _minus = (_distance_3 - i);
          boolean _lessThan_1 = (_minus < 5);
          if (_lessThan_1) {
            int _distance_4 = _self.getDistance();
            int _minus_1 = (_distance_4 - i);
            String _plus_2 = ("On passe ici : " + Integer.valueOf(_minus_1));
            System.out.println(_plus_2);
            int _distance_5 = _self.getDistance();
            int _minus_2 = (_distance_5 - i);
            double _multiply = (_minus_2 * 0.05);
            controler.passiveWait(_multiply);
          } else {
            controler.passiveWait((5 * 0.05));
          }
        }
        int _i = i;
        i = (_i + 5);
        int _distance_3 = _self.getDistance();
        boolean _lessThan_1 = (i < _distance_3);
        _while = _lessThan_1;
      }
    }
    controler.stop();
  }
}
