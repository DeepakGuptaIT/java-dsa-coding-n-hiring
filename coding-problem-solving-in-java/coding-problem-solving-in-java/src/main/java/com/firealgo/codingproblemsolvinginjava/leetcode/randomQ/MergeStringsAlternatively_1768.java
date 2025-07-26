package com.firealgo.codingproblemsolvinginjava.leetcode.randomQ;

public class MergeStringsAlternatively_1768 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "xyz"));
        System.out.println(mergeAlternately("abc", "xyzpqr"));
        System.out.println(mergeAlternately("abclmn", "xyz"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int size = Integer.min(word1.length(), word2.length());
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < size; i++) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }
        if(word1.length() < word2.length()) {
            res.append(word2.substring(size));
        } else res.append(word1.substring(size));
        return res.toString();
    }
}
