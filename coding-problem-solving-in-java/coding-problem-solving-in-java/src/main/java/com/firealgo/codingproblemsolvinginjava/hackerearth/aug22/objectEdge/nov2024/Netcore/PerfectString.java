package com.firealgo.codingproblemsolvinginjava.hackerearth.aug22.objectEdge.nov2024.Netcore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

// Java implementation of the approach
// https://www.geeksforgeeks.org/check-if-a-string-can-be-made-equal-to-another-string-by-swapping-or-replacement-of-characters/?ref=ml_lbp

public class PerfectString {

    // Function that returns true if the string
// can be made equal after one swap
    static boolean canBeEqual(char[] a, char[] b, int n) {
        // A and B are new a and b
        // after we omit the same elements
        List<Character> A = new ArrayList<>();
        List<Character> B = new ArrayList<>();

        // Take only the characters which are
        // different in both the strings
        // for every pair of indices
        for (int i = 0; i < n; i++) {

            // If the current characters differ
            if (a[i] != b[i]) {
                A.add(a[i]);
                B.add(b[i]);
            }
        }

        // The strings were already equal
        if (A.size() == B.size() &&
                B.size() == 0)
            return true;

        // If the lengths of the
        // strings are two
        if (A.size() == B.size() &&
                B.size() == 2) {

            // If swapping these characters
            // can make the strings equal
            if (A.get(0) == A.get(1) &&
                    B.get(0) == B.get(1))
                return true;
        }
        return false;
    }

    static boolean canBeEqual_V2(int n, String s, String t) {
        // The strings were already equal
        if (s.equals(t)) {
            return true;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        // A and B are new a and b
        // after we omit the same elements
        List<Character> A = new ArrayList<>();
        List<Character> B = new ArrayList<>();

        // Take only the characters which are
        // different in both the strings
        // for every pair of indices
        for (int i = 0; i < n; i++) {

            // If the current characters differ
            if (a[i] != b[i]) {
                A.add(a[i]);
                B.add(b[i]);
            }
        }

        // If the lengths of the
        // strings are two
        if (A.size() == B.size() &&
                B.size() == 2) {

            // If swapping these characters
            // can make the strings equal
            if (A.get(0) == A.get(1) &&
                    B.get(0) == B.get(1))
                return true;
        }
        return false;
    }

    static boolean canBeEqual_V3(int n, String s, String t) {
        // The strings were already equal
        if (s.equals(t)) {
            return true;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        var fa = new HashMap<Character, Integer>();
        var fb = new HashMap<Character, Integer>();
        for (char c : a) {
            fa.put(c, fa.getOrDefault(c, 0) + 1);
        }
        for (char c : b) {
            fb.put(c, fb.getOrDefault(c, 0) + 1);
        }
        String la = fa.values().stream().sorted().map(String::valueOf).collect(Collectors.joining());
        String lb = fb.values().stream().sorted().map(String::valueOf).collect(Collectors.joining());

        return la.equals(lb);
    }

    // Driver code
    public static void main(String[] args) {
        System.out.println(canBeEqual_V3(5, "bcc", "baa"));
        System.out.println(canBeEqual_V3(5, "abcd", "abcs"));
    }
}

// This code is contributed by Rajput-Ji

