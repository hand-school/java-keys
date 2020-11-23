package com.handtruth.lessons.lesson6.training.game;

public class Main {
    public static void main(String[] args) {
        Character human = new Character("John", 100, 100, 100, 100, 80, 10);
        Character orc = new Character("Orc", 120, 120, 80, 80, 90, 15);

        human.attack(orc);
        System.out.println(orc.health);
        System.out.println(orc.toString());

        System.out.println(human.health);
        System.out.println(human.defense);
        orc.attack(human);
        System.out.println(human.health);
        System.out.println(human.defense);
        Human human1 = new Human("John", 100, 100, 100, 100, 80, 10, 20);
        Character human3 = new Human("John", 100, 100, 100, 100, 80, 10, 20);
        human1.onlyHuman();
        human3.skill();
        Orc orc1 = new Orc("Orc", 120, 120, 80, 80, 90, 15);
        printHeroInfo(orc1);
        printHeroInfo(human1);
    }
    public static void printHeroInfo(Character ch) {
        System.out.println(ch.toString());
    }

}
