// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJSensorChecker{
boolean around (fr.univcotedazur.webots.polycreate.SensorChecker self)  :target (self) && (call ( boolean fr.univcotedazur.webots.polycreate.SensorChecker.runIt( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler ) ) ) { return fr.univcotedazur.webots.polycreate.rewritingrules.SensorCheckerAspect.runIt(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0] );}

}
