package com.handtruth.lessons.lesson6.example.ex2;

import com.handtruth.lessons.lesson6.example.ex1.Car;

public class Mercedes extends Car {
    public Mercedes(String color, Integer speed, String number) {
        super(color, speed, number);
        this.brand = "Mercedes";
    }
}
