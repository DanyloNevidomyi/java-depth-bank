package ua.edu.chmnu.ki.oop.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void shouldSuccessDetectSortedIncrease() {
        int[] array = {1, 2, 3, 4, 5};
        assertTrue(Main.isSorted(array));
    }

    @Test
    void shouldNotSuccessDetectSortedIncrease() {
        int[] array = {1, 2, 20, 4, 5};
        assertFalse(Main.isSorted(array));
    }
}