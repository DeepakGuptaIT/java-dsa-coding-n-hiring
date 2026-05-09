package com.firealgo.codingproblemsolvinginjava.leetcode.topInterview150.hashMap;

import java.util.HashMap;
import java.util.Map;

public class RansomNoteSolver {

    public static void main(String[] args) {
        RansomNoteSolver solver = new RansomNoteSolver();

        System.out.println(solver.canConstruct("a", "b"));        // false
        System.out.println(solver.canConstruct("aa", "ab"));      // false
        System.out.println(solver.canConstruct("aa", "aab"));     // true
        System.out.println(solver.canConstruct("", "abc"));       // true
        System.out.println(solver.canConstruct("abc", ""));       // false
    }

    public boolean canConstructV1(String ransomNote, String magazine) {
        // write your code here
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c :
                ransomNote.toCharArray()) {
            if (!freq.containsKey(c)) return false;
            if (freq.get(c) == 1) {
                freq.remove(c);
            } else {
                freq.put(c, freq.get(c) - 1);
            }
        }

        return true;
    }

    // Using Array
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        //prepare freq array
        for (char c :
                magazine.toCharArray()) {
            arr[c -'a']++;
        }
        for (char c :
                ransomNote.toCharArray()) {
            if (arr[c - 'a'] == 0) return false;
            arr[c-'a'] --;
        }
        return true;
    }
}
