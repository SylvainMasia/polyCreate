// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJGrab{
void around (fr.univcotedazur.webots.polycreate.Grab self)  :target (self) && (call ( void fr.univcotedazur.webots.polycreate.Grab.runIt( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler,fr.univcotedazur.webots.polycreate.SensorChecker,boolean ) ) ) { fr.univcotedazur.webots.polycreate.rewritingrules.GrabAspect.runIt(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0],(fr.univcotedazur.webots.polycreate.SensorChecker)thisJoinPoint.getArgs()[1],(boolean)thisJoinPoint.getArgs()[2] );}

}
