package com.example;

/**
 * Demonstrates basic Java coding standards and best practices.
 */
public class StyleIssuesClazz {

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
                "This is a very long line that will definitely exceed the maximum line length "
                        + "configured in CheckStyle rules and should trigger a violation"
        );
        System.out.println(greet());
    }

    /**
     * Performs a simple calculation.
     *
     * @return the result of multiplying the base value by the multiplier
     */
    public static int calculate() {
        final int baseValue = 42;
        final int multiplier = 100;
        return baseValue * multiplier;
    }

    /**
     * Prints a simple message to the console.
     */
    public static void printMessage() {
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