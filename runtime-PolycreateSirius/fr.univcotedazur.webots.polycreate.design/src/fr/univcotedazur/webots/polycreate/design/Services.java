package fr.univcotedazur.webots.polycreate.design;

import fr.univcotedazur.webots.polycreate.Action;
import fr.univcotedazur.webots.polycreate.Sequence;

/**
 * The services class used by VSM.
 */
public class Services {
    
    public Action getNextAction(Action action) {
    	Sequence parentSequence = (Sequence) action.eContainer();
    	int actionPosition = parentSequence.getActions().indexOf(action);
    	if (actionPosition == parentSequence.getActions().size() -1) {
    		return null;
    	} else {
    		return parentSequence.getActions().get(actionPosition + 1);
    	}
    }
}
