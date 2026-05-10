package com.firealgo.dsandalgo.algo.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Optimized Balanced Brackets
 *
 * Key Optimization:
 * - Push expected closing bracket instead of opening
 * - Removes need for switch-case matching
 *
 * Time: O(n)
 * Space: O(n)
 */
public class BalancedBracketsOptimized {

    public static boolean isBalanced(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            /* ================= OPENING BRACKETS ================= */

            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            }

            /* ================= CLOSING BRACKETS ================= */

            else {
                /**
                 * If:
                 * - stack is empty → no matching opening bracket
                 * - OR top does not match current closing bracket
                 */
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }

        // Stack must be empty for valid expression
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String[] tests = {
                "([{}])",
                "([)]",
                "((()))",
                "{[}",
                "",
                "(",
                "([]{})"
        };

        for (String test : tests) {
            System.out.println(test + " -> " +
                    (isBalanced(test) ? "Balanced" : "Not Balanced"));
        }
    }
}