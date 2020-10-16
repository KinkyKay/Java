package com.company.Chapter2ElementaryProgramming;

import java.util.Scanner;                                             // import Scanner

public class DispleyTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                       // create a Scanner
        // Prompt the user for input
        System.out.println("Enter an integer for seconds: ");
        int seconds = input.nextInt();                                // read an integer

        int minutes = seconds / 60; // Find minutes in seconds        // divide
        int remainingSeconds = seconds % 60; // Seconds remaining     // remainder
        System.out.println(seconds + " seconds is " + minutes +
                " minutes and " + remainingSeconds + " seconds");
    }
}
