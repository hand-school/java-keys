package com.handtruth.lessons.lesson6.task3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void printSortedList(List<Integer> list, Sort sorter) {
        System.out.println(sorter.sort(list));
    }

    // Сделать 3 реализации интерфейса Sort и продемонстрировать по аналогии с ex4
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 2, 3231, 42, 235, 100);

        Sort bubble = new Bubble();
        Sort select = new Selection();
        Sort inert = new Inertion();

        printSortedList(list, bubble);
        printSortedList(list, select);
        printSortedList(list, inert);
    }
}
