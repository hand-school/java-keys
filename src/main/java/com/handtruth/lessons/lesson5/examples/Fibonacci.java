package com.handtruth.lessons.lesson5.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int summ(int n) {
        System.out.println("Текущее n = " + n);
        if (n == 0) {
            System.out.println("При n = " + n + " возвращаем summ = 0");
            System.out.println("-------------------------");
            return 0;
        }
        System.out.println("Вызываем summ(" + (n - 1) + ")");
        int pre_summ = summ(n - 1);
        int summary = n + pre_summ;
        System.out.println("При n = " + n + " возвращаем summ = " + summary);
        return summary;
    }

    public static void main(String[] args) {
//        int res = summ(3);
//        System.out.println(res);

        int res = fibonacci(4);
        System.out.println(res);

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(1000);
        list.add(1);
        list.add(35);
        list.add(22);
        list.sort(Integer::compareTo);
        System.out.println(list);
    }
}
