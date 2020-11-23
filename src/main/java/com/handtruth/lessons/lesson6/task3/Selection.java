package com.handtruth.lessons.lesson6.task3;

import java.util.List;

public class Selection implements Sort {

    @Override
    public List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int minInd = i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < list.get(minInd)) {
                    minInd = j;
                }
            }
            int tmp = 0;
            tmp = i;
            i = minInd;
            minInd = tmp;
        }
        return list;
    }
}
