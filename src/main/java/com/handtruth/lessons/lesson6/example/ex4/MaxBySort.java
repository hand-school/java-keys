package com.handtruth.lessons.lesson6.example.ex4;

import java.util.List;

public class MaxBySort implements Maximum {
    @Override
    public Integer max(List<Integer> inputList) {
        inputList.sort(Integer::compareTo);
        return inputList.get(inputList.size() - 1);
    }
}
