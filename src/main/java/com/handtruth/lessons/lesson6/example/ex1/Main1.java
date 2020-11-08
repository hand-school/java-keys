package com.handtruth.lessons.lesson6.example.ex1;

public class Main1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.color);
        System.out.println(c1.speed);
        System.out.println(c1.number);

        System.out.println();

        Car c2 = new Car("RED", 25, "ad213g");
        System.out.println(c2.color);
        System.out.println(c2.speed);
        System.out.println(c2.number);

        System.out.println();
        c2.updateColor("WHITE");
        System.out.println(c2.color);
        System.out.println();

        c2.speedUp();
        c2.speedUp();
        c2.speedUp();
        c2.speedUp();
        System.out.println(c2.speed);
        c2.speedDown();
        c2.speedDown();
        c2.speedDown();
        c2.speedDown();
        System.out.println(c2.speed);
        c2.speedDown();
        System.out.println(c2.speed);
        c2.speedDown();
        System.out.println(c2.speed);
    }
}
