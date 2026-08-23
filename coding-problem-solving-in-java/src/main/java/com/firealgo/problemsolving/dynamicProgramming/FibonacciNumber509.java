package com.firealgo.problemsolving.dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * leetcode || easy || DP
 * <a href="https://leetcode.com/problems/fibonacci-number/description/">Link</a>
 * [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
 */
public class FibonacciNumber509 {
    static Map<Integer, Integer> map = new HashMap<>();

    // Your implementation goes here
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            res.add(fibUsingMemo(i));
        }
        System.out.println(res);
    }

    // this is dynamic programming
    public static int fib(int n) {

        int f0 = 0, f1 = 1, fn = 0;
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 1);
        for (int i = 3; i <= n; i++) {
            fn = map.get(i - 1) + map.get(i - 2);
            map.put(i, fn);
        }
        return map.get(n);
    }

    public static int fibUsingMemo(int n) {
        int[] memo = new int[n+1];
        return fibMemo(n, memo);

    }

    private static int fibMemo(int n, int[] memo) {
        if(memo[n]!=0) {
            return memo[n];
        }
        if(n == 0) return 0;
        if(n == 1 || n == 2) {
            return 1;
        } else {
            memo[n] = fibMemo(n - 1, memo)
                    + fibMemo(n - 2, memo);
            return memo[n];
        }

    }
}
