echo Build helloworld-gradle
cd helloworld-gradle
gradle clean build
cd ..

echo Build helloworld-maven
cd helloworld-maven
mvn clean install
cd ..