package com.handtruth.lessons.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.handtruth.lessons.lesson4.ListTask.items;
import static com.handtruth.lessons.lesson4.ListTask.linearSort;
import static com.handtruth.lessons.lesson4.ListTask.longestTrueSequence;
import static com.handtruth.lessons.lesson4.ListTask.maxNumber;
import static com.handtruth.lessons.lesson4.ListTask.mergeSort;
import static com.handtruth.lessons.lesson4.ListTask.positiveCounter;
import static com.handtruth.lessons.lesson4.ListTask.quickSort;
import static com.handtruth.lessons.lesson4.ListTask.simpleSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ListTaskTest {

    @Test
    @Tag("Easy")
    void positiveCounterTest() {
        assertEquals(0, positiveCounter(new ArrayList<>()));
        assertEquals(3, positiveCounter(Arrays.asList(3, 4, 5)));
        assertEquals(1, positiveCounter(Arrays.asList(0, -4, -5)));
        assertEquals(0, positiveCounter(Arrays.asList(-3, -4, -5)));
    }

    @Test
    @Tag("Easy")
    void maxNumberTest() {
        assertEquals(5, maxNumber(Arrays.asList(3, 4, 5)));
        assertEquals(5, maxNumber(Arrays.asList(-10, 0, 5)));
        assertEquals(0, maxNumber(Arrays.asList(0, -4, -5)));
        assertEquals(Integer.MAX_VALUE, maxNumber(Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE)));
    }

    @Test
    @Tag("Medium")
    void itemsTest() {
        assertEquals(Collections.singletonList(-3), items(Arrays.asList(-3, 10, 50), Arrays.asList(-3, 4, 5)));
        assertEquals(Arrays.asList(3, 4, 5), items(Arrays.asList(-4, -3, 3, 4, 5), Arrays.asList(3, 4, 5)));
        assertEquals(Collections.emptyList(), items(Arrays.asList(3, 4, 5), Arrays.asList(6, 7, 8)));
    }

    @Test
    @Tag("Hard")
    void simpleSortTest() {
        assertEquals(Arrays.asList(3, 4, 5), simpleSort(Arrays.asList(5, 4, 3)));
        assertEquals(Arrays.asList(-1000, -89, 100, Integer.MAX_VALUE),
                simpleSort(Arrays.asList(100, -89, -1000, Integer.MAX_VALUE)));
        assertEquals(Arrays.asList(-90, -15, -4, -3, 0), simpleSort(Arrays.asList(-4, -3, -15, -90, 0)));
    }

    @Test
    @Tag("Hard")
    void mergeSortTest() {
        assertEquals(Arrays.asList(3, 4, 5), mergeSort(Arrays.asList(5, 4, 3)));
        assertEquals(Arrays.asList(-1000, -89, 100, Integer.MAX_VALUE),
                mergeSort(Arrays.asList(100, -89, -1000, Integer.MAX_VALUE)));
        assertEquals(Arrays.asList(-90, -15, -4, -3, 0), mergeSort(Arrays.asList(-4, -3, -15, -90, 0)));
    }

    @Test
    @Tag("Hard")
    void quickSortTest() {
        assertEquals(Arrays.asList(3, 4, 5), quickSort(Arrays.asList(5, 4, 3)));
        assertEquals(Arrays.asList(-1000, -89, 100, Integer.MAX_VALUE),
                quickSort(Arrays.asList(100, -89, -1000, Integer.MAX_VALUE)));
        assertEquals(Arrays.asList(-90, -15, -4, -3, 0), quickSort(Arrays.asList(-4, -3, -15, -90, 0)));
    }

    @Test
    @Tag("Hard")
    void linearSortTest() {
        assertEquals(Arrays.asList(3, 4, 5), linearSort(Arrays.asList(5, 4, 3)));
        assertEquals(Arrays.asList(5, 15, 60, 100),
                linearSort(Arrays.asList(15, 100, 60, 5)));
        assertEquals(Arrays.asList(15, 15, 50, 50), linearSort(Arrays.asList(50, 50, 15, 15)));
    }


    @Test
    @Tag("Hard")
    void longestTrueSequenceTest() {
        assertEquals(5,
                longestTrueSequence(
                        Arrays.asList(true, true, true, false, true, true, false, false, true, true, true, true))
        );


        assertEquals(3,
                longestTrueSequence(
                        Arrays.asList(true, true, true, false, false, true, false, true))
        );

        assertEquals(3,
                longestTrueSequence(Arrays.asList(true, true, true, false, false, true, false, true, true))
        );


    }
}