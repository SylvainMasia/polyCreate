package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.univcotedazur.webots.polycreate.Mission
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.univcotedazur.webots.polycreate.Sequence
import fr.inria.diverse.k3.al.annotationprocessor.Step

import static extension fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import fr.univcotedazur.webots.polycreate.PhysicalAction
import fr.univcotedazur.webots.polycreate.MoveForward
import fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler

@Aspect(className=Mission)
class MissionAspect {
	PolyCreateControler controler;
	
	@Main
	def void entryPoint() {
		_self.controler = new PolyCreateControler();
		for(Sequence s : _self.sequences) {
			s.runIt(_self.controler);
		}
	}
}

@Aspect(className=Sequence)
class SequenceAspect {
	public var int currentActionIndex = 0;
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler) {
		System.out.println("Running sequence");
		
	}
}

@Aspect(className=PhysicalAction)
abstract class PhysicalActionAspect {
	
	@Step
	@ReplaceAspectMethod
	def abstract void runIt(PolyCreateControler controler);
}

@Aspect(className=MoveForward)
class MoveForwardAspect {
	
	@Step
	@ReplaceAspectMethod
	def void runIt(PolyCreateControler controler){
		controler.goForward();
		controler.passiveWait(_self.distance);
		controler.stop();
	}
}
