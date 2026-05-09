package com.firealgo.codingproblemsolvinginjava.hackerearth.aug22.objectEdge.nov2024.Netcore.treasure;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int[][] tiles = {
                {200, 3, 10},
                {5, 10, 3},
                {4, 5, 500}
        };
        
        // Solve the problem
        int out_ = solve(3, tiles);
        System.out.println(out_);
    }

    public static int solve(int n, int[][] tiles) {
        // Initialize the DP table with infinity
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        // Initialize the starting point
        dp[0][0] = leadingZeros(tiles[0][0]);

        // Fill the first row
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + leadingZeros(tiles[0][j]);
        }

        // Fill the first column
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + leadingZeros(tiles[i][0]);
        }

        // Fill the rest of the DP table
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + leadingZeros(tiles[i][j]);
            }
        }

        // The answer is the minimum leading zeros to reach the bottom-right corner
        return dp[n - 1][n - 1];
    }

    // Function to calculate leading zeros for a number
    public static int leadingZeros(int x) {
        if (x == 0) {
            return 1;  // Special case for zero
        }
        return (int) Math.floor(Math.log10(x));
    }
}

