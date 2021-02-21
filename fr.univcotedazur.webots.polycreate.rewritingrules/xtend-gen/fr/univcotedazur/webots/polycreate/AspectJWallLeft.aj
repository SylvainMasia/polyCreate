// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJWallLeft{
boolean around (fr.univcotedazur.webots.polycreate.WallLeft self)  :target (self) && (call ( boolean fr.univcotedazur.webots.polycreate.WallLeft.isValid( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler ) ) ) { return fr.univcotedazur.webots.polycreate.rewritingrules.WallLeftAspect.isValid(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0] );}

}
