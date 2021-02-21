package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.WallFront;
import fr.univcotedazur.webots.polycreate.rewritingrules.WallFrontAspectWallFrontAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class WallFrontAspectWallFrontAspectContext {
  public final static WallFrontAspectWallFrontAspectContext INSTANCE = new WallFrontAspectWallFrontAspectContext();
  
  public static WallFrontAspectWallFrontAspectProperties getSelf(final WallFront _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.WallFrontAspectWallFrontAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<WallFront, WallFrontAspectWallFrontAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.WallFront, fr.univcotedazur.webots.polycreate.rewritingrules.WallFrontAspectWallFrontAspectProperties>();
  
  public Map<WallFront, WallFrontAspectWallFrontAspectProperties> getMap() {
    return map;
  }
}
