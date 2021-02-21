package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.Condition;
import fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspectConditionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class ConditionAspectConditionAspectContext {
  public final static ConditionAspectConditionAspectContext INSTANCE = new ConditionAspectConditionAspectContext();
  
  public static ConditionAspectConditionAspectProperties getSelf(final Condition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspectConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Condition, ConditionAspectConditionAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.Condition, fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspectConditionAspectProperties>();
  
  public Map<Condition, ConditionAspectConditionAspectProperties> getMap() {
    return map;
  }
}
