package com.company.JavaCourse.day8.abstractandinterfaces;

public class Snake extends Mammal implements Predator, Prey {
    public Snake(String name){
        super(name);
    }

    @Override
    public void runAndHide(){
        System.out.println("run and hide, mouse");
    }

    @Override
    public void noticePredators(){
        System.out.println("listening carefully");
    }

//    @Override
//    public void eat(){
//        System.out.println("swallow and wait");
//    }

    //annotation, starts with @
    //annotation adds a certain behavior / functionality / compilation check
    @Override
    public void catchPrey() {
        System.out.println("sneaking up on prey...");
    }


//    public void eatPrey(Prey mouse){
//        System.out.println("bye micky");
//    }

    public void searchPrey() {
        System.out.println("just gliding around, looking for mice");
    }
}
