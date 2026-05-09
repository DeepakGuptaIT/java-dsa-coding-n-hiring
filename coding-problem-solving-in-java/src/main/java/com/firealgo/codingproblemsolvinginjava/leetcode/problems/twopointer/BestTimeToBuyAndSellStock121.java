package com.firealgo.codingproblemsolvinginjava.leetcode.problems.twopointer;

public class BestTimeToBuyAndSellStock121 {
    // Your implementation goes here
    public static void main(String[] args) {
        System.out.println("Max Profit = " + maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5
        System.out.println("Max Profit2 = " + maxProfit(new int[]{2,10,1,4})); // 3
    }

    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int max = 0;
        int n = prices.length;
        for (int i = 1; i < n ; i++) {
            if(buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            max = Integer.max(prices[i]-buyPrice, max);

        }
        return max;

    }
    public static int maxProfitWrong(int[] prices) {
        int max = 0;
        int n = prices.length;
        int i = 0, j = n - 1;
        while (i < j) {
            int diff = prices[j] - prices[i];
            if (diff > 0) {

                max = Integer.max(max, diff);
                if(prices[j] - prices[i+1] > max) {
                    i++;
                } else {
                    j--;
                }

            } else {
                i++;
            }
        }
        return max;
    }
}