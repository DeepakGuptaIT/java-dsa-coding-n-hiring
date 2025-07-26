package com.firealgo.codingproblemsolvinginjava.hackerearth.aug22.objectEdge.nov2024.Netcore;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {
                {2, 3, 10},
                {5, 10, 3},
                {4, 5, 5}
        };

        System.out.println("Minimum leading zeros: " + solve(3, grid));
    }
    public static int countTrailingZeros(int num) {
        if (num == 0) {
            return Integer.MAX_VALUE;
        }
        int count = 0;
        while (num % 10 == 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int solve(int m, int[][] tiles) {
        int[][] dp = new int[m][m];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dp[0][0] = countTrailingZeros(tiles[0][0]);

        // Fill first row
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + countTrailingZeros(tiles[0][j]);
        }

        // Fill first column
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + countTrailingZeros(tiles[i][0]);
        }

        // Fill rest of the dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + countTrailingZeros(tiles[i][j]);
            }
        }

        return dp[m - 1][m - 1];
    }
}

