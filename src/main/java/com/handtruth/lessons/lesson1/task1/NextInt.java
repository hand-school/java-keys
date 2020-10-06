package com.handtruth.lessons.lesson1.task1;

public class NextInt {
    //TODO: Вернуть следующее чётное число
    public static int nextInt(int a) {
        if (a % 2 == 0) {
            a += 2;
        } else {
            a += 1;
        }

        return a;
    }

    public static void main(String[] args) {
        int result1 = nextInt(11); // 12
        int result2 = nextInt(12); // 14
        System.out.println(result1);
        System.out.println(result2);
    }
}