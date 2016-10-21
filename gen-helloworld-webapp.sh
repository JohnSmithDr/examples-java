projetName=helloworld-webapp

echo '>> Checking Environment ...'

echo '##### Java #####'
java -version

echo '##### Maven #####'
mvn --version

echo '##### Gradle #####'
gradle --version

echo '>> Initializing ...'

mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeCatalog=internal \
    -DarchetypeArtifactId=maven-archetype-webapp \
    -DgroupId=org.example.helloworld \
    -DartifactId=$projetName