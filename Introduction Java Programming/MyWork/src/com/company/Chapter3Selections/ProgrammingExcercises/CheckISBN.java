package com.company.Chapter3Selections.ProgrammingExcercises;

import java.util.Scanner;

public class CheckISBN {
    /* International Standard Booking Number consists of 10 digits; d1d2d3d4d5d6d7d8d9d10. The last digit d10
    is a checksum, which is calculated from the other 9 digits using the following formula:
    (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11
    If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
    Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN.
    Your program should read the input as an integer.
    Sample run: 013601267 ==> 0136012671
    Sample run: 013031997 ==> 013031997X
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of your ISBN: ");
        int isbn = input.nextInt();
        input.close();
        int d10 = 0, d9 = 1, d8 = 0, d7 = 0, d6 = 0, d5 = 0, d4 = 0, d3 = 0 , d2 = 0, d1 = 0;

        if (isbn > 0) {
            d9 = isbn % 10;
            System.out.println(d9);
            d9 = d9 / 10;
        }
        if (isbn > 0) {
            d8 = isbn % 100;
            d8 = d8 / 10;
            System.out.println(d8);
        }
        if (isbn > 0) {
            d7 = isbn % 1000;
            d7 = d7 / 100;
            System.out.println(d7);
        }
        if (isbn > 0 ) {
            d6 = isbn % 10000;
            d6 = d6 / 1000;
            System.out.println(d6);
        }
        if (isbn > 0 ) {
            d5 = isbn % 100000;
            d5 = d5 / 10000;
            System.out.println(d5);
        }
        if (isbn > 0 ) {
            d4 = isbn % 1000000;
            d4 = d4 / 100000;
            System.out.println(d4);
        }
        if (isbn > 0) {
            d3 = isbn % 10000000;
            d3 = d3 / 1000000;
            System.out.println(d3);
        }
        if (isbn > 0 ) {
            d2 = isbn % 100000000;
            d2 = d2 / 10000000;
            System.out.println(d2);
        }
        if (isbn > 0) {
            d1 = isbn % 1000000000;
            d1 = d1 / 100000000;
            System.out.println(d1);
        }

        d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        System.out.println(d10);

        if (d10 == 10) {
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
            } else {
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        }
    }
}
