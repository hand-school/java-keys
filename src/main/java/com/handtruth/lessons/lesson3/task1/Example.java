package com.handtruth.lessons.lesson3.task1;

public class Example {

    public static void main(String[] args) {
//        while (<условие>) {
//            <блок кода>
//        }

        int n = 0;
        while (canGoNext(n)) {
            System.out.println("Действие");
            n++;
        }

        System.out.println("-------------------");

        int c = 0;
        do {
            System.out.println("Действие");
            c++;
        } while (canGoNext(c));

        System.out.println("-------------------");

        for (int i = 0; i < 15; i+=2) {
            System.out.println(i);
        }
    }

    private static boolean canGoNext(int count) {
        System.out.println("Проверка");
        return count < 3;
    }

}
