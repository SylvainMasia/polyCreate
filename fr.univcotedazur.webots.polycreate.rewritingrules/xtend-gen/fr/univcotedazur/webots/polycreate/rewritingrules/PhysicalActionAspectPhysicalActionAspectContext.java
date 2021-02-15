package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.PhysicalAction;
import fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspectPhysicalActionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class PhysicalActionAspectPhysicalActionAspectContext {
  public final static PhysicalActionAspectPhysicalActionAspectContext INSTANCE = new PhysicalActionAspectPhysicalActionAspectContext();
  
  public static PhysicalActionAspectPhysicalActionAspectProperties getSelf(final PhysicalAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspectPhysicalActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PhysicalAction, PhysicalActionAspectPhysicalActionAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.PhysicalAction, fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspectPhysicalActionAspectProperties>();
  
  public Map<PhysicalAction, PhysicalActionAspectPhysicalActionAspectProperties> getMap() {
    return map;
  }
}
