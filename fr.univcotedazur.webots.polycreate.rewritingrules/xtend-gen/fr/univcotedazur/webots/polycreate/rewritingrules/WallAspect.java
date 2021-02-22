package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Wall;
import fr.univcotedazur.webots.polycreate.rewritingrules.WallAspectWallAspectProperties;

@Aspect(className = Wall.class)
@SuppressWarnings("all")
public abstract class WallAspect {
  @Step
  @Abstract
  public static boolean isValid(final Wall _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.WallAspectWallAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.WallAspectWallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isValid(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.Wall){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.univcotedazur.webots.polycreate.rewritingrules.WallAspect._privk3_isValid(_self_, (fr.univcotedazur.webots.polycreate.Wall)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "Wall", "isValid");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_isValid(final WallAspectWallAspectProperties _self_, final Wall _self, final PolyCreateControler controler) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
