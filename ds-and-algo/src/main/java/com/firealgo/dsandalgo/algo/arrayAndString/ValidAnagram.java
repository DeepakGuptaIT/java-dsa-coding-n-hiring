package com.firealgo.dsandalgo.algo.arrayAndString;

import java.util.HashMap;

//https://leetcode.com/problems/valid-anagram/
// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// using all the original letters exactly once.
public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        // Call different approaches
//        System.out.println("Sorting Approach: " + isAnagramSorting(s, t));
        System.out.println("HashMap Approach: " + isAnagramHashMap(s, t));
//        System.out.println("Optimal Approach: " + isAnagramOptimal(s, t));
    }

    private static boolean isAnagramHashMap(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);
            }
        }
        return charCount.isEmpty();
    }
}
