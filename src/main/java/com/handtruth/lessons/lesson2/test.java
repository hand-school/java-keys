package com.handtruth.lessons.lesson2;

public class test {
    private static boolean FirstPointRes(int x1, int y1) {
        if (x1 % 2 == 0) {
            return y1 % 2 == 0;
        } else return y1 % 2 != 0;
    }
    public static void main(String[] args) {
        System.out.println(FirstPointRes(2,1));
    }
}
