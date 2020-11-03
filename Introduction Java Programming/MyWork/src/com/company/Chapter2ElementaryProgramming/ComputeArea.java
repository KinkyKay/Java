package com.company.Chapter2ElementaryProgramming;

// A java program begins with a class defenition in which the keyword class is followed by the class name.
public class ComputeArea {

    // Every java program must have a main method where program execution begins.
    public static void main(String[] args) {
        // In order to store the radius, the program needs to declare a symbol called a variable.
        // A variable represents a value stored in the computer's memory.
        // Choose descriptive names and specify their data types. This is know as declaring variables.
            double radius; // declare radius
            double area; // declare area

            // Step 1 : Designate the circle's radius using a fixed value
            radius = 20; // The radius is now 20

            // Step 2 : Compute area by assigning the result of the expression radius * radius * Pi to area
            area = radius * radius * 3.14159;

            // Step 3 : Display the area by using the system out println method
            System.out.println("The area for the circle of radiaus " + radius + " is " + area);
    }
}
