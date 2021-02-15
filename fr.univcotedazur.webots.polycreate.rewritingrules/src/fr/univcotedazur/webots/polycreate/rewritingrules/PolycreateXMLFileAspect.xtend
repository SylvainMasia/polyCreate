package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.univcotedazur.webots.polycreate.Mission
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.univcotedazur.webots.polycreate.Sequence
import fr.inria.diverse.k3.al.annotationprocessor.Step

//import static extension fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect.*

@Aspect(className=Mission)
class MissionAspect {
	
	@Main
	def void entryPoint() {
		System.out.println("Running main");
		for(Sequence s : _self.sequences) {
			System.out.println("Running test sequence");
			System.out.println(s == null);
			s.runIt();
		}
	}
}

@Aspect(className=Sequence)
class SequenceAspect {
	public var int currentActionIndex = 0;
	
	@Step
	def void runIt() {
		System.out.println("Running sequence");
	}
}