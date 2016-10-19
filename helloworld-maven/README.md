# Hello World Example with Java & Maven

### Initialize

```
$ mvn archetype:generate \
      -DinteractiveMode=false \
      -DarchetypeCatalog=internal \
      -DarchetypeArtifactId=maven-archetype-quickstart \
      -DgroupId=org.example.helloworld \
      -DartifactId=helloworld-maven
```

### Build

Build with Maven:

```
$ mvn -q clean install
```

Outputs the .jar file to `target`

### Tests

Run unit test with Maven:

```
$ mvn -q clean test
```

### Run

Run the application:

```
$ java -jar target/helloworld-maven-1.0-SNAPSHOT.jar
$ java -jar target/helloworld-maven-1.0-SNAPSHOT.jar John
```

### Troubleshooting

#### 1. Encoding warning
There is encoding warning during building. Avoid it by specify encoding in `pom.xml`

```xml
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
    <maven.compiler.encoding>UTF-8</maven.compiler.encoding> 
  </properties>
```

#### 2. Missing menifest in jar ( main class not found )

The default built jar seems has no menifest file, so it can not be run by the java command 
(the main class not found). 

To solve this problem, use the maven shade plugin to generate the manifest (which specify the main class) for jar file. 
Add this in `pom.xml`

```xml
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-shade-plugin</artifactId>
        <version>1.2.1</version>
        <executions>
          <execution>
            <phase>package</phase>
            <goals>
              <goal>shade</goal>
            </goals>
            <configuration>
              <transformers>
                <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                  <mainClass>org.example.helloworld.App</mainClass>
                </transformer>
              </transformers>
            </configuration>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>
```