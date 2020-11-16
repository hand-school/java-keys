package com.handtruth.lessons.lesson6.example.ex4;

import java.util.Collections;
import java.util.List;

public class MaxByFun implements Maximum {
    @Override
    public Integer max(List<Integer> inputList) {
        return Collections.max(inputList);
    }
}
