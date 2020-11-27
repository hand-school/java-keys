package com.handtruth.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 1;
        int m = 0;
        int fibNum = 0;
        int fibFirst = 0;
        int fibSec = 1;
        while ((n-2) != m) {
            m++;
            fibNum = fibFirst + fibSec;
            fibFirst = fibSec;
            fibSec = fibNum;
        }
        System.out.println(fibNum);
    }
}
