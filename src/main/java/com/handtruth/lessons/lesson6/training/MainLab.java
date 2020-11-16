package com.handtruth.lessons.lesson6.training;

public class MainLab {
    public static void main(String[] args) {
        Organisation KSU = new Organisation(248023, "Kaluga", "Stepana Razina", 6);

        KSU.setStreet("Tulskaya");
        KSU.setHouse(48);

        System.out.println(KSU.toString());
    }
}
