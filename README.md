# polyCreate

IRobot Create Behavioural Language Engineering

# Cyberbotics

[IRobot's Create](https://cyberbotics.com/doc/guide/create)

# File extention
.pcsd

# Steps

- add to path :
	- C:\Users\damin\AppData\Local\Programs\Webots\lib\controller
	- C:\Users\damin\AppData\Local\Programs\Webots\msys64\mingw64\bin
	- C:\Users\damin\AppData\Local\Programs\Webots\msys64\mingw64\bin\cpp
- edit le build.properties du projet fr.univcotedazur.kairos.webots.polycreate.controler
	- remove tout ce qu'il a des .so
- edit le .classpath du projet fr.univcotedazur.kairos.webots.polycreate.controler
	- supprimer de la ligne 8 a 20 (tous les classpathentry presque)
- dans C:\Users\damin\AppData\Local\Programs\Webots\lib\controller tout copier dans dossier fr.univcotedazur.kairos.webots.polycreate.controler/webotslibs
- open gemoc > import > general > existing projects into worskapce > fr.univcotedazur.kairos.webots.polycreate.controler
- clic droit sur src > build path > sources machin
	- la on a le dossier qui devient rouge
- Si on est sous Java 8
	- dans manifest on remove java 11 et on mets java 8
	- click sur lien bleu "Update the classphath settings"
- click droit sur la racine du projet projet
	-> java build path > librairies > extends le fr.univcotedazur.kairos.webots.polycreate.controler > Native library location > Edit > workspace > webotslibs/java