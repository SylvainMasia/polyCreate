package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.SensorChecker;
import fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspectSensorCheckerAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class SensorCheckerAspectSensorCheckerAspectContext {
  public final static SensorCheckerAspectSensorCheckerAspectContext INSTANCE = new SensorCheckerAspectSensorCheckerAspectContext();
  
  public static SensorCheckerAspectSensorCheckerAspectProperties getSelf(final SensorChecker _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspectSensorCheckerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SensorChecker, SensorCheckerAspectSensorCheckerAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.SensorChecker, fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspectSensorCheckerAspectProperties>();
  
  public Map<SensorChecker, SensorCheckerAspectSensorCheckerAspectProperties> getMap() {
    return map;
  }
}
