package com.firealgo.codingproblemsolvinginjava.techniques.slidingwindow;

/**
 * <h2>Longest Substring Without Repeating Characters - LeetCode 3</h2>
 * 
 * <p>
 * <strong>Problem:</strong> Given a string s, find the length of the longest
 * substring
 * without repeating characters.
 * </p>
 * 
 * <p>
 * <strong>Example:</strong><br>
 * Input: "abcabcbb"<br>
 * Output: 3<br>
 * Explanation: "abc" is the longest substring
 * </p>
 * 
 * <p>
 * <strong>Approach:</strong> Sliding window with HashMap to track character
 * positions.<br>
 * Time Complexity: O(n)<br>
 * Space Complexity: O(min(m, n)) where m is alphabet size
 * </p>
 * 
 * @author DSA Practice
 * @version 1.0
 */
public class LongestSubstringWithoutRepeating {

    /**
     * Finds the length of the longest substring without repeating characters.
     * 
     * <p>
     * Algorithm:
     * 1. Use sliding window with two pointers: left and right
     * 2. Maintain HashMap of character -> last seen index
     * 3. Expand window by moving right pointer
     * 4. If character already seen, move left pointer to avoid duplicate
     * 5. Track maximum window size
     * </p>
     * 
     * @param s input string
     * @return length of longest substring without repeating characters
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        java.util.HashMap<Character, Integer> charIndex = new java.util.HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            // If character already in current window, move left pointer
            if (charIndex.containsKey(rightChar)) {
                left = Math.max(left, charIndex.get(rightChar) + 1);
            }

            // Update character's latest position
            charIndex.put(rightChar, right);

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    /**
     * Alternative approach using HashSet (simpler but potentially slower).
     * 
     * @param s input string
     * @return length of longest substring without repeating characters
     */
    public static int lengthOfLongestSubstringWithSet(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        java.util.HashSet<Character> charSet = new java.util.HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            // Remove characters from left while duplicate exists
            while (charSet.contains(rightChar)) {
                charSet.remove(s.charAt(left++));
            }

            charSet.add(rightChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    /**
     * Finds the longest substring without repeating characters (returns the
     * substring).
     * 
     * @param s input string
     * @return the longest substring without repeating characters
     */
    public static String longestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        java.util.HashMap<Character, Integer> charIndex = new java.util.HashMap<>();
        int maxLength = 0;
        int left = 0;
        int maxStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            if (charIndex.containsKey(rightChar)) {
                left = Math.max(left, charIndex.get(rightChar) + 1);
            }

            charIndex.put(rightChar, right);

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                maxStart = left;
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }

    /**
     * Main method for testing the solution.
     */
    public static void main(String[] args) {
        // Test case 1
        String test1 = "abcabcbb";
        System.out.println("Test 1 - 'abcabcbb': " + lengthOfLongestSubstring(test1)); // 3

        // Test case 2
        String test2 = "bbbbb";
        System.out.println("Test 2 - 'bbbbb': " + lengthOfLongestSubstring(test2)); // 1

        // Test case 3
        String test3 = "pwwkew";
        System.out.println("Test 3 - 'pwwkew': " + lengthOfLongestSubstring(test3)); // 3

        // Test case 4
        String test4 = "au";
        System.out.println("Test 4 - 'au': " + lengthOfLongestSubstring(test4)); // 2

        // Test case 5 - get actual substring
        System.out.println("Test 5 - Substring 'abcabcbb': '" + longestSubstring(test1) + "'"); // "abc"

        // Test case 6 - using set approach
        System.out.println("Test 6 - Set approach 'pwwkew': " + lengthOfLongestSubstringWithSet(test3)); // 3
    }
}
