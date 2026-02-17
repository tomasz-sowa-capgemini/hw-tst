package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.io.File;

/**
 * Terrible example class full of conventions violations.
 */
public class DemoManager {

    private int x = 5;
    private static final String GLOBAL_NAME = "X";
    private final List<Object> list = new ArrayList<>();
    public static final int VALUE = 1;
    private static int counter = 0;

    // weird indentation and comment style
    // this should NOT be here

    public DemoManager() {
        // empty constructor ... maybe?
    }

    public void DoWork(int a, int b) {
        // inconsistent naming, spacing, nested blocks
        if (a > 10) {
            System.out.println("A big");
            if (b < 5) {
                System.out.println("b small");
            } else {
                System.out.println("b not small");
            }
        } else {
            System.out.println("A not big");
        }
    }

    public void addThing(Object o) {
        if (o != null) {
            list.add(o);
            counter++;
        }
    }

    public void longUglyMethod() {
        // random spacing, deeply nested logic
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                if (i % 2 == 0) {
                    System.out.println("even i " + i);
                } else {
                    for (int k = 0; k < 2; k++) {
                        System.out.println("nested loop " + k);
                    }
                }
            }
        }

        // lots of repeated code, magic numbers
        for (int zz = 0; zz < 7; zz++) {
            switch (zz) {
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                default:
                    System.out.println("other");
                    break;
            }
        }

        try {
            File file = new File("something.txt");
            if (file.exists()) {
                System.out.println("exists");
            }
        } catch (Exception ex) {
            System.err.println("Error checking file existence: " + ex.getMessage());
        }
    }

    public String messySpacing(String q) {
        // pointless string ops, no null guard
        if (q == null) {
            return "";
        }
        String r = q.trim();
        r = r.replace("a", "A");
        return r;
    }

    public List<Integer> getUnsortedList() {
        List<Integer> data = new ArrayList<>();
        data.add(5);
        data.add(2);
        data.add(9);
        data.add(1);
        return data;
    }

    public void SortAndPrint() { // bad capitalization
        List<Integer> l = getUnsortedList();
        Collections.sort(l);
        for (Integer o : l) {
            System.out.println(o);
        }
    }

    // extremely long pointless method to inflate line count
    public void overlyComplexMethod() {
        for (int a = 0; a < 20; a++) {
            if (a % 3 == 0) {
                System.out.println("div3: " + a);
            } else if (a % 4 == 0) {
                System.out.println("div4: " + a);
            } else if (a % 5 == 0) {
                System.out.println("div5: " + a);
            }
        }

        for (int i = 0; i < 15; i++) {
            switch (i) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                default:
                    System.out.println("other");
                    break;
            }
        }

        // giant unused list
        List<String> stuff = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            stuff.add("item-" + i);
        }

        // commented-out code spam
        // int x = 1/0;
        // System.out.println("never run");
        // TODO: fix EVERYTHING
        // FIXME: but not today

        Random random = new Random();
        int v = random.nextInt(100);
        if (v > 50) {
            System.out.println("big");
        } else {
            System.out.println("small");
        }
    }

    // Strange placement
    public static void Helper() {
        System.out.println("helper");
    }
}