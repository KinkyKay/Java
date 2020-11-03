package com.company.Chapter2ElementaryProgramming;

public class ExponentOperations {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 3));                 // Displays 8.0
        System.out.println(Math.pow(4, 0.5));               // Displays 2.0
        System.out.println(Math.pow(2.5, 2));               // Displays 6.25
        System.out.println(Math.pow(2.5, -2));              // Displays 0.16

        // System.out.println("25 / 4 is " + 25/4);            // not correct
        System.out.println("25 / 4.0 is " + 25/4.0);           // correct
        // System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);    // not correct
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);   // correct
    }
}
