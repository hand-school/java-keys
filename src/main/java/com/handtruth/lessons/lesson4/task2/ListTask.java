package com.handtruth.lessons.lesson4.task2;

import java.util.ArrayList;
import java.util.List;

class ListTask {

    /**
     * Easy
     * <p>
     * Найти количество неотрицательных элементов списка
     */
    public static int positiveCounter(List<Integer> list) {
        int n = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 0) {
                n++;
            }
        }
        return n;
    }

    /**
     * Easy
     * <p>
     * Найти максимальный элемент в списке
     * (Гарантируется, что список не пустой)
     */
    public static int maxNumber(List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    /**
     * Medium (для нахождения решения за линейное время)
     * <p>
     * Найти все одинаковые элементы в списках
     * (все элементы отсортированы по возрастанию)
     */
    public static List<Integer> items(List<Integer> list1, List<Integer> list2) {
        List<Integer> list3 = new ArrayList<>();
        for (Integer integer : list2) {
            if (list1.contains(integer)) {
                list3.add(integer);
            }
        }
        return list3;
    }

    /**
     * Hard
     * <p>
     * Отсортировать входной спписок по возрастанию методом пузырьков
     * (алгоритм реализовать самостоятельно)
     */
    public static List<Integer> simpleSort(List<Integer> list) {
//        for (int i = 0; i < list.size(); i++) {
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

    /**
     * Hard
     * <p>
     * Отсортировать входной список по возрастанию с помощью Merge Sort
     * (алгоритм реализовать самостоятельно)
     */
    public static List<Integer> mergeSort(List<Integer> list) {
        // TODO your code
        return new ArrayList<>();
    }

    /**
     * Hard
     * <p>
     * Отсортировать входной список по возрастанию с помощью Quick Sort
     * (алгоритм реализовать самостоятельно!)
     */
    public static List<Integer> quickSort(List<Integer> list) {
        // TODO your code
        return new ArrayList<>();
    }

    /**
     * Hard
     * <p>
     * Даны числа от 1 до 100
     * Отсортировать входной список по возрастанию
     * (линейное время)
     */
    public static List<Integer> linearSort(List<Integer> list) { // 5 4 3 6 7
        ArrayList<Integer> SortedList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            int nextValue = SortedList.get(list.get(i)) + 1;
            SortedList.set(list.get(i), nextValue);
        }
        return new ArrayList<>();
    }

    /**
     * Hard
     * <p>
     * Дан список содержащий значения типа Boolean (не null).
     * Необходимо найти наиболее длинную последовательность значений true.
     * Если посреди последовательности true встреается значение false (только одно и только один раз),
     * его можно проигнорировать и считать последовательность непрерывной (в длину такой последовательности не входит false).
     * Известно, что есть решение за линейное время :) :))))))))))))))))))))))))))))))))))))))))))))
     * <p>
     * Пример :
     * на входе - {T,T,T,F,T,T,F,F,T,T,T,T}
     * ответ - 5
     */
    public static Integer longestTrueSequence(List<Boolean> list) {
        int summ = 0;
        int maxSumm = 0;
        int summFalse = 0;
        for (int i = 0; i < list.size(); i++) {
            if (summFalse < 2) {
                if (list.get(i)) {
                    summ++;
                } else {
                    summFalse++;
                }
                if (list.size() - summ == 1) {
                    return summ;
                }
            } else {
                if (summ > maxSumm) {
                    maxSumm = summ;
                }
                summ = 0;
            }
        }
        return maxSumm;
    }
}
