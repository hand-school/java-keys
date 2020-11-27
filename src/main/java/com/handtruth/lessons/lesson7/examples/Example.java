package com.handtruth.lessons.lesson7.examples;

import com.handtruth.lessons.lesson7.CustomList;
import com.handtruth.lessons.lesson7.task2.SinglyLinkedList;

public class Example {

    public static void main(String[] args) {
        CustomList<Integer> list = new SinglyLinkedList<>();
        list.add(4);
        list.add(41);
        list.add(23);
        list.add(6);
        System.out.println(list.toString());
    }

}
