package com.handtruth.lessons.lesson6.example.ex2;

public class Main2 {
    public static void main(String[] args) {
        BMW bmw = new BMW("BLACK", 270, "af456h");
        Mercedes mercedes = new Mercedes("WHITE", 290, "av456h");

        bmw.speedDown();
        bmw.speedUp();

        mercedes.updateColor("RED");

    }
}
