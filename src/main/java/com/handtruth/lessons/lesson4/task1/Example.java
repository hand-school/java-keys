package com.handtruth.lessons.lesson4.task1;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
//        ИНИЦИАЛИЗАЦИЯ
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[10];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

//        ПОЛУЧЕНИЕ РАЗМЕРА
        int lenArr1 = arr1.length;
        int lenArr2 = arr2.length;

        System.out.println(lenArr1);
        System.out.println(lenArr2);

//        ДОСТУП ПО ЭЛЕМЕНТАМ
        int elem = arr1[2];
        System.out.println(arr1[3]);
        arr1[1] = 9;
        System.out.println(arr1[1]);

//        ДОБАВЛЕНИЕ ЭЛЕМЕНТА (ХУЕТА)
//        arr1[6] = 5;  java.lang.ArrayIndexOutOfBoundsException: 6

        String[] strings = new String[] {"Hello", "World"};
        System.out.println(Arrays.toString(strings));

//        ИТЕРАЦИЯ ПО МАССИВУ
        System.out.println("____________________");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(i);
            System.out.print(" - ");
            System.out.print(arr1[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("____________________");
        for (int element: arr1) {
            System.out.println(element);
        }
    }
}
