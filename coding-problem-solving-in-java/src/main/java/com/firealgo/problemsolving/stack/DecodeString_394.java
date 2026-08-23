package com.firealgo.problemsolving.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DecodeString_394 {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));//aaabcbc
        System.out.println(decodeString("3[a2[c]]"));

    }

    public static String decodeStringV1(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> sbStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                numStack.push(n);
                n = 0;
                sbStack.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = numStack.pop();
                StringBuilder temp = sb;
                sb = sbStack.pop();
                while (k-- > 0) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();

    }

    // improved using chatgpt
    public static String decodeString(String s) {
        Deque<Integer> numStack = new ArrayDeque<>();
        Deque<StringBuilder> sbStack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                numStack.push(n);
                sbStack.push(sb);
                sb = new StringBuilder();
                n = 0;
            } else if (c == ']') {
                int k = numStack.pop();
                StringBuilder temp = sbStack.pop();
                temp.append(sb.toString().repeat(k)); // Optimized using `repeat()`
                sb = temp;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // recursive approach
    public static String decodeStringRecursive(String s) {
        return decodeHelper(s, new int[]{0});
    }

    private static String decodeHelper(String s, int[] index) {
        StringBuilder sb = new StringBuilder();
        int num = 0;

        while (index[0] < s.length()) {
            char c = s.charAt(index[0]);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                index[0]++;
                String subStr = decodeHelper(s, index);
                sb.append(subStr.repeat(num));
                num = 0;
            } else if (c == ']') {
                index[0]++;
                return sb.toString();
            } else {
                sb.append(c);
            }
            index[0]++;
        }
        return sb.toString();
    }


}

//import java.util.Deque;
//import java.util.ArrayDeque;


