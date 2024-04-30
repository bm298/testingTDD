package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverseString() {
        StringManipulator strinmanipulator= new StringManipulator();
        assertAll(
        () -> assertNotEquals("batman", new StringManipulator().reverseString("numtab")),
        () -> assertEquals("2racecar", new StringManipulator().reverseString("racecar2") ),
                () -> assertEquals("pop", new StringManipulator().reverseString("pop"))
        );
    }

    @Test
    void isPalindrome() {
        assertAll(
                () -> assertNotEquals("batman", "namtab" , "NOT palindrome"),
                () -> assertEquals("racecarfds", "racecar" , "is palindrome"),
                () -> assertEquals("pop", "pop" , "is palindrome")
        );
    }
}