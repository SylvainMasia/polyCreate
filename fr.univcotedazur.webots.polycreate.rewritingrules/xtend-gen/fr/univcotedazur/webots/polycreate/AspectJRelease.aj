// AspectJ classes that have been aspectized and name
package fr.univcotedazur.webots.polycreate;
public aspect AspectJRelease{
void around (fr.univcotedazur.webots.polycreate.Release self)  :target (self) && (call ( void fr.univcotedazur.webots.polycreate.Release.runIt( fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler ) ) ) { fr.univcotedazur.webots.polycreate.rewritingrules.ReleaseAspect.runIt(self,(fr.univcotedazur.kairos.webots.polycreate.controler.PolyCreateControler)thisJoinPoint.getArgs()[0] );}

}
