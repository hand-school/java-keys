package com.handtruth.lessons.labs.codewars;
public class DigitalRoot {

    /**
     * Digital root is the recursive sum of all the digits in a number.
     * Given n, take the sum of the digits of n. If that value has more than one digit,
     * continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
     */
    public static int digital_root(int n) {
        int tmp = 0;
        int summ = n;
        while (summ > 9) {
            tmp = 0;
            while (summ > 0) { // 15
                tmp += summ % 10; // 5+1
                summ /= 10; // 0
            }
            summ = tmp;
        }
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(348013));
    }
}

