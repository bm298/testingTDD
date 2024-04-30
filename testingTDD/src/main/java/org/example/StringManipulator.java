package org.example;

public class StringManipulator {
    public String reverseString(String input) {
        // Implement the logic to reverse the input string

        StringBuilder reversedString = new StringBuilder(input);

        reversedString.reverse();
        System.out.println(reversedString);
        return reversedString.toString();
    }

    public boolean isPalindrome(String input) {
        // Implement the logic to check if the input string is a palindrome

        if (reverseString(input).equals(input)){
            System.out.println("is palindrome!");
            return true;
        }
        return false;
    }
}