package com.company.JavaCourse.day8.abstractandinterfaces;

//other classes can IMPLEMENT this interface
//not extend
//interfaces they can extend other interface
//some sort of contract behavior
public interface Prey {
    void runAndHide();
    void noticePredators();

    default void eat(){
        System.out.println("prey is eating");
    }

    static void countCal(Prey prey) {
        System.out.println("count your calories before you eat!");
    }

}

