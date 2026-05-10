package com.firealgo.codingproblemsolvinginjava;

import com.firealgo.codingproblemsolvinginjava.techniques.slidingwindow.LongestSubstringWithoutRepeating;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for LongestSubstringWithoutRepeating solution.
 * 
 * @author DSA Practice
 * @version 1.0
 */
@DisplayName("Longest Substring Without Repeating Characters Tests")
class LongestSubstringWithoutRepeatingTest {

    @Test
    @DisplayName("Should find longest substring for 'abcabcbb'")
    void testBasicCase() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    @DisplayName("Should return 1 for 'bbbbb'")
    void testRepeatedCharacters() {
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    @DisplayName("Should return 3 for 'pwwkew'")
    void testMixedCharacters() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    @DisplayName("Should return 2 for 'au'")
    void testTwoCharacters() {
        assertEquals(2, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("au"));
    }

    @Test
    @DisplayName("Should return 3 for 'dvdf'")
    void testDvdfCase() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    @DisplayName("Should handle empty string")
    void testEmptyString() {
        assertEquals(0, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(""));
    }

    @Test
    @DisplayName("Should handle null string")
    void testNullString() {
        assertEquals(0, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(null));
    }

    @Test
    @DisplayName("Should handle single character")
    void testSingleCharacter() {
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("a"));
    }

    @Test
    @DisplayName("Should return full length for unique characters")
    void testUniqueCharacters() {
        assertEquals(26, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    @DisplayName("Set approach should give same result")
    void testSetApproach() {
        String[] testCases = { "abcabcbb", "bbbbb", "pwwkew", "au", "dvdf" };
        int[] expected = { 3, 1, 3, 2, 3 };

        for (int i = 0; i < testCases.length; i++) {
            assertEquals(expected[i], LongestSubstringWithoutRepeating.lengthOfLongestSubstringWithSet(testCases[i]));
        }
    }

    @Test
    @DisplayName("Should return correct substring")
    void testReturnSubstring() {
        String result1 = LongestSubstringWithoutRepeating.longestSubstring("abcabcbb");
        assertTrue(result1.length() == 3 && !result1.contains("a".repeat(2)));

        String result2 = LongestSubstringWithoutRepeating.longestSubstring("bbbbb");
        assertEquals("b", result2);

        String result3 = LongestSubstringWithoutRepeating.longestSubstring("");
        assertEquals("", result3);
    }

    @Test
    @DisplayName("Should handle all same characters")
    void testAllSameCharacters() {
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("aaaa"));
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("zzzz"));
    }

    @Test
    @DisplayName("Should handle ascending then repeating")
    void testAscendingThenRepeating() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcd\\u0061cd"));
    }
}
