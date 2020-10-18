package com.handtruth.lessons.lesson4.task1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.handtruth.lessons.lesson4.task1.ArrayTask.changeNumbers;
import static com.handtruth.lessons.lesson4.task1.ArrayTask.filterPeoples;
import static com.handtruth.lessons.lesson4.task1.ArrayTask.uncommonPartOfArr;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTaskTest {

    @Test
    @Tag("Easy")
    void filterPeoplesTest() {
        String[] arr = new String[]{"Петров", "Иванов", "сидоров"};

        assertEquals(1, filterPeoples(arr, 'C'));
    }

    @Test
    @Tag("Easy")
    void changeNumbersTest() {
        int[] arr = new int[]{1, 2, 3, 0, -2, -3};
        int[] expected = new int[]{1, 2, 3, 0, 0, 0};

        assertArrayEquals(expected, changeNumbers(arr));
        assertArrayEquals(new int[0], new int[0]);
    }

    @Test
    @Tag("Easy")
    void revertArrayTest() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int[] expected = new int[]{6, 5, 4, 3, 2, 1};

        assertArrayEquals(expected, changeNumbers(arr));
        assertArrayEquals(new int[0], new int[0]);
    }


    @Test
    @Tag("Medium")
    void uncommonPartOfArrTest() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 11, 123, 324, 456};
        int[] arr2 = new int[]{-11, -5, 0, 1, 2, 3, 4, 5, 23, 331, 456, 1024};
        int[] actual = uncommonPartOfArr(arr1, arr2);
        int[] expected = new int[]{-11, -5, 0, 11, 123, 324, 331, 1024, 23};

        assertArrayEquals(expected, actual);
        assertArrayEquals(new int[0], new int[0]);
    }


}
