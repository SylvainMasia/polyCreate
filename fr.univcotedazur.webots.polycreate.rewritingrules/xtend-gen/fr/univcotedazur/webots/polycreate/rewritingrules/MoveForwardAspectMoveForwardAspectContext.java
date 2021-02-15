package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.MoveForward;
import fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class MoveForwardAspectMoveForwardAspectContext {
  public final static MoveForwardAspectMoveForwardAspectContext INSTANCE = new MoveForwardAspectMoveForwardAspectContext();
  
  public static MoveForwardAspectMoveForwardAspectProperties getSelf(final MoveForward _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MoveForward, MoveForwardAspectMoveForwardAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.MoveForward, fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspectMoveForwardAspectProperties>();
  
  public Map<MoveForward, MoveForwardAspectMoveForwardAspectProperties> getMap() {
    return map;
  }
}
