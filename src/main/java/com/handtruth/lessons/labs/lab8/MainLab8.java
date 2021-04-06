package com.handtruth.lessons.labs.lab8;

import java.util.Arrays;

public class MainLab8 {
    //  ДЕЙСТВИЕ ДЛЯ ЧЁТНЫХ ИНДЕКСОВ
    public static void evenAction(Integer[] nums, int index) {
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums[index] += nums[i];
            }
        }
    }

    //  ДЕЙСТВИЕ ДЛЯ НЕЧЁТНЫХ ИНДЕКСОВ
    public static void oddAction(Integer[] nums, int index) {
        for (int i = index - 1; i >= 0; i--) {
            if (nums[i] > 0) {
                nums[index] += nums[i];
            }
        }
    }


    public static void main(String[] args) {

//      СОЗДАНИЕ ПУСТОГО МАССИВА С РАНДОМНЫМ КОЛ-ВОМ ЭЛЕМЕНТОВ
        int length = (int) Math.round((Math.random() * (10)) + 3);
        Integer[] array = new Integer[length];
//      ВЫВОД ПУСТОГО МАССИВА С РАНДОМНЫМ КОЛ-ВОМ ЭЛЕМЕНТОВ
        System.out.println(Arrays.toString(array));

//      ЗАПОЛНЕНИЕ МАССИВА РАНДОМНЫМИ ЧИСЛАМИ
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
        }
//      ВЫВОД МАССИВА
        System.out.println(Arrays.toString(array));

//      ВЫПОЛНЕНИЕ ДЕЙСТВИЙ НАД МАССИВОМ
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenAction(array, i);
            } else {
                oddAction(array, i);
            }
        }

//      ВЫВОД ИТОГОГО МАССИВА
        System.out.println(Arrays.toString(array));
    }
}
