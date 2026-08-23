package com.firealgo.problemsolving.twoPointers.top;

/**
 * Is Subsequence
 *
 * https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * Example:
 * Input:  s = "abc", t = "ahbgdc"
 * Output: true
 *
 * Input:  s = "abc", t = "ahbfq"
 * Output: false
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc")); // true
        System.out.println(isSubsequence("abc", "ahbfq"));  // false
        System.out.println(isSubsequence("", "ahbgdc"));    // true
    }

    /**
     * Logic:
     * i -> points to the current character in t
     * j -> points to the current character in s
     *
     * Traverse t using i. When t[i] matches s[j], move j forward.
     * If all characters of s are matched, s is a subsequence of t.
     */
    public static boolean isSubsequence(String s, String t) {
        int j = 0;

        for (int i = 0; i < t.length(); i++) {

            // All characters of s have been matched
            if (j == s.length()) {
                return true;
            }

            // Move s pointer when characters match
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
        }

        // Check whether all characters of s were matched
        return j == s.length();
    }
}