package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.MoveBackward;
import fr.univcotedazur.webots.polycreate.SensorChecker;
import fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect;
import fr.univcotedazur.webots.polycreate.rewritingrules.MoveBackwardAspectMoveBackwardAspectProperties;
import fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspect;

@Aspect(className = MoveBackward.class)
@SuppressWarnings("all")
public class MoveBackwardAspect extends ActionAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final MoveBackward _self, final PolyCreateControler controler, final SensorChecker logicalVerifications, final boolean isAlternative) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.MoveBackwardAspectMoveBackwardAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.MoveBackwardAspectMoveBackwardAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(PolyCreateControler,SensorChecker,boolean)
    if (_self instanceof fr.univcotedazur.webots.polycreate.MoveBackward){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.MoveBackwardAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.MoveBackward)_self,controler,logicalVerifications,isAlternative);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler,logicalVerifications,isAlternative}, command, "MoveBackward", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_runIt(final MoveBackwardAspectMoveBackwardAspectProperties _self_, final MoveBackward _self, final PolyCreateControler controler, final SensorChecker logicalVerifications, final boolean isAlternative) {
    int _distance = _self.getDistance();
    String _plus = ("Going backward " + Integer.valueOf(_distance));
    String _plus_1 = (_plus + "cm");
    System.out.println(_plus_1);
    {
      int i = 0;
      int _distance_1 = _self.getDistance();
      boolean _lessThan = (i < _distance_1);
      boolean _while = _lessThan;
      while (_while) {
        {
          if (((!isAlternative) && SensorCheckerAspect.runIt(logicalVerifications, controler))) {
            return;
          }
          controler.goBackward();
          int _distance_2 = _self.getDistance();
          int _minus = (_distance_2 - i);
          boolean _lessThan_1 = (_minus < 5);
          if (_lessThan_1) {
            int _distance_3 = _self.getDistance();
            int _minus_1 = (_distance_3 - i);
            String _plus_2 = ("On passe ici : " + Integer.valueOf(_minus_1));
            System.out.println(_plus_2);
            int _distance_4 = _self.getDistance();
            int _minus_2 = (_distance_4 - i);
            double _multiply = (_minus_2 * 0.1);
            controler.passiveWait(_multiply);
          } else {
            controler.passiveWait((5 * 0.1));
          }
        }
        int _i = i;
        i = (_i + 5);
        int _distance_2 = _self.getDistance();
        boolean _lessThan_1 = (i < _distance_2);
        _while = _lessThan_1;
      }
    }
    controler.stop();
  }
}
