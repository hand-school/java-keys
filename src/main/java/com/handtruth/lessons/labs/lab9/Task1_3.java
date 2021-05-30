package com.handtruth.lessons.labs.lab9;

public class Task1_3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4, 5, 2, 6, 9, 7};
        int sum = 0;
        int n = array.length + 1;
        int sum2 = n * (n + 1) / 2;

        for (int i : array) {
            sum += i;
        }

        System.out.println(sum2 - sum);
    }
}
