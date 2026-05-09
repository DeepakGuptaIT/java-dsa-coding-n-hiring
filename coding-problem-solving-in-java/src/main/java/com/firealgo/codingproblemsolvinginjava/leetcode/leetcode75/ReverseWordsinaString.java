package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75;

import java.util.Arrays;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));// Output: "blue is sky the"
        System.out.println(reverseWords("  hello world  "));// Output: "world hello"
        System.out.println(reverseWords("a good   example"));// Output: "example good a"
    }
    /*
    Approach: split the array by whitespaces
    -> loop words in reverse order
    -> store in StringBuilder
     */
    public static String reverseWords(String s) {
        var words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            var item = words[i];
            sb.append(item);
            if(i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
