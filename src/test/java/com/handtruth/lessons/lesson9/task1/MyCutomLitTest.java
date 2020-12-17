package com.handtruth.lessons.lesson7.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCutomLitTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void size() {
    }

    @Test
    void contains() {
    }

    @Test
    void add() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void get() {
        MyCutomLit<Integer> lit = new MyCutomLit<>();
        lit.add(1);
        lit.add(2);
        lit.add(3);
        lit.add(1);
        lit.add(2);
        lit.add(3);
        lit.add(1);
        lit.add(2);
        lit.add(3);
        lit.add(3);
        assertEquals(2, lit.get(1));
        System.out.println(lit.size());
        System.out.println(lit.getData().length);
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->lit.get(12));
    }

    @Test
    void set() {
    }

    @Test
    void remove() {
    }
}