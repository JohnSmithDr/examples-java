# Hello World Example with Java & Gradle

### Initialize

Initialize project by:

```
$ gradle init --type java-library
```

### Build

Build with Gradle:

```
$ gradle build
```

Outputs the .jar file to `build/lib`

### Tests

Run unit tests:

```
$ gradle test
```

Runs unit tests on code (by default). 
Outputs an HTML file with test results to `build/reports/tests/index.html`.

Code coverage report:

```
$ gradle jacoco
```

Outputs a code coverage report to `build/reports/jacoco/test/html/index.html`.

### Run

Run the application:

```
$ java -jar build/libs/helloworld-gradle.jar
$ java -jar build/libs/helloworld-gradle.jar John
```

### Troubleshooting

#### 1. Missing menifest in jar ( main class not found )

The default built jar seems has no menifest file, so it can not be run by the java command 
(the main class not found). 

To solve this problem, add the following script in `build.gradle` to specify manifest and main class for jar file.

```gradle
jar {
    manifest {
        attributes 'Implementation-Title': 'helloworld-gradle',
                   'Implementation-Version': 1.0,
                   'Main-Class': 'org.example.helloworld.App'
    }
}
```