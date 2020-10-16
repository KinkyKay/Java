package com.company.Chapter2ElementaryProgramming;

import java.util.Scanner;  // imports the java util class Scanner
// import java.util.*; => wildcard import

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // To use a different radius, you have to modify the source code and recompile it.
        // Obiviously, this is not convenient, so instead you can use the Scanner class for console input.
        // The whole line creates a Scanner object and assigns its reference to the variable input.
        Scanner input = new Scanner(System.in);
            //Java uses System.out to refer to the standard output device,
            // and System.in to the standerd input device.

        // Prompt the user to enter a radius
        // An object may invoke its methods.
        // To invoke a method on an object is to ask the object to perform a task.
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble(); // This statement reads a number from the keyboard and assigns it to radius.

        // Compute area
        double area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
