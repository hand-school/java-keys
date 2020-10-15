package com.handtruth.lessons.lesson3.task1;

public class Hello5 {

    //  Используя счётчик, напиши программу, которая 5 раз выводит слово “Hello”.
    public static void main(String[] args) {
        int n = 0;
        int a = 0;
        while (n < 5) {
            System.out.println("Hello");
            n++;
        }
        System.out.println();
        do {
            System.out.println("Hello");
            a++;
        } while (a < 5);
        System.out.println();
        for ( int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}
