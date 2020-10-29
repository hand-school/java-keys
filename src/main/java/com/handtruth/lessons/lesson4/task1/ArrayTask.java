package com.handtruth.lessons.lesson4.task1;

import java.util.ArrayList;
import java.util.List;

public class ArrayTask {

    //  Easy
//  На вход передается массив, состоящий из фамилий
//  А также буква
//  Вывести количетсво фамилий, начинающихся на эту букву
//  ИГНОРИРОВТЬ case
    public static int filterPeoples(String[] lastNames, char filter) {
        int num = 0;
        for (String lastName : lastNames) {
            if (lastName.toLowerCase().charAt(0) == Character.toLowerCase(filter)) {
                num++;
            }
        }
        return num;
    }

    //  Easy
//  На вход передается массив из чисел
//  Заменить в исходном массиве все отрицательные числа на 0
//  Вернуть полученный массив
    public static int[] changeNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
        }
        return numbers;
    }

    //  Easy
//  Необходио развернуть массив
    public static int[] revertArray(int[] array) {
        int last = array.length - 1;
        int tmp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[last];
            array[last] = tmp;
            last--;
        }
        return array;
    }

    //  Medium
//  Необходимо вернуть все различные элементы массивов
//  Примечание:  значения в массивах отсортированы по возрастанию
    public static int[] uncommonPartOfArr(int[] arr1, int[] arr2) {
        return null;
    }

}
