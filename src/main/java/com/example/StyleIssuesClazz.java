package com.example;

/**
 * Demonstrates basic Java style and best practices improvements.
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
     * Application entry point.
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
     * @return the result of the calculation
     */
    public static int calculate() {
        final int multiplier = 100; // Represents scaling factor
        final int baseValue = 42;   // Represents base constant
        return baseValue * multiplier;
    }

    /**
     * Prints a simple message to the console.
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