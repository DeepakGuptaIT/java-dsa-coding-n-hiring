package com.firealgo.problemsolving.leetcode.topInterview150.twopointer;

public class IsSubSeqStr {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdcf"));// true
        System.out.println(isSubsequence("abc", "ahbfq"));// false
    }

    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        int tlen = t.length();
        int slen = s.length();
        for (int i = 0; i < tlen; i++) {
            if (j == slen) return true;
            if (t.charAt(i) == s.charAt(j)) j++;
        }
        return j == slen;

    }
}
