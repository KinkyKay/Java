package com.company.JavaCourse.day1and2;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car myCar = new Car();
        String toyota = "Toyota";
        myCar.setBrand(toyota);
        myCar.setLicensePlate("05hjg5");
        myCar.setWeight(1100.5);
        myCar.setYear(2010);
        myCar.setConvertible(false);
        String s = myCar.honkSound();
       // System.out.println(myCar.honkSound());

        myCar.honk();
        myCar.annoy();
        myCar.annoyWithSpecificSound("lalalallalaa", 12);
        myCar.annoyWithSpecificSound("pieppieppiep", 6);

        // Good Style
        System.out.println(3 + 4 * 4 );

        // Bad Style
        System.out.println(3+4*4);



    }
}
