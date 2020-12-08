package com.handtruth.lessons.lesson7.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyCutomLit<Integer> data = new MyCutomLit<>();
        data.add(1);
        System.out.println(Arrays.toString(data.getData()));
        data.add(2);
        data.add(3);
        System.out.println(Arrays.toString(data.getData()));
        System.out.println(data.contains(2));
        System.out.println(data.contains(6));
        data.add(4);
        data.add(5);
        data.add(6);
        data.add(7);
        System.out.println(Arrays.toString(data.getData()));
        data.add(1,4);
        System.out.println(Arrays.toString(data.getData()));
        data.remove(1);
        System.out.println(Arrays.toString(data.getData()));
        data.remove(5);
        System.out.println(Arrays.toString(data.getData()));
        System.out.println(data.remove(15));
        data.remove(8);







    }
}
