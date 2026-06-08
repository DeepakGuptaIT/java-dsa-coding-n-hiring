package com.firealgo.problemsolving.leetcode.topInterview150.arrayAndStr;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

public class BestTimeToBuyStock_122 {
    public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    // Hint: track min buy price
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i-1] < prices[i]) {
                int profit = prices[i] - prices[i - 1];
                maxProfit += profit;
            }
        }
        return maxProfit;
    }
}
