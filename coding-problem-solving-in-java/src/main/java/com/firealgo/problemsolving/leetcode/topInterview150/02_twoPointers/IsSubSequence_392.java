package com.firealgo.problemsolving.leetcode.leetcode75;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 */
public class IsSubSequence_392 {
    public static void main(String[] args) {
        String s = "abcddsdasdas", t = "ahbgdc";
//        System.out.println(isSubsequence(s,t));
        System.out.println(isSubsequence("","abc"));

    }
    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        int tlen = t.length();
        int slen = s.length();
        for (int i = 0; i < tlen; i++) {
            if(j == slen) return true;
            if(s.charAt(j) == t.charAt(i)) {
                j++;
            }
        }

        return j == slen;
    }
}
