package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverseString() {
        assertAll(
        () -> assertNotEquals("batman", "namtab" , "NOT palindrome"),
        () -> assertEquals("racecar", "racecar" , "is palindrome"),
                () -> assertEquals("pop", "pop" , "is palindrome")
        );
    }

    @Test
    void isPalindrome() {

    }
}