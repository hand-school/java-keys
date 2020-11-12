package com.handtruth.lessons.lesson6.training;

public class Main {
    public static void main(String[] args) {
        Character human = new Character("John", 100, 100, 100, 100, 80, 10);
        Character orc = new Character("Orc", 120, 120, 80, 80, 90, 15);

        human.attack(orc);
        System.out.println(orc.health);
        System.out.println(orc.toString());

    }
}
