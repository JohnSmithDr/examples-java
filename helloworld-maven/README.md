# Hello World Example with Java & Maven

Initialize project by:

```
$ mvn archetype:generate \
      -DinteractiveMode=false \
      -DarchetypeCatalog=internal \
      -DarchetypeArtifactId=maven-archetype-quickstart \
      -DgroupId=org.example.helloworld \
      -DartifactId=helloworld-maven
```

Build with Maven:

```
$ mvn -q clean install
```

Outputs the .jar file to target

Run unit tests:

```
$ mvn -q clean test
```

Run the application:

```
$ java -jar target/helloworld-maven-1.0-SNAPSHOT.jar
$ java -jar target/helloworld-maven-1.0-SNAPSHOT.jar John
```
