package com.company.Chapter1Introduction.ProgrammingExcercises;

public class AverageSpeedInMiles {
    // Assume that a rummer runs 15 kilometers in 50 minutes and 30 seconds.
    // Write a program that displays the average speed in miles per hour.
    // Note that 1 mile is 1.6 kilometers.

    public static void main(String[] args) {
        double kilometers = 15;
        double miles = (kilometers / 1.6);
        double hoursRun = 0;
        double minutesRun = 50;
        double secondsRun = 30;
        double totalHoursRun = hoursRun + (minutesRun/60) + (secondsRun/3600);
        double milesPerHour = miles / totalHoursRun;

        System.out.println(milesPerHour);

        //Solution from the book
        System.out.println((1 / 50.5) * 60 * 15 / 1.6 );
    }
}
