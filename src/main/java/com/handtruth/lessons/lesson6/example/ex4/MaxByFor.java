package com.handtruth.lessons.lesson6.example.ex4;

import java.util.List;

public class MaxByFor implements Maximum {

    @Override
    public Integer max(List<Integer> inputList) {
        if (inputList == null || inputList.size() == 0) {
            return null;
        }
        int maximum = inputList.get(0);
        for (int elem : inputList) {
            if (elem > maximum) {
                maximum = elem;
            }
        }
        return maximum;
    }
}
