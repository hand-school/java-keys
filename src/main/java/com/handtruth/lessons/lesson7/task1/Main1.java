package com.handtruth.lessons.lesson7.task1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.toString());
        list.remove(1);
        System.out.println(list.toString());

    }
}
