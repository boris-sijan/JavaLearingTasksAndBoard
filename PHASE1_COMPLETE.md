## Ready to Run

The project is ready to be compiled and run once you have Java 21+ and Maven installed:

```bash
# Run all tests
mvn clean test

# Compile the project
mvn compile

# Run the demo application
mvn exec:java -Dexec.mainClass="com.taskboard.TaskBoardApplication"

# Generate test coverage report
mvn test jacoco:report
```
