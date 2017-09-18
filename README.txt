======================================For Windows=====================================================

dir .\src\*.java /s /B > sources_list.txt

javac -d "./" @sources_list.txt

jar cvfeP nimble.jar nimbleintern.NimbleIntern -C . model/ nimbleintern/ view/

java -jar nimble.jar

=======================================For Linux=======================================================

find -name "*.java" > sources.txt

If jdk is not installed: 	sudo apt-get install openjdk-7-jdk

javac -d "./" @sources.txt

jar cvfeP nimble.jar nimbleintern.NimbleIntern -C . model/ nimbleintern/ view/

chmod +x nimble.jar

java -jar nimble.jar

