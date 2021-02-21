// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJWallRight{
boolean around (fr.univcotedazur.webots.polycreate.WallRight self)  :target (self) && (call ( boolean fr.univcotedazur.webots.polycreate.WallRight.isValid( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler ) ) ) { return fr.univcotedazur.webots.polycreate.rewritingrules.WallRightAspect.isValid(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0] );}

}
