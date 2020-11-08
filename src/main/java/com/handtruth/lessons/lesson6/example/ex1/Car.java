package com.handtruth.lessons.lesson6.example.ex1;

public class Car {
    public String brand = "NONE";
    public String color = "BLACK";
    public Integer speed = 100;
    public String number = "oa123s";

    public Car() {
    }

    public Car(String color, Integer speed, String number) {
        this.color = color;
        this.speed = speed;
        this.number = number;
    }

    public Car(String brand, String color, Integer speed, String number) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.number = number;
    }

    public void updateColor(String newColor) {
        this.color = newColor;
    }

    public void speedUp() {
        if (this.speed < 300) {
            this.speed += 25;
        }
    }

    public void speedDown() {
        if (this.speed > 0) {
            this.speed -= 25;
        }
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}