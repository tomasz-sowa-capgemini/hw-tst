package com.example;

public class HelloWorld {

    /**
     * Returns a greeting message.
     *
     * @return a greeting string
     */
    public static String greet() {
        return "Hello, World!";
    }

    /**
     * Main entry point of the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println(greet());
    }
}