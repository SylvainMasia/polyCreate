package fr.univcotedazur.webots.polycreate.design;

import fr.univcotedazur.webots.polycreate.Action;
import fr.univcotedazur.webots.polycreate.Condition;
import fr.univcotedazur.webots.polycreate.Mission;
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
    
    public Sequence getNextSequence(Sequence sequence) {
    	Mission parentMission = (Mission) sequence.eContainer();
    	int sequencePosition = parentMission.getSequences().indexOf(sequence);
    	if (sequencePosition == parentMission.getSequences().size() -1) {
    		return null;
    	} else {
    		return parentMission.getSequences().get(sequencePosition + 1);
    	}
    }
    
    public Sequence getAlternativeSequence(Condition condition) {
    	return condition.getAlternativeSequence();
    }
}
