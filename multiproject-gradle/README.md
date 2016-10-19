# Multi-project Example with Java & Gradle

### Sub-projects

+   `/shared` - common library
+   `/services` - business library
+   `/app` - application

### Build

Build all sub-projects with Gradle:

```
$ gradle build
```

Or run single build on each sub-project:

```
$ gradle :shared:build
$ gradle :services:build
$ gradle :app:build
```

### Tests

Run unit tests for all sub-projects:

```
$ gradle test
```

### Application

Add the application plugin into `build.gradle` file:

```gradle
apply plugin: 'application'
```

Pack as zip archive:

```
$ gradle distZip
```

A zip file will be generated in `build/distributions`.

Run the application:

```
$ gradle run
```