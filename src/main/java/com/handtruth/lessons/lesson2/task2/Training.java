package com.handtruth.lessons.lesson2.task2;

public class Training {
    private static void caseTest (int arg) {
        switch (arg) {
            case 1: System.out.print("A");
            case 2: System.out.print("B");
            case 3: System.out.print("C");
        }
    }

    public static void main(String[] args) {
        caseTest(3);
        caseTest(2);
        caseTest(1);
    }
}
