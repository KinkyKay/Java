package com.company.JavaCourse.day8.abstractandinterfaces;

public abstract class Dog extends Mammal implements Prey{
    public Dog(String name){
        super(name);
    }

    public void eat(){
        System.out.println("dog is eating");
    }

    public void countCal() {
        System.out.println("counting calories");
    }

    //this is not allowed, because dog is not abstract
    //public abstract void iDontKnow();
}
