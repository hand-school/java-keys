package com.handtruth.lessons.lesson5.task2;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.handtruth.lessons.lesson5.task2.CustomParse.contain;
import static com.handtruth.lessons.lesson5.task2.CustomParse.customHash;
import static com.handtruth.lessons.lesson5.task2.CustomParse.isClose;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CustomParseTest {

    @Test
    @Tag("Easy")
    void customHashTest() {
        assertEquals("Hello".hashCode(), customHash("Hello"));
        assertEquals("12333".hashCode(), customHash("12333"));
        assertEquals("".hashCode(), customHash(""));
        assertEquals("world".hashCode(), customHash("world"));
    }

    @Test
    @Tag("Medium")
    void isCloseTest() {
        assertTrue(isClose("([{({})}]())"));
        assertFalse(isClose("[({)}]"));
        assertFalse(isClose("(((()))"));
        assertFalse(isClose("["));
        assertFalse(isClose("]"));
        assertFalse(isClose(""));
        assertTrue(isClose("([]())"));
    }

    @Test
    @Tag("Hard")
    void containTest() {
        assertTrue(contain("Hello world", "world"));
        assertTrue(contain("My name is Java", "ame"));
        assertTrue(contain("What a beautiful day today", "a bea"));
        assertFalse(contain("What a beautiful day today", "beautifule"));
    }
}