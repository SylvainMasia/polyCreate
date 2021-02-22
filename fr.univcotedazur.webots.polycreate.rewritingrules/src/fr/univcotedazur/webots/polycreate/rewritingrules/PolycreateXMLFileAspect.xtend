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
			System.out.println()
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
abstract class WallAspect {
	
	@Step
	@ReplaceAspectMethod
	def abstract boolean isValid(PolyCreateControler controler);
}

@Aspect(className=WallLeft)
class WallLeftAspect extends WallAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		return controler.isThereCollisionAtLeft();
	}
}

@Aspect(className=WallRight)
class WallRightAspect extends WallAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		return controler.isThereCollisionAtRight();
	}
}

@Aspect(className=WallFront)
class WallFrontAspect extends WallAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		return controler.isThereVirtualwall();
	}
}

@Aspect(className=ObjectInFront)
class ObjectInFrontAspect extends ConditionAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		var frontObjs = controler.frontCamera.getCameraRecognitionObjects();
		if (frontObjs.length > 0) {
			val obj = frontObjs.get(0);
			var frontObjPos = obj.getPosition();
			var calc = frontObjPos.get(0) + frontObjPos.get(1);
			if (calc < -0.05 && calc > -0.06) {
				System.out.println("C'est touché");
				return true;
			}
		}
		return false;
	}
}


//################################################### SensorChecker
@Aspect(className=SensorChecker)
class SensorCheckerAspect {
	@Step
	@ReplaceAspectMethod
	def boolean runIt(PolyCreateControler controler){
		for (Condition condition : _self.conditions) {
			if (condition.isValid(controler)) {
				System.out.println("C'est valide");
				//controler.stop();
				System.out.println("Stop");
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
		var finalDegrees = _self.degrees;
		if (finalDegrees >= 180) {
			finalDegrees += finalDegrees / 20; // second magic number
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
		for (var i = 0; i < _self.distance; i += 5) {
			if (!isAlternative && logicalVerifications.runIt(controler)) {
				return;
			}
			controler.goForward();
			controler.passiveWait(5 * 0.05);
		}
	}
}

@Aspect(className=MoveBackward)
class MoveBackwardAspect extends ActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler, SensorChecker logicalVerifications, boolean isAlternative){
		System.out.println("Going backward " + _self.distance + "cm");
		for (var i = 0; i < _self.distance; i += 5) {
			if (!isAlternative && logicalVerifications.runIt(controler)) {
				return;
			}
			controler.goBackward();
			controler.passiveWait(5 * 0.1);
		}
	}
}

