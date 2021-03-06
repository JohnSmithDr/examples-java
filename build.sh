echo '>> Build helloworld-gradle'
cd helloworld-gradle
gradle -q clean
gradle -q build
java -jar build/libs/helloworld-gradle.jar
cd ..

echo '>> Build helloworld-maven'
cd helloworld-maven
mvn -q clean package
java -jar target/helloworld-maven-1.0-SNAPSHOT.jar
cd ..

echo '>> Build helloworld-webapp'
cd helloworld-webapp
mvn -q clean package
gradle -q build
cd ..

echo '>> Build multiproject-gradle'
cd multiproject-gradle
gradle -q clean
gradle -q build
gradle -q test
gradle -q distZip
gradle -q run
cd ..

