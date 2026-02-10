package com.example;

/**
 * A simple class that demonstrates a basic "Hello, World!" program.
 * <p>
 * This class provides a method to generate a greeting message and
 * prints it to the console when executed.
 * </p>
 */
public class HelloWorld {

    private static final String GREETING_MESSAGE = "Hello, World!";

    /**
     * Returns a greeting message.
     *
     * @return the greeting message
     */
    public static String getGreetingMessage() {
        return GREETING_MESSAGE;
    }

    /**
     * The entry point of the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println(getGreetingMessage());
    }
}