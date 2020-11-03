package com.company.Chapter2ElementaryProgramming;

import java.util.Scanner;

public class ComputeChange {
    // 1. Prompt the user to enter the amount as a decimal number, such as 11,56
    // 2. Convert the amount (11,56) into cents (1156)
    // 3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using the cents remainder 100.
    // 4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining cents cents using the remaining cents remainder 100.
    // 5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining cents using the remainging cents remainder 10.
    // 6. Divide the rmaining cents by 5 to find the number of nickels. Obtain the remaining cents using the remaining cents remainder 5.
    //7. The remaining cents are the pennies.
    // 8. Display the result.
    public static void main(String[] args) {
    // Create a scanner
        Scanner input = new Scanner(System.in);
    // Receive the amount
        System.out.println("Enter the amount, for example 11,56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
    // Find the number of one dollars
        int numberOfDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
    // Find the number of quarters in the remaining amount.
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
    // Find the number of dimes in the remaining amount.
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
    // Find the number of nickels in the remaining amount.
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
    // Find the number of pennies in the remaining amount.
        int numberOfPennies = remainingAmount;
    // Display the result
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
