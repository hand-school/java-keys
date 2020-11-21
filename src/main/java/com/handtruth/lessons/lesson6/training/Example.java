package com.handtruth.lessons.lesson6.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
    private List<Integer> list;

    public Example (List<Integer> list) {
        this.list = list;
    }
// вернуть копию списка через for
    public List<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Example{" +
                "list=" + list.toString() +
                '}';
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);

        Example exam = new Example(list);

        System.out.println(exam.toString());

        list = exam.getList();

        list.add(20);
        list.add(30);

        System.out.println(exam.toString());
    }
}
