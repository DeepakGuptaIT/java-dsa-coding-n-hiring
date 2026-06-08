package com.firealgo.problemsolving.leetcode.leetcode75;

// https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeStringAlternatively {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = br.readLine();
        String word2 = br.readLine();
        String out = mergeAlternately(word1, word2);
        System.out.println(out);

    }

    public static String mergeAlternately(String word1, String word2) {
        if (word1.isBlank() && word2.isBlank()) {
            return word1;
        }
        if (word1.isBlank()) {
            return word2;
        }

        if (word2.isBlank()) return word1;

        boolean isWord1IsSmaller = word1.length() < word2.length();

        int len = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if (isWord1IsSmaller) {
            sb.append(word2.substring(len));
        } else {
            sb.append(word1.substring(len));
        }
        return sb.toString();

    }
    public static String mergeAlternately2(String word1, String word2) {
        if (word1.isBlank() && word2.isBlank()) {
            return word1;
        }
        if (word1.isBlank()) {
            return word2;
        }

        if (word2.isBlank()) return word1;

        boolean isWord1IsSmaller = word1.length() < word2.length();

        int len = Math.min(word1.length(), word2.length());
        char[] out = new char[len * 2];
        for (int i = 0, j = 0; i < len; i++, j = j + 2) {
            out[j] = word1.charAt(i);
            out[j + 1] = word2.charAt(i);
        }

        String res = new String(out);
        if (isWord1IsSmaller) {
            res += word2.substring(len);
        } else {
            res += word1.substring(len);
        }
        return res;

    }
}
