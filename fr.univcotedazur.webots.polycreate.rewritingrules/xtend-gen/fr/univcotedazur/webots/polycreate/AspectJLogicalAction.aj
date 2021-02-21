// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJLogicalAction{
void around (fr.univcotedazur.webots.polycreate.LogicalAction self)  :target (self) && (call ( void fr.univcotedazur.webots.polycreate.LogicalAction.runIt( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler ) ) ) { fr.univcotedazur.webots.polycreate.rewritingrules.LogicalActionAspect.runIt(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0] );}

}
