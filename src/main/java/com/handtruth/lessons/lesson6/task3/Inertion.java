package com.handtruth.lessons.lesson6.task3;

import java.util.List;

public class Inertion implements Sort {
    @Override
    public List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < list.get(j)) {
                    list.set(j + 1, j);
                } else {
                    break;
                }
            }
            list.set(j + 1, value);
        }
        return list;
    }
}
