package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.stack;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveStarsFromAStringSol02_2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
//        s ="a***";
        String out = removeStar(s);// Expected: lecoe
        System.out.println(out);
    }

    private static String removeStar(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c: arr) {
            if(c == '*' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.stream().map(e -> e+"").collect(Collectors.joining(""));






    }
}
