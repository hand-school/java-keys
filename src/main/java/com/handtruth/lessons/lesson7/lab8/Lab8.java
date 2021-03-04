package com.handtruth.lessons.lesson7.lab8;

import java.util.Arrays;
import com.handtruth.lessons.lesson7.lab8.LinkedList;


public class Lab8 {

    public static void evenAction(Integer[] nums, int index) {
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[index] += nums[i];
            }
        }
    }
    public static void oddAction(Integer[] nums, int index) {
        for (int i = index - 1; i >= 0; i--) {
            if (nums[i] > 0) {
                nums[index] += nums[i];
            }
        }
    }


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        int length = (int) Math.round((Math.random() * (10)) + 3);
        Integer[] array = new Integer[length];
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenAction(array, i);
            } else {
                oddAction(array, i);
            }
        }

        System.out.println(Arrays.toString(array));
    }



}
