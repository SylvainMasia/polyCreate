package fr.univcotedazur.webots.polycreate.rewritingrules;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.univcotedazur.webots.polycreate.PhysicalAction;
import fr.univcotedazur.webots.polycreate.rewritingrules.ActionAspect;

@Aspect(className = PhysicalAction.class)
@SuppressWarnings("all")
public abstract class PhysicalActionAspect extends ActionAspect {
}
