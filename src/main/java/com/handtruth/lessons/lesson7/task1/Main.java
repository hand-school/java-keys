package com.handtruth.lessons.lesson7.task1;

import com.handtruth.lessons.lesson7.task2.SinglyLinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyCutomLit<Integer> data = new MyCutomLit<>();
        data.add(1);
        System.out.println(Arrays.toString(data.getData()));
        data.add(2);
        data.add(3);
        System.out.println(Arrays.toString(data.getData()));
        System.out.println(data.contains(2));
        System.out.println(data.contains(6));
        data.add(4);
        data.add(5);
        data.add(6);
        data.add(7);
        System.out.println(Arrays.toString(data.getData()));
        data.add(1,4);
        System.out.println(Arrays.toString(data.getData()));
        data.remove(1);
        System.out.println(Arrays.toString(data.getData()));
        data.remove(5);
        System.out.println(Arrays.toString(data.getData()));
        System.out.println(data.remove(15));
        data.remove(8);

        SinglyLinkedList<Integer> data2 = new SinglyLinkedList<>();
        data2.add(1);
        data2.add(2);
        data2.add(3);
        data2.add(4);
        data2.add(5);
        System.out.println(data2.toString());
        data2.remove(2);
        System.out.println(data2.toString());








    }
}
