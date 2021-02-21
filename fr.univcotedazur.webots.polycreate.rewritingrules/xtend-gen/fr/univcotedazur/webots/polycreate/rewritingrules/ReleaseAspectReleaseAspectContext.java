package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.Release;
import fr.univcotedazur.webots.polycreate.rewritingrules.ReleaseAspectReleaseAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ReleaseAspectReleaseAspectContext {
  public final static ReleaseAspectReleaseAspectContext INSTANCE = new ReleaseAspectReleaseAspectContext();
  
  public static ReleaseAspectReleaseAspectProperties getSelf(final Release _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.ReleaseAspectReleaseAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Release, ReleaseAspectReleaseAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.Release, fr.univcotedazur.webots.polycreate.rewritingrules.ReleaseAspectReleaseAspectProperties>();
  
  public Map<Release, ReleaseAspectReleaseAspectProperties> getMap() {
    return map;
  }
}
