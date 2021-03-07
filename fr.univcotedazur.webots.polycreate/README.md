
# Abstract Syntax

## Domain model

Voici notre domain model :

![Figure 1 : domain model](../assets/domainmodel.png)

Notre objet principal est une Mission. Ce dernier possède une liste de séquences qui elles même contiennent des actions. La mission contient également un objet SensorChecker. Cet objet contient une liste de conditions qui vont être executées après chaque action. Ces conditions peuvent être la vérification si un objet se trouve devant, ou si une collision survient en face, à droite ou à gauche. Si une condition est valide, on entrera alors dans une séquence alternative puis on reprendra le flot d'exécution de la séquence initiale. Cette implémentation permet par exemple d'avoir une séquence qui parcours une pièce, puis si il y a un objet on entrera dans la séquence alternative pour par exemple déplacer l'objet et nettoyer en dessous.
