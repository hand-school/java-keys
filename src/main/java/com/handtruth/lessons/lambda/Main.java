package com.handtruth.lessons.lambda;

public class Main {
    public static boolean isMaxMoreThan5(Maximum maximum, Integer num1, Integer num2, Integer num3) {
        Integer max = maximum.max(num1, num2, num3);
        return max > 5;
    }

    public static void main(String[] args) {
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