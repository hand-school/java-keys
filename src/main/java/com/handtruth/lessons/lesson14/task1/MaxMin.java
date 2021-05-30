package com.handtruth.lessons.lesson14.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Запускаются два потока. Первый поток находит максимум в массиве, второй — минимум.
// Результаты вычислений возвращаются в метод main().
public class MaxMin {

//    public static class MaxThread extends Thread {
//        private Integer[] array;
//        List<Integer> list = Arrays.asList(array);
//
//        public MaxThread(Integer[] array) {
//            this.array = array;
//        }
//
//        @Override
//        public void run() {
//            list.stream()
//                    .max(Integer::compare)
//                    .ifPresent(System.out::println);
//        }
//    }

//    public class MinThread extends Thread {
//        private Integer[] array;
//        List<Integer> list = Arrays.asList(array);
//
//        public MinThread(Integer[] array) {
//            this.array = array;
//        }
//
//        @Override
//        public void run() {
//            list.stream()
//                    .min(Integer::compare)
//                    .ifPresent(System.out::println);
//        }
//    }

    public static void main(String[] args) {
        int[] array = new int[]{10, 12, 3324, 124, 52, 6124, 7, 800, 19, 1099};

    }
}
