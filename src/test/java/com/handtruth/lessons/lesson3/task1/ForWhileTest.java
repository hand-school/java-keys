package com.handtruth.lessons.lesson3.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.handtruth.lessons.lesson3.task1.ForWhile.counter;
import static com.handtruth.lessons.lesson3.task1.ForWhile.factorial;
import static com.handtruth.lessons.lesson3.task1.ForWhile.isCoPrime;
import static com.handtruth.lessons.lesson3.task1.ForWhile.sin;
import static com.handtruth.lessons.lesson3.task1.ForWhile.squareSequenceDigit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ForWhileTest {

    @Test
    @Tag("Trivial")
    void factorialTest() {
        assertEquals(1.0, factorial(0), 1e-5);
        assertEquals(1.0, factorial(1), 1e-5);
        assertEquals(6.0, factorial(3), 1e-5);
        assertEquals(120.0, factorial(5), 1e-5);
        assertEquals(3628800.0, factorial(10), 1e-5);
        assertEquals(2.43290200817664E18, factorial(20), 1E10);
    }

    @Test
    @Tag("Trivial")
    void counterTest() {
        assertEquals(1, counter(0));
        assertEquals(1, counter(7));
        assertEquals(2, counter(10));
        assertEquals(2, counter(99));
        assertEquals(3, counter(123));
        assertEquals(10, counter(Integer.MAX_VALUE));
    }

    @Test
    @Tag("Easy")
    void isCoPrimeTest() {
        assertTrue(isCoPrime(25, 49));
        assertFalse(isCoPrime(6, 8));
        assertTrue(isCoPrime(17, 97));
        assertFalse(isCoPrime(37, 111));
        assertTrue(isCoPrime(1234567890, 908765431));
        assertTrue(isCoPrime(2109876543, 1234567891));
    }

    @Test
    @Tag("Medium")
    void sinTest() {
        assertEquals(0.0, sin(0.0, 1e-5), 1e-5);
        assertEquals(1.0, sin(Math.PI / 2.0, 1e-5), 1e-5);
        assertEquals(0.0, sin(Math.PI, 1e-5), 1e-5);
        assertEquals(-1.0, sin(3.0 * Math.PI / 2.0, 1e-5), 1e-5);
        assertEquals(0.0, sin(100 * Math.PI, 1e-5), 1e-5);
    }

    @Test
    @Tag("Hard")
    void squareSequenceDigitTest() {
        assertEquals(1, squareSequenceDigit(1));
        assertEquals(4, squareSequenceDigit(2));
        assertEquals(5, squareSequenceDigit(7));
        assertEquals(6, squareSequenceDigit(12));
        assertEquals(0, squareSequenceDigit(17));
        assertEquals(9, squareSequenceDigit(27));
    }
}