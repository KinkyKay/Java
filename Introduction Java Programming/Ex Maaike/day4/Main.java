package com.company.JavaCourse.day4;

import com.company.JavaCourse.day1and2.Facility;

public class Main {
    public static void main(String[] args) {
        Gym gym = new Gym();
        Facility f = new Facility();
        f.setName("sauna");
        gym.addFacility(f);
        f.setName("tanning bed");
        gym.addFacility(89,"big pool", false);

        for(Facility facility : gym.getFacilities()){
            System.out.println(facility.getName());
        }

        System.out.println("€");

    }
}
