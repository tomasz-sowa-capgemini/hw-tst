package com.example;

public class HelloWorld {
    /**
     * Greets the user with "Hello, World!".
     *
     * @return A greeting string.
     */
    public static String greet() {
        return "Hello, World!";
    }

    /**
     * Main method entry point.
     *
     * @param args Command-line arguments (ignored).
     */
    public static void main(String[] args) {
        System.out.println(greet());
    }
}