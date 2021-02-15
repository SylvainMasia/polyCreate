package fr.univcotedazur.webots.polycreate.rewritingrules;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.univcotedazur.webots.polycreate.Mission;
import fr.univcotedazur.webots.polycreate.Sequence;
import fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspectMissionAspectProperties;
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
  
  protected static void _privk3_entryPoint(final MissionAspectMissionAspectProperties _self_, final Mission _self) {
    System.out.println("Running main");
    EList<Sequence> _sequences = _self.getSequences();
    for (final Sequence s : _sequences) {
      {
        System.out.println("Running test sequence");
        boolean _equals = Objects.equal(s, null);
        System.out.println(_equals);
        s.runIt();
      }
    }
  }
}
