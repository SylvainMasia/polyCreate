// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJSequence{
void around (fr.univcotedazur.webots.polycreate.Sequence self)  :target (self) && (call ( void fr.univcotedazur.webots.polycreate.Sequence.runIt( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler ) ) ) { fr.univcotedazur.webots.polycreate.rewritingrules.SequenceAspect.runIt(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0] );}

}
