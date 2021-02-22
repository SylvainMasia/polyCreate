package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.WallRight;
import fr.univcotedazur.webots.polycreate.rewritingrules.WallAspect;
import fr.univcotedazur.webots.polycreate.rewritingrules.WallRightAspectWallRightAspectProperties;

@Aspect(className = WallRight.class)
@SuppressWarnings("all")
public class WallRightAspect extends WallAspect {
  @Step
  @ReplaceAspectMethod
  public static boolean isValid(final WallRight _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.WallRightAspectWallRightAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.WallRightAspectWallRightAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isValid(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.WallRight){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.univcotedazur.webots.polycreate.rewritingrules.WallRightAspect._privk3_isValid(_self_, (fr.univcotedazur.webots.polycreate.WallRight)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "WallRight", "isValid");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_isValid(final WallRightAspectWallRightAspectProperties _self_, final WallRight _self, final PolyCreateControler controler) {
    boolean _isThereCollisionAtRight = controler.isThereCollisionAtRight();
    if (_isThereCollisionAtRight) {
      System.out.println("Une collision se fait à droite");
    }
    return controler.isThereCollisionAtRight();
  }
}
