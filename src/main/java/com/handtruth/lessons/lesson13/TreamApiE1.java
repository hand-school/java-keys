package com.handtruth.lessons.lesson13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreamApiE1 {

    public static void foo() {
        List<Integer> list = Arrays.asList(1, 20, 543, 123, 4, 543, 43, 52, 208, 999, 1, 123, 52);
        System.out.println(list.toString());
        Integer result = list.stream()
                .sorted()
                .distinct()
                .filter(x -> x < 0)
                .findFirst()
                .orElseThrow();

        System.out.println(result);
    }

    public static void main(String[] args) {
        foo();
    }
}
