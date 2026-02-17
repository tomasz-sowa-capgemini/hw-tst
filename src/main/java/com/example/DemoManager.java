package com.example;

import java.util.*; 
import java.io.*;

class DemoManager {
    private int x = 5; 
    private static String GLOBAL_NAME = "X";
    private List<Object> list = new ArrayList<>(); // Use generics for type safety
    public static final int VALUE = 1;
    private static int counter = 0;

    DemoManager() {
        // Empty constructor ... maybe?
    }

    void DoWork(int A, int b) {
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

    void addThing(Object o) {
        list.add(o); 
        counter++;
    }

    void longUglyMethod() {
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
            if (f.exists()) {
                System.out.println("exists");
            }
        } catch (Exception ex) {
            // Handle the exception appropriately, instead of ignoring it.
        }
    }

    String messySpacing(String q) {
        String r = q.trim();
        r = r.replace("a", "A");
        return r;
    }

    List<Integer> getUnsortedList() {
        List<Integer> data = new ArrayList<>();
        data.add(5);
        data.add(2);
        data.add(9);
        data.add(1);
        return data;
    }

    void SortAndPrint() {
        List<Integer> l = getUnsortedList();
        Collections.sort(l); 
        for (Integer o : l) {
            System.out.println(o);
        }
    }

    void overlyComplexMethod() {
        int a = 0;
        while (a < 20) {
            if (a % 3 == 0) {
                System.out.println("div3: " + a);
            } else if (a % 4 == 0) {
                System.out.println("div4: " + a);
            } else if (a % 5 == 0) {
                System.out.println("div5: " + a);
            } else {
                System.out.println("no match: " + a);
            }
            a++;
        }
    }
}