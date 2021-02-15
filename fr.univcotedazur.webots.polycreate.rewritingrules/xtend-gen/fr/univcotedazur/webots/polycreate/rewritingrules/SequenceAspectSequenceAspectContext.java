package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.univcotedazur.webots.polycreate.Sequence;
import fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class SequenceAspectSequenceAspectContext {
  public final static SequenceAspectSequenceAspectContext INSTANCE = new SequenceAspectSequenceAspectContext();
  
  public static SequenceAspectSequenceAspectProperties getSelf(final Sequence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sequence, SequenceAspectSequenceAspectProperties> map = new java.util.WeakHashMap<fr.univcotedazur.webots.polycreate.Sequence, fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspectSequenceAspectProperties>();
  
  public Map<Sequence, SequenceAspectSequenceAspectProperties> getMap() {
    return map;
  }
}
