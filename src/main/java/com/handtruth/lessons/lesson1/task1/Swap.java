package com.handtruth.lessons.lesson1.task1;

public class Swap {
    public static int swap(int number) {
        int firstNum = number % 10;
        int endNum = number / 1000;
        int midNum = (number / 10) % 100;
        int newNum = firstNum * 1000 + midNum * 10 + endNum;
        return newNum;
    }

    public static void main(String[] args) {
        int result = swap(1234);
        System.out.println(result);
    }
}
