package com.firealgo.problemsolving.leetcode.leetcode75.arraystring;

public class ReverseVowelsOfAString_345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));// holle
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i=0, j = chars.length -1;
        final String vowels = "aeiouAEIOU";
        while (i<j) {
            // look for the first vowels
            while (i<j && vowels.indexOf(chars[i]) == -1) {
                i++;
            }
            // look for the last vowels
            while (i<j && vowels.indexOf(chars[j]) == -1) {
                j--;
            }
            // exchange the values
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;j--;

        }
        return new String(chars);
    }
}
