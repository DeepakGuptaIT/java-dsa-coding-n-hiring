package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.slidingwindow;

public class Practise_FindMaxNumOfVowelsInSubStringOfGivenLength_1456 {
    public static void main(String[] args) {
        var ob = new Practise_FindMaxNumOfVowelsInSubStringOfGivenLength_1456();
        int max = ob.maxVowels("abbbaa", 3);//Output: 3
        System.out.println(max);
    }

    public int maxVowels(String s, int k) {
        if (k > s.length()) {
            System.out.println("window size is smaller than array length");
            return -1;
        }
        // implement
        String vowels = "AEIOUaeiou";
        char[] arr = s.toCharArray();
        int n = arr.length;
        int max = 0;

        // find vowels of first window.
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(arr[i]) != -1) {
                max++;
            }

        }

        int window = max;

        // calculate the other window
        for (int i = k; i < n; i++) {
            if (vowels.indexOf(arr[i]) != -1) {
                window++;
            }
            if (vowels.indexOf(arr[i - k]) != -1) {
                window--;
            }
            max = Integer.max(max, window);

        }
        return max;
    }

}
