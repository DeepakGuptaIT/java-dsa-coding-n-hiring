package com.firealgo.codingproblemsolvinginjava.leetcode.randomQ.slidingwindow;

public class MaxVowels_1456 {
    public static void main(String[] args) {
        System.out.println(maxVowels2("tryhard", 4)); // 1
        System.out.println(maxVowels("abciiidef", 3)); // 3
        System.out.println(maxVowels("aeiou", 2)); // 2
        System.out.println(maxVowels("leetcode", 3)); // 2

    }

    public static int maxVowels(String s, int k) {
        int max = 0;
        if (s.length() < k) {
            throw new IllegalArgumentException("Length of string should be at least of size k: " + k);
        }
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        // calculate first window
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(arr[i]) != -1) {
                max++;
            }
        }
        int window = max;
        // calculate remaining windows
        for (int i = k; i < arr.length; i++) {
            if (vowels.indexOf(arr[i]) != -1) {
                window++;
            }
            if (vowels.indexOf(arr[i - k]) != -1) {
                window--;
            }
            max = Math.max(max, window);
        }
        return max;
    }
    public static int maxVowels2(String s, int k) {
        if (s.length() < k) {
            throw new IllegalArgumentException("Length of string should be at least of size k: " + k);
        }

        // Faster vowel lookup using boolean array
        boolean[] vowels = new boolean[128]; // ASCII range covers all lowercase & uppercase letters
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }

        int max = 0, window = 0;

        // Compute first window
        for (int i = 0; i < k; i++) {
            if (vowels[s.charAt(i)]) {
                window++;
            }
        }
        max = window;

        // Compute remaining windows efficiently
        for (int i = k; i < s.length(); i++) {
            if (vowels[s.charAt(i)]) {
                window++;
            }
            if (vowels[s.charAt(i - k)]) {
                window--;
            }
            max = Math.max(max, window);
        }

        return max;
    }

}
