package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.Mission;
import fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspectMissionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class MissionAspectMissionAspectContext {
  public final static MissionAspectMissionAspectContext INSTANCE = new MissionAspectMissionAspectContext();
  
  public static MissionAspectMissionAspectProperties getSelf(final Mission _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspectMissionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Mission, MissionAspectMissionAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.Mission, fr.univcotedazur.webots.polycreate.rewritingrules.MissionAspectMissionAspectProperties>();
  
  public Map<Mission, MissionAspectMissionAspectProperties> getMap() {
    return map;
  }
}
