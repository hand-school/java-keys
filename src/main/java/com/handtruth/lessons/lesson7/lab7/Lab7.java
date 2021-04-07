package com.handtruth.lessons.lesson7.lab7;

import com.handtruth.lessons.lesson7.task2.SinglyLinkedList;

import java.util.Comparator;
import java.util.Iterator;

public class Lab7 {
    public static void main(String[] args) {


        SinglyLinkedList<Integer> data = new SinglyLinkedList<>();

        data.add(3);
        data.add(4);
        data.add(5);
        data.add(-6);
        data.add(-10);
        data.add(14);
        data.add(-30);
        data.add(8);
        data.add(-8);

        System.out.println(data.toString());
        System.out.println(" ");

        SinglyLinkedListLab.IntegerComparator comparator = new SinglyLinkedListLab.IntegerComparator();
        data.sort(comparator);
        System.out.println(data.toString());

        Iterator<Integer> iterator = data.iterator();

        int summ = 0;

        while (iterator.hasNext()) {
            int tmp = iterator.next();
            if (tmp > 0) {
                System.out.println(tmp);
            }
        }



    }

    static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1.equals(o2)) {
                return 0;
            } else if (o1 > o2) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

