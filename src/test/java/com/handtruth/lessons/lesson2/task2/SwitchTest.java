package com.handtruth.lessons.lesson2.task2;

import java.util.Random;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.handtruth.lessons.lesson2.task2.Switch.switchEnum;
import static com.handtruth.lessons.lesson2.task2.Switch.switchNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitchTest {

    @Test
    @Tag("Trivial")
    void switchNumberTest() {
        assertEquals("Один", switchNumber(1));
        assertEquals("Два", switchNumber(2));
        assertEquals("Три", switchNumber(3));
        assertEquals("Четыре", switchNumber(4));
        assertEquals("Пять", switchNumber(5));
        assertEquals("Шесть", switchNumber(6));
        assertEquals("Семь", switchNumber(7));
        assertEquals("Восемь", switchNumber(8));
        assertEquals("Девять", switchNumber(9));
        assertEquals("Десять", switchNumber(10));

        Random rnd = new Random();
        int random = rnd.nextInt();
        while (random <= 10 && random >= 1 ) {
            random = rnd.nextInt();
        }
        assertEquals("Число не входит в разрешенный интервал", switchNumber(random));

    }

    @Test
    @Tag("Trivial")
    void switchEnumTest() {
        assertEquals("Белый", switchEnum(Switch.Color.White));
        assertEquals("Желтый", switchEnum(Switch.Color.Yellow));
        assertEquals("Черный", switchEnum(Switch.Color.Black));
    }
}