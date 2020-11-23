package com.handtruth.lessons.lesson6.example.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int maxPlus100(List<Integer> list, Maximum maxObj) {
        int maxValue = maxObj.max(list);
        return maxValue + 100;
    }

    public static int maxPlus50(List<Integer> list, MaxByFor maxObj) {
        int maxValue = maxObj.max(list);
        return maxValue + 50;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 100);

        Maximum maxByFor = new MaxByFor();
        Maximum maxBySort = new MaxBySort();
        Maximum maxByFun = new MaxByFun();

        System.out.println(maxPlus100(list, maxByFor));
        System.out.println(maxPlus100(list, maxBySort));
        System.out.println(maxPlus100(list, maxByFun));

        MaxByFor maxByForEx = new MaxByFor();
        maxByForEx.onlyMaxByFor();
        MaxBySort maxBySortEx = new MaxBySort();

        System.out.println(maxPlus50(list,maxByForEx));
//        System.out.println(maxPlus50(list, maxBySortEx));  // Ошибка
    }
}
