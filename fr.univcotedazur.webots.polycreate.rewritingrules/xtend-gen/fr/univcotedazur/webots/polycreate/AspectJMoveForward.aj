// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJMoveForward{
void around (fr.univcotedazur.webots.polycreate.MoveForward self)  :target (self) && (call ( void fr.univcotedazur.webots.polycreate.MoveForward.runIt( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler,fr.univcotedazur.webots.polycreate.SensorChecker ) ) ) { fr.univcotedazur.webots.polycreate.rewritingrules.MoveForwardAspect.runIt(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0],(fr.univcotedazur.webots.polycreate.SensorChecker)thisJoinPoint.getArgs()[1] );}

}
