# polyCreate

IRobot Create Behavioural Language Engineering

# Cyberbotics

[IRobot's Create](https://cyberbotics.com/doc/guide/create)

# Steps

- add to path C:\Users\damin\AppData\Local\Programs\Webots\lib\controller
- edit le build.properties du projet fr.... 
	- remove tout ce qu'il a des .so
- edit le .classpath du projet fr...
	- supprimer de la ligne  a 20 (tous les classpathentry presque)
- dans C:\Users\damin\AppData\Local\Programs\Webots\lib\controller tout copier dans dossier fr... / webotslibs
- open gemoc > import > general > existing projects into worskapce > fr...
- clic droit sur src > build path > sources machin
	- la on a le dossier en rouge
- dans manifest on remove java 11 et on mets java 8 si on est en 8
	- click sur update the classphath settings
- click droit sur tout le projet
	-> java build path > librairies > extends le fr... > Native library location > Edit > workspace > webotslibs/java