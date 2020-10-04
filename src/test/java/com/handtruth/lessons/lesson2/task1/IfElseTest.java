package com.handtruth.lessons.lesson2.task1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.handtruth.lessons.lesson2.task1.IfElse.ageDescription;
import static com.handtruth.lessons.lesson2.task1.IfElse.compare;
import static com.handtruth.lessons.lesson2.task1.IfElse.segmentLength;
import static com.handtruth.lessons.lesson2.task1.IfElse.triangleKind;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IfElseTest {

    @Test
    @Tag("Trivial")
    void compareTest() {
        assertEquals(1, compare(5, 3));
        assertEquals(-1, compare(4, 5));
        assertEquals(0, compare(5, 5));
    }

    @Test
    @Tag("Easy")
    void ageDescriptionTest() {
        assertEquals("1 год", ageDescription(1));
        assertEquals("21 год", ageDescription(21));
        assertEquals("132 года", ageDescription(132));
        assertEquals("12 лет", ageDescription(12));
        assertEquals("111 лет", ageDescription(111));
        assertEquals("199 лет", ageDescription(199));
    }

    @Test
    @Tag("Easy")
    void triangleKindTest() {
        assertEquals(-1, triangleKind(3.0, 7.5, 4.0));
        assertEquals(1, triangleKind(5.0, 3.0, 4.0));
        assertEquals(2, triangleKind(4.0, 6.0, 8.0));
        assertEquals(0, triangleKind(1.0, 1.5, 1.5));
    }

    @Test
    @Tag("Medium")
    void segmentLengthTest() {
        assertEquals(-1, segmentLength(1, 2, 3, 4));
        assertEquals(-1, segmentLength(5, 7, 1, 3));
        assertEquals(0, segmentLength(1, 2, 2, 4));
        assertEquals(3, segmentLength(3, 6, 0, 9));
        assertEquals(2, segmentLength(2, 5, 3, 9));
        assertEquals(1, segmentLength(3, 6, 1, 4));
        assertEquals(4, segmentLength(1, 15, 10, 14));
    }
}
