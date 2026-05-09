package com.firealgo.codingproblemsolvinginjava.mphasisUK;

import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CountNumberofVowelsInStringTest {

    @Test
    void testCountVowels() {
        assertEquals(CountNumberofVowelsInString.countVowels("abcde"), 2);
    }

    @ParameterizedTest
    @DisplayName("testCountVowels- All having at least one vowels")
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void testCountVowels2(String input) {
        assertTrue(CountNumberofVowelsInString.countVowels(input) > 0);
    }

    @ParameterizedTest
    @DisplayName("testCountVowels- null or empty")
    @NullSource
    void testCountVowels3(String input) {
        assertThrows(RuntimeException.class, () ->CountNumberofVowelsInString.countVowels(input));
    }

    @ParameterizedTest
    @DisplayName("is Blank Test")
    @ValueSource(strings = {"", "  "})
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input) {
        assertTrue(Strings.isBlank(input));
    }

}