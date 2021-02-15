package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler;
import fr.univcotedazur.webots.polycreate.Mission;
import fr.univcotedazur.webots.polycreate.Sequence;
import fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspectMissionAspectProperties;
import fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect;
import org.eclipse.emf.common.util.EList;

@Aspect(className = Mission.class)
@SuppressWarnings("all")
public class MissionAspect {
  @Main
  public static void entryPoint(final Mission _self) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspectMissionAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspectMissionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void entryPoint()
    if (_self instanceof fr.univcotedazur.webots.polycreate.Mission){
    	fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspect._privk3_entryPoint(_self_, (fr.univcotedazur.webots.polycreate.Mission)_self);
    };
  }
  
  private static PolyCreateControler controler(final Mission _self) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspectMissionAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspectMissionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# PolyCreateControler controler()
    if (_self instanceof fr.univcotedazur.webots.polycreate.Mission){
    	result = fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspect._privk3_controler(_self_, (fr.univcotedazur.webots.polycreate.Mission)_self);
    };
    return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)result;
  }
  
  private static void controler(final Mission _self, final PolyCreateControler controler) {
    final fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspectMissionAspectProperties _self_ = fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspectMissionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void controler(PolyCreateControler)
    if (_self instanceof fr.univcotedazur.webots.polycreate.Mission){
    	fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspect._privk3_controler(_self_, (fr.univcotedazur.webots.polycreate.Mission)_self,controler);
    };
  }
  
  protected static void _privk3_entryPoint(final MissionAspectMissionAspectProperties _self_, final Mission _self) {
    PolyCreateControler _polyCreateControler = new PolyCreateControler();
    MissionAspect.controler(_self, _polyCreateControler);
    EList<Sequence> _sequences = _self.getSequences();
    for (final Sequence s : _sequences) {
      SequenceAspect.runIt(s, MissionAspect.controler(_self));
    }
  }
  
  protected static PolyCreateControler _privk3_controler(final MissionAspectMissionAspectProperties _self_, final Mission _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getControler") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.controler;
  }
  
  protected static void _privk3_controler(final MissionAspectMissionAspectProperties _self_, final Mission _self, final PolyCreateControler controler) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setControler")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, controler);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.controler = controler;
    }
  }
}
