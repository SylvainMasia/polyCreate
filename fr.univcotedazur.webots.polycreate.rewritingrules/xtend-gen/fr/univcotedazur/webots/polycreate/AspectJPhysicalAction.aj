// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJPhysicalAction{
void around (fr.univcotedazur.webots.polycreate.PhysicalAction self)  :target (self) && (call ( void fr.univcotedazur.webots.polycreate.PhysicalAction.runIt( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler ) ) ) { fr.univcotedazur.webots.polycreate.rewritingrules.PhysicalActionAspect.runIt(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0] );}

}
