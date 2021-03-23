package com.handtruth.lessons.lambda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.*;

public class Main {


    public static boolean isMaxMoreThan5(Maximum maximum, Integer num1, Integer num2, Integer num3) {
        Integer max = maximum.max(num1, num2, num3);
        return max > 5;
    }

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Добро пожаловать!";
        System.out.println(supplier.get());

        Consumer<Integer> consumer = t -> System.out.println(t*(-1));

        Integer num = 14;

        consumer.accept(num);

        Predicate<String> predicate = str -> str.isEmpty();
//        ?????????????????????????????????????????????????????????

        Function<String, String> function = (String str) -> str.toUpperCase();
//        ?????????????????????????????????????/

        ToDoubleFunction<Integer> toDoubleFunction = num2 -> (num2 / 2);
//        ???????????

        Function<String, Integer> function1 = String::length;


        System.out.println(toDoubleFunction.applyAsDouble(7));

        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> list1 = new LinkedList<>();

        Maximum max = new SimpleMax();
        Integer i = 5;
        Integer c = 8;
        Integer b = 3;

        boolean result1 = isMaxMoreThan5(max, i, c, b);
        System.out.println(result1);

        boolean result2 = isMaxMoreThan5(new Maximum() {
            @Override
            public Integer max(Integer num1, Integer num2, Integer num3) {
                if ((num1 > num2) && (num1 > num3)) {
                    return num1;
                } else if (num2 > num3) {
                    return num2;
                } else {
                    return num3;
                }
            }
        }, i, c, b);

        boolean result3 = isMaxMoreThan5(((num1, num2, num3) -> {
            if ((num1 > num2) && (num1 > num3)) {
                return num1;
            } else if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }), i, c, b);
    }
}