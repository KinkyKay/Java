package com.company.JavaCourse.day8.abstractandinterfaces;

public abstract class Vehicule {
    private String name;

    public Vehicule(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void elecDriven();

}



