package com.handtruth.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class ExTask {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> resList = new ArrayList<Integer>();
        int n = 0;
        int summ = 0;
        for (int i = 0; i < list.size(); i++) {
            if (summ < n) {
                summ = summ + list.get(i);
                resList.add(list.get(i));
            }
        }
    }

    private static Integer max(List<Integer> list) {
        Integer max = 0;
        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }
}
