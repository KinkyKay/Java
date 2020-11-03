package com.company.Chapter2ElementaryProgramming;

import java.util.Scanner;

public class ReadingNumbersFromTheKeyboard {
    public static void main(String[] args) {
        // Here are examples for reading values of various types from the keyboard

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte value: ");
        byte byteValue = input.nextByte();

        System.out.println("Enter a short value: ");
        short shortValue = input.nextShort();

        System.out.println("Enter a int value: ");
        int intValue = input.nextInt();

        System.out.println("Enter a long value: ");
        long longValue = input.nextLong();

        System.out.println("Enter a float value: ");
        float floatValue = input.nextFloat();

        System.out.println("Enter a double value: ");
        double doubleValue = input.nextDouble();
    }
}
