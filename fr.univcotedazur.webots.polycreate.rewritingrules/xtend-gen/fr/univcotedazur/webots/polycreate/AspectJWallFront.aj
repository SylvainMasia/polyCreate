// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJWallFront{
boolean around (fr.univcotedazur.webots.polycreate.WallFront self)  :target (self) && (call ( boolean fr.univcotedazur.webots.polycreate.WallFront.isValid( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler ) ) ) { return fr.univcotedazur.webots.polycreate.rewritingrules.WallFrontAspect.isValid(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0] );}

}
