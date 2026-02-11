package com.example;

/**
 * Demonstrates basic Java coding standards and style improvements.
 * This class provides simple methods for greeting, calculation, and data processing.
 */
public class StyleIssuesClazz {

    private static final int MULTIPLIER = 100;
    private static final int BASE_VALUE = 42;

    /**
     * Returns a greeting message.
     *
     * @return a greeting string
     */
    public static String greet() {
        return "Hello, World!";
    }

    /**
     * Entry point of the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println(
                "This is a very long line that will definitely exceed the maximum line length configured "
                        + "in CheckStyle rules and should trigger a violation"
        );
        System.out.println(greet());
    }

    /**
     * Performs a simple calculation using predefined constants.
     *
     * @return the result of the calculation
     */
    public static int calculate() {
        return BASE_VALUE * MULTIPLIER;
    }

    /**
     * Prints a simple message to the console.
     * Demonstrates removal of unused variables.
     */
    public static void unusedVariable() {
        System.out.println("Hello");
    }

    /**
     * Processes and prints the provided data.
     *
     * @param data the data to process
     */
    public static void processData(final String data) {
        System.out.println(data);
    }
}