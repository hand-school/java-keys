package com.handtruth.lessons.lesson6.example.ex3;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = Phone.create("Samsung S10e", 3000, 12, 10);
        System.out.println(phone1.toString());
        System.out.println(phone1.getAndroidVersion());
        phone1.setAndroidVersion(13);
        System.out.println(phone1.getAndroidVersion());
    }
}
