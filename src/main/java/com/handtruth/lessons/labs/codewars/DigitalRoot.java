package com.handtruth.lessons.labs.codewars;
public class DigitalRoot {

    /**
     * Digital root is the recursive sum of all the digits in a number.
     * Given n, take the sum of the digits of n. If that value has more than one digit,
     * continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
     */
    public static int digital_root(int n) {

        if (n < 10) {
            return n;
        }

        int summ = 0;
        while (n > 0) { // 15
            summ += n % 10; // 5+1
            n /= 10; // 0
        }
        return digital_root(summ);
    }

    public static void main(String[] args) {
        System.out.println(digital_root(348013));
    }
}

