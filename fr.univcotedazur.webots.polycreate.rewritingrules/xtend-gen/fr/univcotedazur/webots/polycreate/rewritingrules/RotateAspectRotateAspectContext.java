package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.Rotate;
import fr.univcotedazur.webots.polycreate.rewritingrules.RotateAspectRotateAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class RotateAspectRotateAspectContext {
  public final static RotateAspectRotateAspectContext INSTANCE = new RotateAspectRotateAspectContext();
  
  public static RotateAspectRotateAspectProperties getSelf(final Rotate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.RotateAspectRotateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Rotate, RotateAspectRotateAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.Rotate, fr.univcotedazur.webots.polycreate.rewritingrules.RotateAspectRotateAspectProperties>();
  
  public Map<Rotate, RotateAspectRotateAspectProperties> getMap() {
    return map;
  }
}
