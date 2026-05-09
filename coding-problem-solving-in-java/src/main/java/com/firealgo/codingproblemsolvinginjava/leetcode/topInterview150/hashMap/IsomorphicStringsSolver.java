package com.firealgo.codingproblemsolvinginjava.leetcode.topInterview150.hashMap;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/description/
public class IsomorphicStringsSolver {

    public static void main(String[] args) {
        IsomorphicStringsSolver solver = new IsomorphicStringsSolver();

        System.out.println(solver.isIsomorphicV1("egg", "add"));     // true
        System.out.println(solver.isIsomorphic("foo", "bar"));     // false
        System.out.println(solver.isIsomorphic("paper", "title")); // true
        System.out.println(solver.isIsomorphicV1("badc", "baba"));   // false
    }

    public boolean isIsomorphicV1(String s, String t) {
        // write your code here
        Map<Character, Character> map = new HashMap<>(26);
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i), c2 = t.charAt(i);
            if (map.containsKey(c1) && map.get(c1) != c2) {
                return false;
            } else {
                if (map.containsValue(c2) && map.get(c1) == null) return false;
                map.put(c1, c2);
            }

        }

        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check mapping from s → t
            if (sToT.containsKey(c1)) {
                if (sToT.get(c1) != c2) return false;
            } else {
                sToT.put(c1, c2);
            }

            // Check mapping from t → s
            if (tToS.containsKey(c2)) {
                if (tToS.get(c2) != c1) return false;
            } else {
                tToS.put(c2, c1);
            }
        }

        return true;
    }


}
