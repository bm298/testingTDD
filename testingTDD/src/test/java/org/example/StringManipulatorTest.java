package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverseString() {
        StringManipulator stringManipulator= new StringManipulator();
        assertAll(
        () -> assertNotEquals("batman", new StringManipulator().reverseString("namtab")),
        () -> assertEquals("2racecar", new StringManipulator().reverseString("racecar2") ),
                () -> assertEquals("pop", new StringManipulator().reverseString("pop"))
        );
    }

    @Test
    void isPalindrome() {
        assertAll(
                () -> assertNotEquals(true, new StringManipulator().isPalindrome("namtab") , "NOT palindrome"),
                () -> assertEquals(true, new StringManipulator().isPalindrome("racecar") , "is palindrome"),
                () -> assertEquals(true, new StringManipulator().isPalindrome("pop") , "is palindrome")
        );
    }
}