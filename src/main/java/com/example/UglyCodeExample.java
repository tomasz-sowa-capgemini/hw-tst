package com.example;

import java.util.*;
import java.io.*;

public class UglyCodeExample {

    public static void main(String[] args) {
        // This is a very important variable, trust me
        int x = 10; // x is a counter
        int y = 20; // Another counter variable
        String s = "Hello, World!";
        System.out.println(s);
        // Let's do some arithmetic operations
        // No, really, this is crucial logic
        int result = x + y * 2 - 1;
        System.out.println("Result is: " + result);

        List<String> items = Arrays.asList("Item1", "Item2", "Item3");
        for (String item : items) {
            System.out.println(item.toLowerCase());
        }

        // A loop that does something... maybe
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Middle iteration: " + i); // middle
            } else if (i == 4) {
                System.out.println("Last iteration " + i);
            } else {
                System.out.println("Iteration number: " + i);
            }
        }
        // This is a function call
        uglyMethod(x, y, "test"); // Call the very useful method below

        // SECURITY-SENSITIVE: Reading user input from console
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { // Reader
            System.out.print("Enter something: ");
            String line = br.readLine();
            if (line != null && !line.isEmpty()) {
                System.out.println("You entered: " + line);
            } else {
                System.out.println("You entered nothing.");
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }

    public static void uglyMethod(int a, int b, String c) {
        // This method does something... maybe
        System.out.println("Inside uglyMethod with parameters: " + a + ", " + b + ", " + c);
        // Some complex logic that is hard to understand
        int temp = a * b;
        if (temp > 100) {
            System.out.println("Temp is greater than 100: " + temp);
        } else {
            System.out.println("Temp is less than or equal to 100: " + temp);
        }
    }

}