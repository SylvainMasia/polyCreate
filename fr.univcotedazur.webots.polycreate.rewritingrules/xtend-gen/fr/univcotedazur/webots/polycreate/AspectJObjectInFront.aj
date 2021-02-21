// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJObjectInFront{
boolean around (fr.univcotedazur.webots.polycreate.ObjectInFront self)  :target (self) && (call ( boolean fr.univcotedazur.webots.polycreate.ObjectInFront.isValid( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler ) ) ) { return fr.univcotedazur.webots.polycreate.rewritingrules.ObjectInFrontAspect.isValid(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0] );}

}
