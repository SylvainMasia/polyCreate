package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Sequence;
import fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectProperties;

@Aspect(className = Sequence.class)
@SuppressWarnings("all")
public class SequenceAspect {
  @Step
  @ReplaceAspectMethod
  public static void runIt(final Sequence _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void runIt(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.Sequence){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect._privk3_runIt(_self_, (fr.univcotedazur.webots.polycreate.Sequence)_self,controler);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {controler}, command, "Sequence", "runIt");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static int currentActionIndex(final Sequence _self) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int currentActionIndex()
    if (_self instanceof fr.univcotedazur.webots.polycreate.Sequence){
    	result = fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect._privk3_currentActionIndex(_self_, (fr.univcotedazur.webots.polycreate.Sequence)_self);
    };
    return (int)result;
  }
  
  public static void currentActionIndex(final Sequence _self, final int currentActionIndex) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentActionIndex(int)
    if (_self instanceof fr.univcotedazur.webots.polycreate.Sequence){
    	fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect._privk3_currentActionIndex(_self_, (fr.univcotedazur.webots.polycreate.Sequence)_self,currentActionIndex);
    };
  }
  
  protected static void _privk3_runIt(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self, final PolyCreateControler controler) {
    System.out.println("Running sequence");
  }
  
  protected static int _privk3_currentActionIndex(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentActionIndex") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentActionIndex;
  }
  
  protected static void _privk3_currentActionIndex(final SequenceAspectSequenceAspectProperties _self_, final Sequence _self, final int currentActionIndex) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentActionIndex")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentActionIndex);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentActionIndex = currentActionIndex;
    }
  }
}
