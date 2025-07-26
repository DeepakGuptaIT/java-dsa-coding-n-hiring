package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.round2_202501.arraystring;

public class MergeStringsAlternatively_1768 {
    public static void main(String[] args) {
//        System.out.println(mergeAlternately("abc", "pqr"));
//        System.out.println(mergeAlternately("abc", "pqrxyz"));
        System.out.println(mergeAlternately("abc", "p"));
        System.out.println(mergeAlternately("ab", "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        StringBuilder res = new StringBuilder();
        int len = Math.min(len1, len2);
        for (int i = 0; i < len; i++) {
            res.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (len1 > len2) {
            res.append(word1.substring(len));
        } else if(len2 > len1) {
            res.append(word2.substring(len));
        } else {
            // nothing
        }
        return res.toString();
    }
}
