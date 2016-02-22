#### Number Guessing Game

This library can be used to play a number-guessing game.

####  Frameworks and Technologies used

1. Java 1.8
2. JUnit

#### Run Configurations:

# Build

```./gradlew clean build```
(if ay error with file permission, change the permission to executable and re-run the command. Even if it doesn't work, use your installed gradle -> gradle clean build)
Reports(checkStyle, PMD, findBugs, jacoco can be found at /build/reports/ 

# Testing

```./gradlew test```
Reports(testResults) can be found at /build/test-results/ 

# JavaDoc

```./gradlew javaDoc```
Reports(testResults) can be found at /build/docs/


# Running from main method
com.game.utils.Utils.java has the main method to play with the game


#####  Configuring IDE
Generate the project artifacts needed to successfully open your project by running the following command:

IntelliJ: `gradlew idea` (or just open the project from within the IDE and IntelliJ does the rest)





