package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.univcotedazur.webots.polycreate.Mission
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.univcotedazur.webots.polycreate.Sequence
import fr.inria.diverse.k3.al.annotationprocessor.Step

import static extension fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect.*
import static extension fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect.*
import static extension fr.univcotedazur.webots.polycreate.rewritingrules.ConditionAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import fr.univcotedazur.webots.polycreate.PhysicalAction
import fr.univcotedazur.webots.polycreate.MoveForward
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler
import fr.univcotedazur.webots.polycreate.Action
import fr.univcotedazur.webots.polycreate.Rotate
import fr.univcotedazur.webots.polycreate.LogicalAction
import fr.univcotedazur.webots.polycreate.Condition
import fr.univcotedazur.webots.polycreate.Wall
import fr.univcotedazur.webots.polycreate.WallLeft
import fr.univcotedazur.webots.polycreate.WallRight
import fr.univcotedazur.webots.polycreate.WallFront
import fr.univcotedazur.webots.polycreate.ObjectInFront
import fr.univcotedazur.webots.polycreate.Grab
import fr.univcotedazur.webots.polycreate.Release

@Aspect(className=Mission)
class MissionAspect {
	PolyCreateControler controler;
	
	@Main
	def void entryPoint() {
		_self.controler = new PolyCreateControler();
		_self.controler.openGripper();
		for(Sequence s : _self.sequences) {
			s.runIt(_self.controler);
		}
	}
}

@Aspect(className=Sequence)
class SequenceAspect {	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler) {
		System.out.println("Running sequence");
		for (var i = 0; i < _self.actions.size; i++) {
			val action = _self.actions.get(i);
			action.runIt(controler);
		}
	}
}

@Aspect(className=Action)
abstract class ActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def abstract void runIt(PolyCreateControler controler);
}

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
abstract class WallLeftAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		return controler.isThereCollisionAtLeft();
	}
}

@Aspect(className=WallRight)
abstract class WallRightAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		return controler.isThereCollisionAtRight();
	}
}

@Aspect(className=WallFront)
abstract class WallFrontAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		return controler.isThereVirtualwall();
	}
}

@Aspect(className=ObjectInFront)
abstract class ObjectInFrontAspect {
	
	@Step
	@ReplaceAspectMethod
	def boolean isValid(PolyCreateControler controler) {
		return controler.isThereVirtualwall();
	}
}

@Aspect(className=PhysicalAction)
abstract class PhysicalActionAspect extends ActionAspect {}

@Aspect(className=LogicalAction)
class LogicalActionAspect extends ActionAspect {
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler){
		for (Condition condition : _self.conditions) {
			if (condition.isValid(controler)) {
				condition.alternativeSequence.runIt(controler);
				return;
			}
		}
	}
}

@Aspect(className=Grab)
class GrabAspect extends PhysicalActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler){
		System.out.println("Grabing object");
		controler.closeGripper();
		controler.passiveWait(0.5);
	}
}

@Aspect(className=Release)
class ReleaseAspect extends PhysicalActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler){
		System.out.println("Grabing object");
		controler.openGripper();
		controler.passiveWait(0.5);
	}
}

@Aspect(className=Rotate)
class RotateAspect extends PhysicalActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler){
		val robotDegrees = (_self.degrees as float / 100) * 2.3;
		System.out.println("Turning " + robotDegrees + " degrees");
		controler.turn(robotDegrees);
		controler.passiveWait(robotDegrees / 2.5);
	}
}

@Aspect(className=MoveForward)
class MoveForwardAspect extends PhysicalActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler){
		System.out.println("Going forward " + _self.distance + "cm");
		controler.goForward();
		controler.passiveWait(_self.distance * 0.05);
	}
}
