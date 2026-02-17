package com.example;

/**
 * A class demonstrating style issues and their resolutions.
 */
public class StyleIssuesClazz {

    /**
     * Returns a greeting message.
     *
     * @return greeting string
     */
    public static String greet() {
        return "Hello, World!";
    }

    /**
     * Main method to execute the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Line too long - exceeds typical 80-120 character limit depending on CheckStyle configuration
        System.out.println(
                "This is a very long line that will definitely exceed the maximum line length configured "
                        + "in CheckStyle rules and should trigger a violation"
        );
        System.out.println(greet());
    }

    /**
     * Calculates a value based on predefined constants.
     *
     * @return calculated integer value
     */
    public static int calculate() {
        // Magic number without explanation
        final int BASE = 42;
        final int MULTIPLIER = 100;
        return BASE * MULTIPLIER;
    }

    /**
     * Demonstrates an unused variable scenario.
     */
    public static void unusedVariable() {
        // Unused variable
        final int x = 10;
        System.out.println("Hello");
    }

    /**
     * Processes the provided data.
     *
     * @param data input data string
     */
    public static void processData(final String data) {
        // Missing final modifier on parameter
        System.out.println(data);
    }
}