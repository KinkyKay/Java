package com.company.JavaCourse.day8.abstractandinterfaces;

public class Step extends Vehicule {
    public Step(String name) {
        super(name);
    }

    @Override
    public void elecDriven() {

    }

    public void drive(){
        System.out.println("step is moving");
    }
}
