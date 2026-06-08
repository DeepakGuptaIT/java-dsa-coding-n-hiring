package com.firealgo.problemsolving.leetcode.leetcode75.arraystring;

public class MergeStringsAlternatively_1768 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("abc", "pqrxyz"));
        System.out.println(mergeAlternately("abc", "p"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        boolean isWord1Smaller = len1 < len2;
        int n = isWord1Smaller ? len1 : len2;
        char[] res = new char[n * 2];
        int j = 0;
        for (int i = 0; i < n; i++) {
            res[j++] = chars1[i];
            res[j++] = chars2[i];
        }
        String out = new String(res);
        if (isWord1Smaller) {
            out = out + word2.substring(n);
        } else {
            out = out + word1.substring(n);
        }

        return out;
    }
}
