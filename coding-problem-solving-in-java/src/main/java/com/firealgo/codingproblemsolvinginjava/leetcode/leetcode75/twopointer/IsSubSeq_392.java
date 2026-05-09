package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.twopointer;

public class IsSubSeq_392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        char[] charArr = t.toCharArray();
        char[] charArr2 = s.toCharArray();
        int j = 0;
        for (char c : charArr) {
            if (j == charArr2.length) return true;
            if (c == charArr2[j]) {
                j++;
            }
        }
        return j == charArr2.length;
    }
}
