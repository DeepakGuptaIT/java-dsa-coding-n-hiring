package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowelsOfaString {
    public static void main(String[] args) {
        System.out.println(reverseVowels2("hello"));// Output: "holle"
        System.out.println(reverseVowels("leetcode"));// Output: "leotcede"

    }

    /**
     * solution 1
     */
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        List<Character> possibleVowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        var vowels = new ArrayList<>();
        for (char c : arr) {
            if (possibleVowels.contains(c)) {
                vowels.add(c);
            }
        }
        Collections.reverse(vowels);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (char c : arr) {
            if (possibleVowels.contains(c)) {
                sb.append(vowels.get(j++));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * solution 1
     */
    public static String reverseVowels3(String s) {
        char[] arr = s.toCharArray();
        String possibleVowels = "aeiouAEIOU";
        var vowels = new ArrayList<>();
        for (char c : arr) {
            if (possibleVowels.indexOf(c) != -1) {
                vowels.add(c);
            }
        }
        Collections.reverse(vowels);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (char c : arr) {
            if (possibleVowels.indexOf(c) != -1) {
                sb.append(vowels.get(j++));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * using 2 pointer
     */
    public static String reverseVowels2(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = word.length - 1;
        String vowels = "aeiouAEIOU";
        while (start < end) {
            while (start < end && vowels.indexOf(word[start]) == -1) {
                ++start;
            }
            while (start < end && vowels.indexOf(word[end]) == -1) {
                --end;
            }
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            ++start;
            --end;
        }
        return new String(word);
    }
}
