# Java 9 example application
Example application of Java 9 with Maven and usage of service providing with the ServiceLoader api. 

The CLI module do not have direct access to the concrete implementations.

# Run

Execute the following command from the root of the project. Ensure that Java 9 is on the path:
```
./compileAndRun.sh
```

#### There is also some kind of Maven support. 

Compile code with:

```
mvn clean compile
```

and run the application:
```
./run.sh
```