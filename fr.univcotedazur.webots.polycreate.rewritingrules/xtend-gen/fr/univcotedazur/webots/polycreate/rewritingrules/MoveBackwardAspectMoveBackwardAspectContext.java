package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.MoveBackward;
import fr.univcotedazur.webots.polycreate.rewritingrules.MoveBackwardAspectMoveBackwardAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class MoveBackwardAspectMoveBackwardAspectContext {
  public final static MoveBackwardAspectMoveBackwardAspectContext INSTANCE = new MoveBackwardAspectMoveBackwardAspectContext();
  
  public static MoveBackwardAspectMoveBackwardAspectProperties getSelf(final MoveBackward _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.MoveBackwardAspectMoveBackwardAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MoveBackward, MoveBackwardAspectMoveBackwardAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.MoveBackward, fr.univcotedazur.webots.polycreate.rewritingrules.MoveBackwardAspectMoveBackwardAspectProperties>();
  
  public Map<MoveBackward, MoveBackwardAspectMoveBackwardAspectProperties> getMap() {
    return map;
  }
}
