# Hello World (Maven)

This repository is a minimal Maven Java project with a single `HelloWorld` class and a JUnit 5 test.

Build and run (Windows `cmd.exe`):

```cmd
cd /D "C:\Users\tosowa\OneDrive - Capgemini\Desktop\hello-world"
mvn -q clean test
mvn -q package
java -cp target/hello-world-1.0-SNAPSHOT.jar com.example.HelloWorld
```

Run tests only:

```cmd
cd /D "C:\Users\tosowa\OneDrive - Capgemini\Desktop\hello-world"
mvn -q test
```
