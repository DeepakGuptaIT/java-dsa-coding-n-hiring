package com.firealgo.codingproblemsolvinginjava.fundamentals.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for CountVowels solution.
 * 
 * @author DSA Practice
 * @version 1.0
 */
@DisplayName("Count Vowels Tests")
class CountVowelsTest {

    @Test
    @DisplayName("Should count vowels correctly in mixed case")
    void testCountVowelsMixedCase() {
        assertEquals(4, CountVowels.countVowels("Aaaabc"));
        assertEquals(4, CountVowels.countVowels("aaaabc"));
        assertEquals(4, CountVowels.countVowels("AAAABC"));
    }

    @Test
    @DisplayName("Should count vowels in common words")
    void testCountVowelsWords() {
        assertEquals(2, CountVowels.countVowels("hello"));
        assertEquals(3, CountVowels.countVowels("hello world"));
        assertEquals(5, CountVowels.countVowels("aeiou"));
    }

    @Test
    @DisplayName("Should return 0 for strings with no vowels")
    void testCountVowelsNoVowels() {
        assertEquals(0, CountVowels.countVowels("bcdfg"));
        assertEquals(0, CountVowels.countVowels("xyz"));
        assertEquals(0, CountVowels.countVowels(""));
    }

    @Test
    @DisplayName("Should handle null input")
    void testCountVowelsNull() {
        assertEquals(0, CountVowels.countVowels(null));
    }

    @Test
    @DisplayName("Should handle empty string")
    void testCountVowelsEmpty() {
        assertEquals(0, CountVowels.countVowels(""));
    }

    @Test
    @DisplayName("Should count all vowels in sequence")
    void testCountVowelsAllVowels() {
        assertEquals(5, CountVowels.countVowels("aeiou"));
        assertEquals(10, CountVowels.countVowels("aeiouaeiou"));
    }

    @Test
    @DisplayName("Should handle special characters and spaces")
    void testCountVowelsSpecialCharacters() {
        assertEquals(3, CountVowels.countVowels("h3ll0 w0r1d"));
        assertEquals(2, CountVowels.countVowels("a-e-i"));
        assertEquals(4, CountVowels.countVowels("a,e,i,o,u,u"));
    }

    @Test
    @DisplayName("Stream approach: count vowels correctly")
    void testCountVowelsStream() {
        assertEquals(4, CountVowels.countVowelsStream("Aaaabc"));
        assertEquals(5, CountVowels.countVowelsStream("aeiou"));
        assertEquals(0, CountVowels.countVowelsStream("bcdfg"));
    }

    @Test
    @DisplayName("Regex approach: count vowels correctly")
    void testCountVowelsRegex() {
        assertEquals(4, CountVowels.countVowelsRegex("Aaaabc"));
        assertEquals(5, CountVowels.countVowelsRegex("aeiou"));
        assertEquals(0, CountVowels.countVowelsRegex("bcdfg"));
    }

    @Test
    @DisplayName("All approaches should give same result")
    void testAllApproachesSameResult() {
        String[] testStrings = { "hello", "aeiou", "bcdfg", "Hello World", "AeIoU" };

        for (String test : testStrings) {
            int basic = CountVowels.countVowels(test);
            int stream = CountVowels.countVowelsStream(test);
            int regex = CountVowels.countVowelsRegex(test);

            assertEquals(basic, stream, "Stream approach differs for: " + test);
            assertEquals(basic, regex, "Regex approach differs for: " + test);
        }
    }
}
