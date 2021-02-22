package fr.univcotedazur.webots.polycreate.rewritingrules;

import com.cyberbotics.webots.controller.CameraRecognitionObject;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.ObjectInFront;
import fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspect;
import fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspectObjectInFrontAspectProperties;

@Aspect(className = ObjectInFront.class)
@SuppressWarnings("all")
public class ObjectInFrontAspect extends ConditionAspect {
  @Step
  @ReplaceAspectMethod
  public static boolean isValid(final ObjectInFront _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspectObjectInFrontAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspectObjectInFrontAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isValid(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.ObjectInFront){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspect._privk3_isValid(_self_, (fr.univcotedazur.webots.polycreate.ObjectInFront)_self,controler));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "ObjectInFront", "isValid");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_isValid(final ObjectInFrontAspectObjectInFrontAspectProperties _self_, final ObjectInFront _self, final PolyCreateControler controler) {
    CameraRecognitionObject[] frontObjs = controler.frontCamera.getCameraRecognitionObjects();
    int _length = frontObjs.length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      final CameraRecognitionObject obj = frontObjs[0];
      double[] frontObjPos = obj.getPosition();
      double _get = frontObjPos[0];
      double _get_1 = frontObjPos[1];
      double calc = (_get + _get_1);
      if (((calc < (-0.05)) && (calc > (-0.06)))) {
        System.out.println("C\'est touché");
        return true;
      }
    }
    return false;
  }
}
