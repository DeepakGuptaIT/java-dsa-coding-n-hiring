package com.firealgo.codingproblemsolvinginjava.hackerearth.aug22.objectEdge.nov2024.Netcore;

public class TreasureHunter {
    public static void main(String[] args) {
        int[][] grid = {
            {2, 3, 10},
            {5, 10, 3},
            {4, 5, 5}
        };
        
        System.out.println("Minimum leading zeros: " + findMinLeadingZeros(grid));
    }

    public static int findMinLeadingZeros(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        
        // Initialize dp array with maximum values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        // Initialize the first cell
        dp[0][0] = countLeadingZeros(grid[0][0]);
        
        // Fill the dp array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + countLeadingZeros(grid[i][j]));
                }
                if (j > 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + countLeadingZeros(grid[i][j]));
                }
            }
        }
        
        return dp[n - 1][n - 1];
    }
    
    public static int countLeadingZeros(int num) {
        if (num == 0) return Integer.MAX_VALUE; // Handle division by zero
        int count = 0;
        while (num % 10 == 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
