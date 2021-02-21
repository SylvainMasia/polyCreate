package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.Wall;
import fr.univcotedazur.webots.polycreate.rewritingrules.WallAspectWallAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class WallAspectWallAspectContext {
  public final static WallAspectWallAspectContext INSTANCE = new WallAspectWallAspectContext();
  
  public static WallAspectWallAspectProperties getSelf(final Wall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.WallAspectWallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Wall, WallAspectWallAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.Wall, fr.univcotedazur.webots.polycreate.rewritingrules.WallAspectWallAspectProperties>();
  
  public Map<Wall, WallAspectWallAspectProperties> getMap() {
    return map;
  }
}
