package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.univcotedazur.webots.polycreate.Mission
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.univcotedazur.webots.polycreate.Sequence
import fr.inria.diverse.k3.al.annotationprocessor.Step

import static extension fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect.*
import static extension fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect.*
import static extension fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspect.*
import static extension fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import fr.univcotedazur.webots.polycreate.MoveForward
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler
import fr.univcotedazur.webots.polycreate.Action
import fr.univcotedazur.webots.polycreate.Rotate
import fr.univcotedazur.webots.polycreate.Condition
import fr.univcotedazur.webots.polycreate.Wall
import fr.univcotedazur.webots.polycreate.WallLeft
import fr.univcotedazur.webots.polycreate.WallRight
import fr.univcotedazur.webots.polycreate.WallFront
import fr.univcotedazur.webots.polycreate.ObjectInFront
import fr.univcotedazur.webots.polycreate.Grab
import fr.univcotedazur.webots.polycreate.Release
import fr.univcotedazur.webots.polycreate.SensorChecker
import fr.univcotedazur.webots.polycreate.MoveBackward

@Aspect(className=Mission)
class MissionAspect {
	PolyCreateControler controler;
	
	@Main
	def void entryPoint() {
		_self.controler = new PolyCreateControler();
		_self.controler.openGripper();
		for(Sequence s : _self.sequences) {
			s.runIt(_self.controler, _self.sensorChecker);
		}
		_self.controler.delete();
	}
}

//################################################ SEQUENCE
@Aspect(className=Sequence)
class SequenceAspect {	
	var public boolean isAlternative = false;
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler, SensorChecker logicalVerifications) {
		System.out.println("Running sequence");
		for (var i = 0; i < _self.actions.size; i++) {
			val action = _self.actions.get(i);
			action.runIt(controler, logicalVerifications, _self.isAlternative);
		}
	}
}


//############################################### CONDITION
@Aspect(className=Condition)
abstract class ConditionAspect {
	
	@Step
	@ReplaceAspectMethod
	def abstract boolean isValid(PolyCreateControler controler);
}

@Aspect(className=Wall)
abstract class WallAspect extends ConditionAspect {
	
	@Step
	@ReplaceAspectMethod
	def abstract boolean isValid(PolyCreateControler controler);
}

@Aspect(className=WallLeft)
class WallLeftAspect extends WallAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		if (controler.isThereCollisionAtLeft()) {
			System.out.println("Une collision se fait à gauche");
		}
		return controler.isThereCollisionAtLeft();
	}
}

@Aspect(className=WallRight)
class WallRightAspect extends WallAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		if (controler.isThereCollisionAtRight()) {
			System.out.println("Une collision se fait à droite");
		}
		return controler.isThereCollisionAtRight();
	}
}

@Aspect(className=WallFront)
class WallFrontAspect extends WallAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		if (controler.isThereVirtualwall()) {
			System.out.println("Un mur est juste devant");
		}
		return controler.isThereVirtualwall();
	}
}

@Aspect(className=ObjectInFront)
class ObjectInFrontAspect extends ConditionAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		if (controler.getObjectDistanceToGripper() / 100 < 2) {
			System.out.println("Il y a un objet à " + (controler.getObjectDistanceToGripper() / 100) + "cm");
			return true;
		}
		return false;
	}
}


//################################################### SensorChecker
@Aspect(className=SensorChecker)
class SensorCheckerAspect {
	var boolean firstCondition = true;
	
	@Step
	@ReplaceAspectMethod
	def boolean runIt(PolyCreateControler controler){
		if (_self.firstCondition) {
			_self.firstCondition = false;
			return false;
		}
		for (Condition condition : _self.conditions) {
			if (condition.isValid(controler)) {
				controler.stop();
				condition.alternativeSequence.isAlternative = true;
				condition.alternativeSequence.runIt(controler, _self);
				return true;
			}
		}
		return false;
	}
}

//################################################### ACTION
@Aspect(className=Action)
abstract class ActionAspect {
	
	@Step
	def abstract void runIt(PolyCreateControler controler, SensorChecker logicalVerifications, boolean isAlternative);
}

@Aspect(className=Grab)
class GrabAspect extends ActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler, SensorChecker logicalVerifications, boolean isAlternative){
		System.out.println("Grabing object");
		controler.closeGripper();
		controler.passiveWait(1);
	}
}

@Aspect(className=Release)
class ReleaseAspect extends ActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler, SensorChecker logicalVerifications, boolean isAlternative){
		System.out.println("Grabing object");
		controler.openGripper();
		controler.passiveWait(0.5);
	}
}

@Aspect(className=Rotate)
class RotateAspect extends ActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler, SensorChecker logicalVerifications, boolean isAlternative){
		var double finalDegrees = _self.degrees;
		if (finalDegrees >= 180) {
			finalDegrees += finalDegrees / 16.8; // second magic number
		}
		val robotDegrees = (finalDegrees as float / 100) * 2.14; // magic number
		System.out.println("Turning " + robotDegrees + " degrees");
		controler.turn(robotDegrees);
		controler.passiveWait(robotDegrees / 2.5);
	}
}

@Aspect(className=MoveForward)
class MoveForwardAspect extends ActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler, SensorChecker logicalVerifications, boolean isAlternative){
		System.out.println("Going forward " + _self.distance + "cm");
		if (_self.distance === -1) {
			while(true) {
				if (!isAlternative && logicalVerifications.runIt(controler)) {
					return;
				}
				controler.goForward();
				controler.passiveWait(5 * 0.05);
			}
		}
		
		for (var i = 0; i < _self.distance; i += 5) {
			if (!isAlternative && logicalVerifications.runIt(controler)) {
				return;
			}
			controler.goForward();
			if (_self.distance - i < 5) {
				System.out.println("On passe ici : " + (_self.distance - i));
				controler.passiveWait((_self.distance - i) * 0.05);
			} else {
				controler.passiveWait(5 * 0.05);
			}
		}
		controler.stop();
	}
}

@Aspect(className=MoveBackward)
class MoveBackwardAspect extends ActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler, SensorChecker logicalVerifications, boolean isAlternative){
		System.out.println("Going backward " + _self.distance + "cm");
		if (_self.distance === -1) {
			while(true) {
				if (!isAlternative && logicalVerifications.runIt(controler)) {
					return;
				}
				controler.goForward();
				controler.passiveWait(5 * 0.1);
			}
		}
		
		for (var i = 0; i < _self.distance; i += 5) {
			if (!isAlternative && logicalVerifications.runIt(controler)) {
				return;
			}
			controler.goBackward();
			if (_self.distance - i < 5) {
				System.out.println("On passe ici : " + (_self.distance - i));
				controler.passiveWait((_self.distance - i) * 0.1);
			} else {
				controler.passiveWait(5 * 0.1);
			}
		}
		controler.stop();
	}
}

