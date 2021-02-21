// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJWall{
boolean around (fr.univcotedazur.webots.polycreate.Wall self)  :target (self) && (call ( boolean fr.univcotedazur.webots.polycreate.Wall.isValid( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler ) ) ) { return fr.univcotedazur.webots.polycreate.rewritingrules.WallAspect.isValid(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0] );}

}
