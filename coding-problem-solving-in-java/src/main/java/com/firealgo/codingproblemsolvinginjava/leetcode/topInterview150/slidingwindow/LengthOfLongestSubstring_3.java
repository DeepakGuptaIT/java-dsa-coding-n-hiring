package com.firealgo.codingproblemsolvinginjava.leetcode.topInterview150.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=study-plan-v2&envId=top-interview-150
public class LengthOfLongestSubstring_3 {
    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring("abcabcbb"));//3
        //System.out.println(lengthOfLongestSubstring("bbbbb"));//1
        System.out.println(lengthOfLongestSubstringV2("pwwkew"));//3
    }

    // Using HashSet
    public static int lengthOfLongestSubstring(String s) {
        int l = 0;
        HashSet<Character> unique = new HashSet<>();
        int max = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!unique.contains(c)) {
                // ✅ Expand the window
                unique.add(c);
                max = Math.max(max, i - l + 1);
            } else {
                // ⚠️ Found duplicate: shrink window from the left until duplicate removed
                while (unique.contains(c)) {
                    unique.remove(chars[l++]);
                }
                unique.add(c); // add the current char once duplicate is removed
            }
        }

        return max;
    }

    //  Using HashMap - Improved
    public static int lengthOfLongestSubstringV2(String s) {
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            map.put(c, i);
            maxLen = Math.max(maxLen, i - left + 1);
        }

        return maxLen;
    }
}
