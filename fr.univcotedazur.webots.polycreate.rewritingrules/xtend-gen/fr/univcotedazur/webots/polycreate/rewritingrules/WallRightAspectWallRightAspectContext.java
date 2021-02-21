package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.WallRight;
import fr.univcotedazur.webots.polycreate.rewritingrules.WallRightAspectWallRightAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class WallRightAspectWallRightAspectContext {
  public final static WallRightAspectWallRightAspectContext INSTANCE = new WallRightAspectWallRightAspectContext();
  
  public static WallRightAspectWallRightAspectProperties getSelf(final WallRight _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.WallRightAspectWallRightAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<WallRight, WallRightAspectWallRightAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.WallRight, fr.univcotedazur.webots.polycreate.rewritingrules.WallRightAspectWallRightAspectProperties>();
  
  public Map<WallRight, WallRightAspectWallRightAspectProperties> getMap() {
    return map;
  }
}
