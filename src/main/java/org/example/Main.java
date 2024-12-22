package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

    public static void taskOne () {

        String arrOne[] = {"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"};
        // creating an instance of TreeSet and storing the values of first array
        TreeSet<String> trSet1 = new TreeSet<String>(Arrays.asList(arrOne));
        System.out.println("Elements of the first set: " + trSet1);
        // defining the second array
        String arrTwo[] = {"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y"};
        // creating an instance of TreeSet and storing the values of second array
        TreeSet<String> trSet2 = new TreeSet<String>(Arrays.asList(arrTwo));
        System.out.println("Elements of the second set: " + trSet2);
        // comparing both sets
        if (trSet1.equals(trSet2)) {
            System.out.println("Both sets are equal");
        } else {
            System.out.println("Both sets are not equal");
        }

        // Creating an empty one HashSet
        HashSet<String> h_set1 = new HashSet<String>();
        // Adding elements to the HashSet using the method add()
        h_set1.add("Red");
        h_set1.add("Green");
        h_set1.add("Black");
        h_set1.add("White");
        System.out.println("First HashSet content: " + h_set1);
        HashSet<String> h_set2 = new HashSet<String>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Orange");
        System.out.println("Second HashSet content: " + h_set2);
        //Save the elements that are the same for both sets in the first one using the method retainAll().
        h_set1.retainAll(h_set2);
        h_set2.retainAll(h_set1);
        System.out.println("HashSet content:");
        System.out.println(h_set1);
        System.out.println(h_set2);
       //using the method equals()
        if (h_set1.equals(h_set2)) {
            System.out.println("Both sets are equal");
        } else {
            System.out.println("Both sets are not equal");
        }
    }

    public static void taskTwo() {
        int[] arrTree = new int[]{0, 1, 2, 3, 4, 5, 15, 16, 17, 18, 20};
        for (int i = 0; i < arrTree.length; i++) {
            if (i > 0) {
                if (arrTree[i] > 15 && arrTree[i] % 2 == 0) {
                    System.out.println(arrTree[i]);
                }
                if (arrTree[i] % 2 != 0 && arrTree[i] < 15) {
                    System.out.println(arrTree[i] / 2);
                }
            }
        }
    }
}









