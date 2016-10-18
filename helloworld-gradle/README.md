# Hello World Example with Java & Gradle

Initialize project by:

```
$ gradle init --type java-library
```

Build with Gradle:

```
$ gradle build
```

Outputs the .jar file to build/lib

Run unit tests:

```
$ gradle test
```

Runs JUnit tests on code (by default). 
Outputs an HTML file with test results to `build/reports/tests/index.html`.

Code coverage report:

```
$ gradle jacoco
```

Outputs a code coverage report to `build/reports/jacoco/test/html/index.html`.

Run the application:

```
$ java -jar build/libs/helloworld-gradle.jar
$ java -jar build/libs/helloworld-gradle.jar John
```
