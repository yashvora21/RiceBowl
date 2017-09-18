### For Windows

dir .\src\*.java /s /B > sources_list.txt

javac -d "./" @sources_list.txt

jar cvfeP RiceBowl.jar controller.MainClass -C . model/ controller/ view/

java -jar RiceBowl.jar

### For Linux 

find -name "*.java" > sources.txt

If jdk is not installed: 	sudo apt-get install openjdk-7-jdk

javac -d "./" @sources.txt

jar cvfeP RiceBowl.jar controller.MainClass -C . model/ controller/ view/

chmod +x RiceBowl.jar

java -jar RiceBowl.jar
