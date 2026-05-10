package com.firealgo.codingproblemsolvinginjava.fundamentals.string;

/**
 * <h2>Count Vowels in String</h2>
 * 
 * <p>
 * <strong>Problem:</strong> Count the number of vowels (a, e, i, o, u) present
 * in the given string. Case-insensitive.
 * </p>
 * 
 * <p>
 * <strong>Example:</strong><br>
 * Input: "Aaaabc"<br>
 * Output: 4
 * </p>
 * 
 * <p>
 * <strong>Approach:</strong> Iterate through string and count vowels.<br>
 * Time Complexity: O(n)<br>
 * Space Complexity: O(1)
 * </p>
 * 
 * @author DSA Practice
 * @version 1.0
 */
public class CountVowels {

    /**
     * Counts the number of vowels in the given string.
     * 
     * <p>
     * Vowels considered: a, e, i, o, u (case-insensitive)
     * </p>
     * 
     * @param str input string
     * @return count of vowels in the string
     */
    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        String lowerStr = str.toLowerCase();

        for (char ch : lowerStr.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    /**
     * Alternative approach using regex pattern matching.
     * 
     * @param str input string
     * @return count of vowels in the string
     */
    public static int countVowelsRegex(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return (int) str.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) >= 0)
                .count();
    }

    /**
     * Alternative approach using stream operations.
     * 
     * @param str input string
     * @return count of vowels in the string
     */
    public static int countVowelsStream(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return (int) str.toLowerCase().chars()
                .filter(c -> (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'))
                .count();
    }

    /**
     * Main method for testing the solution.
     */
    public static void main(String[] args) {
        // Test case 1
        String test1 = "Aaaabc";
        System.out.println("Test 1 - 'Aaaabc': " + countVowels(test1)); // 4

        // Test case 2
        String test2 = "hello world";
        System.out.println("Test 2 - 'hello world': " + countVowels(test2)); // 3

        // Test case 3
        String test3 = "bcdfg";
        System.out.println("Test 3 - 'bcdfg': " + countVowels(test3)); // 0

        // Test case 4
        String test4 = "aeiou";
        System.out.println("Test 4 - 'aeiou': " + countVowels(test4)); // 5

        // Test case 5 - using stream approach
        System.out.println("Test 5 - Stream approach 'Aaaabc': " + countVowelsStream(test1)); // 4

        // Test case 6 - using regex approach
        System.out.println("Test 6 - Regex approach 'hello world': " + countVowelsRegex(test2)); // 3
    }
}
