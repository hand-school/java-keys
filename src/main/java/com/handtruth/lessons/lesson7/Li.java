package com.handtruth.lessons.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Li {
    public static void printListOfInteger(List<Integer> list) {

        for (int j = 0; j < list.size(); j++) {
//            System.out.println(list.get(j));
            System.out.println(j);
        }

        for (int i : list) {
//            System.out.println(list.get(i));
            System.out.println(i);
        }

        list.forEach(element -> {
            System.out.println(element);
        });
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(9);

        printListOfInteger(list);

    }
}
