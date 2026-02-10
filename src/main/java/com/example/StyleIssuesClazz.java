package com.example;

public class StyleIssuesClazz {
    // Missing Javadoc comment
    public static String greet() {
        return "Hello, World!";
    }

    // Line too long - exceeds typical 80-120 character limit depending on CheckStyle configuration
    public static void main(String[] args) {
        System.out.println("This is a very long line that will definitely exceed the maximum line length configured in CheckStyle rules and should trigger a violation");
        System.out.println(greet());
    }

    // Magic number without explanation
    public static int calculate() {
        return 42 * 100;
    }

    // Unused variable
    public static void unusedVariable() {
        int x = 10;
        System.out.println("Hello");
    }

    // Missing final modifier on parameter
    public static void processData(String data) {
        System.out.println(data);
    }
}