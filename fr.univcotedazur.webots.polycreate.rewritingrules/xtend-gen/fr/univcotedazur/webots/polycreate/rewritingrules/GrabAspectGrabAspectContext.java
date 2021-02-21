package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.Grab;
import fr.univcotedazur.webots.polycreate.rewritingrules.GrabAspectGrabAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class GrabAspectGrabAspectContext {
  public final static GrabAspectGrabAspectContext INSTANCE = new GrabAspectGrabAspectContext();
  
  public static GrabAspectGrabAspectProperties getSelf(final Grab _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.GrabAspectGrabAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Grab, GrabAspectGrabAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.Grab, fr.univcotedazur.webots.polycreate.rewritingrules.GrabAspectGrabAspectProperties>();
  
  public Map<Grab, GrabAspectGrabAspectProperties> getMap() {
    return map;
  }
}
