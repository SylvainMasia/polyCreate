package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.LogicalAction;
import fr.univcotedazur.webots.polycreate.rewritingrules.LogicalActionAspectLogicalActionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class LogicalActionAspectLogicalActionAspectContext {
  public final static LogicalActionAspectLogicalActionAspectContext INSTANCE = new LogicalActionAspectLogicalActionAspectContext();
  
  public static LogicalActionAspectLogicalActionAspectProperties getSelf(final LogicalAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.LogicalActionAspectLogicalActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LogicalAction, LogicalActionAspectLogicalActionAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.LogicalAction, fr.univcotedazur.webots.polycreate.rewritingrules.LogicalActionAspectLogicalActionAspectProperties>();
  
  public Map<LogicalAction, LogicalActionAspectLogicalActionAspectProperties> getMap() {
    return map;
  }
}
