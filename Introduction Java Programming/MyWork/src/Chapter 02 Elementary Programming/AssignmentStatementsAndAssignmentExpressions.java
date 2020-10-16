package com.company.Chapter2ElementaryProgramming;

public class AssignmentStatementsAndAssignmentExpressions {
    public static void main(String[] args) {

    // Examples of 04 Assignment Statements and Assignment Expressions

    int y = 1;                                  // Assign 1 to variable y
    double radius = 1.0;                        // Assign 1.0 to variable radius
    int x = 5 * ( 3 / 2);                       // Assign the value of the expression to x
    x = y + 1 ;                                 // Assign the addition of y and 1 to x
    double area = radius * radius * 3.14159;    // Compute area
    int i = 1;
    int j = 0;
    int k = 0;

    // The following statements are equivalent to each other
        // First statement
            System.out.println(x = 1);

        // Second statement
            x = 1;
            System.out.println(x);

    // If a value is assigned to multiple variables, you can use the following syntax:
        i = j = k = 1;

    // wich is equivalent to
        k = 1;
        j = k;
        i = j;

    }
}
