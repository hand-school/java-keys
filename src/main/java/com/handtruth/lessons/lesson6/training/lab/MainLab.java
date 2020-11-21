package com.handtruth.lessons.lesson6.training.lab;

public class MainLab {
    public static void main(String[] args) {

        OrganisationAddress KSU = new OrganisationAddress(248023, "Kaluga", "Stepana Razina", 6);

        KSU.setStreet("Tulskaya");
        KSU.setHouse(48);
        System.out.println(KSU.toString());
        System.out.println("");

        KSU.setIndex(248001);
        KSU.removeHouse();
        System.out.println(KSU.toString());
        System.out.println("");

        KSU.removeAll();
        System.out.println(KSU.toString());
        System.out.println("");

        KSU.setIndex(10000);
        System.out.println(KSU.toString());

        KSU.setIndex(249406);
        System.out.println(KSU.toString());
    }
}
