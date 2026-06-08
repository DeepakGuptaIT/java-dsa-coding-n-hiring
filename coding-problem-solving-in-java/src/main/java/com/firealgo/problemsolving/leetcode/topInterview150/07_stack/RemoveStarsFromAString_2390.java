package com.firealgo.problemsolving.leetcode.leetcode75.stack;

import java.util.Stack;

public class RemoveStarsFromAString_2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        s ="a***";
        String out = removeStar(s);// Expected: lecoe
        System.out.println(out);
    }

    private static String removeStar(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c: chars) {
            if(c == '*' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(var c: stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
