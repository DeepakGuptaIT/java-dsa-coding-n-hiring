package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.slidingwindow;

// https://www.geeksforgeeks.org/window-sliding-technique/
public class MaximumSumOfSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {100, 200, -300, 400,1};
        int k = 2;
        // Output : 700
        int max = maxSum(arr, k);
        System.out.println(max);
    }

    private static int maxSum(int[] arr, int k) {

        // n must be greater then k
        final int n = arr.length;
        if (n <= k)
            throw new IllegalArgumentException("Array size must be greater than k");

        // Compute sum of the first window
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        // Compute sum of remaining windows by
        int windowSum = maxSum;
        for (int i = k; i < n; i++) {
          windowSum +=arr[i] - arr[i-k];
          maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;

    }
    private static double findMaxAverage(int[] nums, int k) {

        final int n = nums.length;
        // Compute sum of the first window
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        // Compute sum of remaining windows by
        double windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum +=nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return (maxSum /k);
    }
}
