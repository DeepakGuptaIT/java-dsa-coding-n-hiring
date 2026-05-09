package com.firealgo.codingproblemsolvinginjava.hackerearth.aug22.objectEdge.nov2024.Netcore;// Java program for the above approach

import java.util.Arrays;

class GFG {

    // Function to find if given Strings
// are same or not
    static boolean sameStrings(String str1,
                               String str2) {
        int N = str1.length();
        int M = str2.length();

        // Base Condition
        if (N != M) {
            return false;
        }

        // Stores frequency of characters
        // of the String str1 and str2
        int[] a = new int[256];
        int[] b = new int[256];

        // Traverse Strings str1 & str2 and
        // store frequencies in a[] and b[]
        for (int i = 0; i < N; i++) {
            a[str1.charAt(i) - 'a']++;
            b[str2.charAt(i) - 'a']++;
        }

        // Check if both Strings have
        // same characters or not
        int i = 0;
        while (i < 256) {
            if ((a[i] == 0 && b[i] == 0)
                    || (a[i] != 0 && b[i] != 0)) {
                i++;
            }

            // If a character is present
            // in one String and is not in
            // another String, return false
            else {
                return false;
            }
        }

        // Sort the array a[] and b[]
        Arrays.sort(a);
        Arrays.sort(b);

        // Check arrays a and b contain
        // the same frequency or not
        for (i = 0; i < 256; i++) {

            // If the frequencies are not
            // the same after sorting
            if (a[i] != b[i])
                return false;
        }

        // At this point, str1 can
        // be converted to str2
        return true;
    }

    static boolean sameStrings(int n, String s, String t) {


        // Stores frequency of characters
        // of the String str1 and str2
        int[] sarr = new int[256];
        int[] tarr = new int[256];

        // Traverse Strings s & t and store frequencies in a[] and b[]
        for (int i = 0; i < n; i++) {
            sarr[s.charAt(i) - 'a']++;
            tarr[t.charAt(i) - 'a']++;
        }

        // Check if both Strings have same characters or not
        int i = 0;
        while (i < 256) {
            if ((sarr[i] == 0 && tarr[i] == 0)
                    || (sarr[i] != 0 && tarr[i] != 0)) {
                i++;
            }

            // If a character is present in one String and is not in
            // another String, return false
            else {
                return false;
            }
        }

        // Sort the array
        Arrays.sort(sarr);
        Arrays.sort(tarr);

        // Check arrays sarr and tarr contain
        // the same frequency or not
        for (i = 0; i < 256; i++) {

            // If the frequencies are not the same after sorting
            if (sarr[i] != tarr[i])
                return false;
        }

        // At this point, s can be converted to t
        return true;
    }

    // Driver Code
    public static void main(String[] args) {
        System.out.println(sameStrings(4, "abcd", "abcz"));
    }
}

// This code is contributed by 29AjayKumar
