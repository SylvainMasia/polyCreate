package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.WallLeft;
import fr.univcotedazur.webots.polycreate.rewritingrules.WallAspect;
import fr.univcotedazur.webots.polycreate.rewritingrules.WallLeftAspectWallLeftAspectProperties;

@Aspect(className = WallLeft.class)
@SuppressWarnings("all")
public class WallLeftAspect extends WallAspect {
  @Step
  @ReplaceAspectMethod
  public static boolean isValid(final WallLeft _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.WallLeftAspectWallLeftAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.WallLeftAspectWallLeftAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isValid(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.WallLeft){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.univcotedazur.webots.polycreate.rewritingrules.WallLeftAspect._privk3_isValid(_self_, (fr.univcotedazur.webots.polycreate.WallLeft)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "WallLeft", "isValid");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_isValid(final WallLeftAspectWallLeftAspectProperties _self_, final WallLeft _self, final PolyCreateControler controler) {
    return controler.isThereCollisionAtLeft();
  }
}
