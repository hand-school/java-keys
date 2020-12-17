package com.handtruth.lessons.lesson7.lab7;

import java.util.Comparator;
import java.util.Iterator;

import com.handtruth.lessons.lesson7.task2.SinglyLinkedList;

public class SinglyLinkedListLab {
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

        System.out.println(data.toString());

        Iterator<Integer> iterator = data.iterator();

        int summ = 0;

        while (iterator.hasNext()) {
            summ += iterator.next();
        }
        System.out.println(summ);

        summ = 0;
        for (Integer i : data) {
            summ += i;
        }
        System.out.println(summ);

//        iterator = data.iterator();
//        summ = 0;
//        int ind = 0;
//        while (iterator.hasNext()) {
//            summ += iterator.next();
//            if (ind == 5) {
//                data.add(1, 4);
//            }
//            ind++;
//        }
//        System.out.println(summ);

        IntegerComparator comparator = new IntegerComparator();
        data.sort(comparator);

        // АНОНИМНЫЙ КЛАСС
        data.sort(new Comparator<Integer>() {
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
        });

        // ЛЯМБДА
        data.sort((o1, o2) -> {
            if (o1.equals(o2)) {
                return 0;
            } else if (o1 > o2) {
                return 1;
            } else {
                return -1;
            }
        });

        // ССЫЛКА НА МЕТОД СО ОДИНАКОВОЙ СИГНАТУРОЙ
        data.sort(Integer::compareTo);


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