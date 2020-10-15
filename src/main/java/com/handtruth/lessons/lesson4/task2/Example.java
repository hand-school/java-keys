package com.handtruth.lessons.lesson4.task2;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.toString());
        list.add(10);
        list.add(4);
        list.add(15);
        System.out.println(list.toString());

        list.remove(0);
        System.out.println(list.toString());

        Integer elem = list.get(0);
        System.out.println(elem);

        System.out.println(list.get(1));

//        System.out.println(list.get(10)); // IndexOutOfBoundsException: Index: 10, Size: 2

        list.clear();
        System.out.println(list.toString());

        list.add(10);
        list.add(4);
        list.add(15);
        if (list.contains(10)) {
            System.out.println("Contains 10");
        } else {
            System.out.println("Not contains");
        }

        //        ИТЕРАЦИЯ ПО СПИСКУ
        System.out.println("____________________");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i);
            System.out.print(" - ");
            System.out.print(list.get(i));
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("____________________");
        for (Integer element: list) {
            System.out.println(element);
        }
    }
}
