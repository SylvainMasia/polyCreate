package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.ObjectInFront;
import fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspectObjectInFrontAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ObjectInFrontAspectObjectInFrontAspectContext {
  public final static ObjectInFrontAspectObjectInFrontAspectContext INSTANCE = new ObjectInFrontAspectObjectInFrontAspectContext();
  
  public static ObjectInFrontAspectObjectInFrontAspectProperties getSelf(final ObjectInFront _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspectObjectInFrontAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ObjectInFront, ObjectInFrontAspectObjectInFrontAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.ObjectInFront, fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspectObjectInFrontAspectProperties>();
  
  public Map<ObjectInFront, ObjectInFrontAspectObjectInFrontAspectProperties> getMap() {
    return map;
  }
}
