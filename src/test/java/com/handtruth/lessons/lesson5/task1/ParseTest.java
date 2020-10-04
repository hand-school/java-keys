package com.handtruth.lessons.lesson5.task1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.handtruth.lessons.lesson5.task1.Parse.isBin;
import static com.handtruth.lessons.lesson5.task1.Parse.mathOperation;
import static com.handtruth.lessons.lesson5.task1.Parse.substring;
import static com.handtruth.lessons.lesson5.task1.Parse.timeSecondsToStr;
import static com.handtruth.lessons.lesson5.task1.Parse.toDigitStr;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParseTest {

    @Test
    @Tag("Easy")
    void toDigitStrTest() {
        assertEquals("00", toDigitStr(0));
        assertEquals("05", toDigitStr(5));
        assertEquals("67", toDigitStr(67));
        assertEquals("99", toDigitStr(99));
    }

    @Test
    @Tag("Easy")
    void timeSecondsToStrTest() {
        assertEquals("10:00:00", timeSecondsToStr(36000));
        assertEquals("11:34:45", timeSecondsToStr(41685));
        assertEquals("23:59:59", timeSecondsToStr(86399));
    }

    @Test
    @Tag("Easy")
    void isBinTest() {
        assertTrue(isBin("1001"));
        assertTrue(isBin("1"));
        assertFalse(isBin("10102"));
    }

    @Test
    @Tag("Medium")
    void substringTest() {
        assertEquals("Hello", substring("Hello world",0, 5));
        assertEquals("wo", substring("Hello world",6, 8));
    }

    @Test
    @Tag("Hard")
    void mathOperationTest() {
        assertEquals(11, mathOperation("5 + 6"));
        assertEquals(100, mathOperation("155 - 55"));
        assertEquals(30, mathOperation("5 * 6"));
        assertEquals(12, mathOperation("6+6"));
    }
}