package com.firealgo.codingproblemsolvinginjava.leetcode.topInterview150.twopointer;

// https://leetcode.com/problems/valid-palindrome
public class IsPalindrome_125 {
    public static void main(String[] args) {
        System.out.println(isPalindromeV2("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindromeV2("race a car")); // false
    }
    public static boolean isPalindrome(String s) {
        // keep only alphanumeric and in lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return s.contentEquals(new StringBuilder(s).reverse());
    }
    public static boolean isPalindromeV2(String s) {
        // keep only alphanumeric and in lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = s.length() -1;
        while (start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeV3(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            // skip non-alphanumeric from start
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            // skip non-alphanumeric from end
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            // compare ignoring case
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

}
