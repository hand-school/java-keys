package com.handtruth.lessons.lesson6.task3;

import java.util.ArrayList;
import java.util.List;

public class Bubble implements Sort{

    @Override
    public List<Integer> sort(List<Integer> list) {
            boolean needSwap = true;
            while (needSwap) {
                needSwap = false;
                for (int j = 1; j < list.size(); j++) {
                    if (list.get(j) < list.get(j - 1)) {
                        int tmp = list.get(j);
                        list.set(j, list.get(j - 1));
                        list.set(j - 1, tmp);
                        needSwap = true;
                    }
                }
            }
            return list;
        }
    }
