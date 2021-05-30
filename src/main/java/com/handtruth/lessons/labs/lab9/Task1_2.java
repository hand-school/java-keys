package com.handtruth.lessons.labs.lab9;

//    Реализовать, но подсёт элементов от 1 до н в отдельном сикле

public class Task1_2 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 4, 5, 2, 7};
        int sum = 0;
        int n = array.length + 1;
        int sum2 = 0;

        for (int i : array) {
            sum += i;
        }

        for (int i = 0; i < n; i++) {
            sum2 += n - i;
        }

        System.out.println(sum2 - sum);
    }
}
