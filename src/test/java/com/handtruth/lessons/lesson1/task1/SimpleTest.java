package com.handtruth.lessons.lesson1.task1;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.handtruth.lessons.lesson1.task1.Simple.discriminant;
import static com.handtruth.lessons.lesson1.task1.Simple.numberRevert;
import static com.handtruth.lessons.lesson1.task1.Simple.seconds;
import static com.handtruth.lessons.lesson1.task1.Simple.sqRoot;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleTest {
    @Test
    @Tag("Trivial")
    void discriminantTest() {
        assertEquals(0.0, discriminant(0.0, 0.0, 0.0), 1e-5);
        assertEquals(0.0, discriminant(1.0, -2.0, 1.0), 1e-5);
        assertEquals(1.0, discriminant(1.0, 3.0, 2.0), 1e-5);
    }

    @Test
    @Tag("Trivial")
    void sqRootTest() {
        assertEquals(1.0, sqRoot(1.0, -2.0, 1.0), 1e-5);
        assertEquals(-3.0, sqRoot(1.0, 6.0, 9.0), 1e-5);
    }

    @Test
    @Tag("Trivial")
    void secondsTest() {
        assertEquals(30035, seconds(8, 20, 35));
        assertEquals(86400, seconds(24, 0, 0));
        assertEquals(13, seconds(0, 0, 13));
    }

    @Test
    @Tag("Easy")
    void numberRevertTest() {
        assertEquals(874, numberRevert(478));
        assertEquals(201, numberRevert(102));
    }
}