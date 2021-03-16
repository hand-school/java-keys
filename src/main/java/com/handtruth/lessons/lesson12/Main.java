package com.handtruth.lessons.lesson12;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(5, 7);
        int a1 = pair.first + pair.second;

        PairAfterCompilation pairAfterCompilation = new PairAfterCompilation(5, 7);
        int a2 = (Integer) pairAfterCompilation.first + (Integer) pairAfterCompilation.second;

        Pair<String> pairStr = new Pair<>("as", "asd");

        NumberPair<Integer> numberPair = new NumberPair<>(2, 3);

        Pair<List<Integer>> pairList = new Pair<>(null, null);
    }
}
