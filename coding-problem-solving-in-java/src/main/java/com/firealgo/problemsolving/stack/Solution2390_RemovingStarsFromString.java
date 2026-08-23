package com.firealgo.problemsolving.stack;

import java.util.Stack;

public class Solution2390_RemovingStarsFromString {
    public static void main(String[] args) {
        String s = "leet**cod*e"; //"lecoe"
//         s = "erase*****"; // ""
        System.out.printf("Input String: %s. Output String: %s", s, removeStars(s));

    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if(c == '*' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

//        String out = stack.stream().map(e -> e+ "").collect(Collectors.joining(""));
//        return out;
        StringBuilder sb = new StringBuilder();
        stack.forEach(sb::append);
        return sb.toString();


    }
}
