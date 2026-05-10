package com.firealgo.dsandalgo.algo.slidingWindow;

/**
 * LeetCode 643: Maximum Average Subarray I
 *
 * Problem:
 * Given an integer array nums and an integer k,
 * find the maximum average value of any contiguous subarray of length k.
 *
 * Approach: Sliding Window
 *
 * Why Sliding Window?
 * - We need fixed-size subarray (size = k)
 * - Instead of recalculating sum for every window (O(n*k)),
 *   we reuse previous computation → O(n)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MaximumAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {

        // Step 1: Calculate sum of first window (first k elements)
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // Initialize max sum with first window
        int maxSum = windowSum;

        /**
         * Step 2: Slide the window
         *
         * At each step:
         * - Remove element going out of window
         * - Add new incoming element
         */
        for (int i = k; i < nums.length; i++) {

            // Remove leftmost element of previous window
            windowSum -= nums[i - k];

            // Add current element
            windowSum += nums[i];

            // Update max sum
            maxSum = Math.max(maxSum, windowSum);
        }

        // Step 3: Return maximum average
        return (double) maxSum / k;
    }
}