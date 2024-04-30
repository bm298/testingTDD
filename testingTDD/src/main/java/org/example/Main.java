package org.example;

import org.example.StringManipulator;

public class Main {
    public static void main(String[] args) {
        StringManipulator obj= new StringManipulator();

//        obj.reverseString("Toilet");

        System.out.println(obj.isPalindrome("racecar"));
    }
}