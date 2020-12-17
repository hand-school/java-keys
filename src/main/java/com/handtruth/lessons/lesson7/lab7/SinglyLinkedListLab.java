package com.handtruth.lessons.lesson7.lab7;

import com.handtruth.lessons.lesson7.task2.SinglyLinkedList;

public class SinglyLinkedListLab {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> data = new SinglyLinkedList<>();
        int summ = 1;

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

        data.sort();

        System.out.println(data.toString());

        Integer currentEl = data.root();


        while (data.hasNext()) {
            if (currentEl % 2 != 0) {
                summ = summ*currentEl;
            }
            currentEl = data.next();
        }
        System.out.println(summ);

//        data.reverse();
//
//        Integer currentEl = data.root();
//
//        System.out.println(data.toString());
//
//
//        while (data.hasNext()) {
//            if (currentEl < 0) {
//                summ += currentEl;
//            }
//            currentEl = data.next();
//        }
//        System.out.println(summ);
//    }
    }
}