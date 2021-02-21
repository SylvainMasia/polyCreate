package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.WallLeft;
import fr.univcotedazur.webots.polycreate.rewritingrules.WallLeftAspectWallLeftAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class WallLeftAspectWallLeftAspectContext {
  public final static WallLeftAspectWallLeftAspectContext INSTANCE = new WallLeftAspectWallLeftAspectContext();
  
  public static WallLeftAspectWallLeftAspectProperties getSelf(final WallLeft _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.WallLeftAspectWallLeftAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<WallLeft, WallLeftAspectWallLeftAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.WallLeft, fr.univcotedazur.webots.polycreate.rewritingrules.WallLeftAspectWallLeftAspectProperties>();
  
  public Map<WallLeft, WallLeftAspectWallLeftAspectProperties> getMap() {
    return map;
  }
}
