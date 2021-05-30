package com.handtruth.lessons.labs.lab9;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 5, 3, 6, 0, 0, 9};

        int prev = 0;
        int row = 0;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == 0 && array[i + 1] != 0 && row != 0) {
                int tmp = array[prev];
                array[prev] = array[i + 1];
                array[i + 1] = tmp;
                prev++;
            }

            if (array[i] == 0 && array[i + 1] != 0) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
            }

            if (array[i] == 0 && array[i+1] == 0) {
                if (row == 0) {
                    prev = i;
                    row = 1;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
