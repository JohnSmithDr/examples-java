# Spring Hello Web App Example

### Initialize

Initialize project with maven:

```
mvn archetype:generate \
    -DinteractiveMode=false \
    -DarchetypeCatalog=internal \
    -DarchetypeArtifactId=maven-archetype-webapp \
    -DgroupId=org.example.helloworld \
    -DartifactId=helloworld-webapp
```

And initialize with gradle:

```
cd helloworld-webapp
gradle init
```

### Build

Build using maven:

```
$ mvn clean package
```

Build using gradle:

```
$ gradle build
```

### Run Web Application

Run the application using maven:

```
$ mvn spring-boot:run
```

Run the application using gradle:

```
$ gradle bootRun
```

