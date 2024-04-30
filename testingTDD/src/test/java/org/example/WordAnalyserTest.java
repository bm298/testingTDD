package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordAnalyserTest {

    @Test
    void findLongestWords() {
        var analyser = new WordAnalyser();

        String longestInput = "They make an awful lot of coffee in Brazil.";
        String longestInput2 = "The clock on the mantelpiece tells the right time twice a day.";
        String longestInput3 = "The mice ran all over the floor, all over the house, all over the place.";

        assertEquals(String["coffee", "Brazil"], analyser.findLongestWords(longestInput));
        assertEquals(String["mantelpiece"], analyser.findLongestWords(longestInput2));
        assertEquals(String["floor", "house", "place"], analyser.findLongestWords(longestInput3));
    }
}