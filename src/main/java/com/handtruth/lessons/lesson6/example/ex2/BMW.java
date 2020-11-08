package com.handtruth.lessons.lesson6.example.ex2;

import com.handtruth.lessons.lesson6.example.ex1.Car;

public class BMW extends Car {
    public BMW(String color, Integer speed, String number) {
        super(color, speed, number);
        this.brand = "BMW";
    }
}
