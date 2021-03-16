package com.handtruth.lessons.lambda;

public class SimpleMax implements Maximum {
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
}
