package com.handtruth.lessons.lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiExample {

    public static void foo1() {
        List<Integer> list1 = Arrays.asList(1, 20, 543, 123, 4, 543, 65, 65, 23, 6, 52, 43, 6, 1024);
        System.out.println(list1.toString());
        Set<Integer> set = new HashSet<>(list1);
        list1 = new ArrayList<>(set);
        list1.sort(Comparator.naturalOrder());

        List<String> result = new ArrayList<>();
        for (Integer integer : list1) {
            if (integer % 2 == 0) {
                result.add(String.valueOf(Double.valueOf(integer)));
            }
        }
        System.out.println(result.toString());

        StringBuilder builder = new StringBuilder();
        result.forEach(s -> builder.append(s).append(" "));
        System.out.println(builder.toString().trim());
    }

    public static void foo2() {
        List<Integer> list1 = Arrays.asList(1, 20, 543, 123, 4, 543, 65, 65, 23, 6, 52, 43, 6, 1024);
        System.out.println(list1.toString());
        String result = list1.stream()
                .distinct()
                .filter(i -> i % 2 == 0)
                .sorted()
                .map(Double::valueOf)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }

    public static void foo3() {
        List<Integer> list1 = Arrays.asList(1, 20, 543, 123, 4, 543, 65, 65, 23, 6, 52, 43, 6, 1024);
        System.out.println(list1.toString());
        Long result = list1.stream()
                .distinct()
                .filter(i -> i % 2 == 0)
                .filter(i -> i % 3 != 0)
                .count();
        System.out.println(result);
    }

    public static void main(String[] args) {
        foo1();
        System.out.println();
        foo2();
        System.out.println();
        foo3();
    }
}
