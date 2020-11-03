package com.company.Chapter2ElementaryProgramming;

import java.util.Scanner;       // import class Scanner

public class ComputeLoan {
    // Write the program with the following requirements:
    // - It must let the user enter the interest rate, the loan amount, and the number of years
    //   for which payments will be made.
    // - It must compute and display the monthly payment and total payment amounts.
    public static void main(String[] args) {
     // create a Scanner
        Scanner input = new Scanner(System.in);

     // Enter annual interest rate in percentage
        System.out.println("Enter annual interest rate, 7,25: ");
        double annualInterestRate = input.nextDouble();

     // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

     // Enter number of years
        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

     // Enter loan amount
        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();

     // Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

     // Display results
        System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);
    }
}
