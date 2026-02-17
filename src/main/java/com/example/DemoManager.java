package com.example;

import java.util.*;
import java.io.*; // multiple imports on same line (bad)

/**
 * Terrible example class full of conventions violations.
 */
public class DemoManager {
    public int x = 5;
    public static String gLOBAL_name = "X";
    private ArrayList list = new ArrayList(); // raw type (bad)
    public static final int VALUE = 1;
    public static int counter = 0; // inconsistent spacing

    // weird indentation and comment style
    // this should NOT be here

    public DemoManager() {
        // empty constructor ... maybe?
        int unusedLocal = 123; // unused var
    }

    public void DoWork(int A, int b) {
        // inconsistent naming, spacing, nested blocks
        if (A > 10) {
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
        list.add(o); // using raw list, also no null check
        counter++;
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
        int zz = 0;
        while (zz < 7) {
            if (zz == 3) {
                System.out.println("three");
            } else if (zz == 4) {
                System.out.println("four");
            } else {
                System.out.println("other");
            }
            zz++;
        }

        try {
            File f = new File("something.txt");
            if (f.exists())
                System.out.println("exists");
        } catch (Exception ex) {
            // ignored
        }
    }

    public String messySpacing(String q) {
        // pointless string ops, no null guard
        String r = q.trim();
        r = r.replace("a", "A");
        return r;
    }

    public List getUnsortedList() {
        ArrayList data = new ArrayList();
        data.add(5);
        data.add(2);
        data.add(9);
        data.add(1);
        return data;
    }

    public void SortAndPrint() { // bad capitalization
        List l = getUnsortedList();
        Collections.sort(l); // raw list, no generics
        for (Object o : l) {
            System.out.println(o);
        }
    }

    // extremely long pointless method to inflate line count
    public void overlyComplexMethod() {
        int a = 0;
        while (a < 20) {
            if (a % 3 == 0) {
                System.out.println("div3: " + a);
            } else if (a % 4 == 0) {
                System.out.println("div4: " + a);
            } else if (a % 5 == 0) {
                System.out.println("div5: " + a);
            }
            a++;
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
            }
        }

        // giant unused list
        List stuff = new ArrayList();
        for (int i = 0; i < 50; i++) {
            stuff.add("item-" + i);
        }

        // commented-out code spam
        // int x = 1/0;
        // System.out.println("never run");
        // TODO: fix EVERYTHING
        // FIXME: but not today

        Random R = new Random();
        int v = R.nextInt(100);
        if (v > 50) {
            System.out.println("big");
        } else {
            System.out.println("small");
        }
    }

    // Strange placement
    public static void Helper(){
    System.out.println("helper");
       }
}