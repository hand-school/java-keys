package com.handtruth.lessons.labs.lab9;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1 (A Яндекс)
//        Дан массив, заполненный элементами от 1 до N
//        Из массива убирается один элемент, оставшиеся элементы перемешиваются. Необходимо найти элемент, который убрали
//        Требования по памяти: O(1)
//        Требования по эффективности: O(N)

        int[] array = new int[]{1, 3, 6, 4, 2};
        int sum = 0;
        int n = array.length + 1;
        int sum2 = 1;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            sum2 += n - i;
        }
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum2 - sum);
    }
}
