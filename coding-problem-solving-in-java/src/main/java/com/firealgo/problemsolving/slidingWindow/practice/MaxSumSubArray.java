package com.firealgo.problemsolving.slidingWindow.practice;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int res = maxSumSubarray(arr, 3);
        System.out.println(res);
    }

    private static int maxSumSubarray(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            throw new IllegalArgumentException("Invalid window size");
        }
        int max;
        int windowSum = 0;
        //calculate sum of first window
//        int sum = 0;
        for (int i = 0; i < k; i++) {
            windowSum +=arr[i];
        }
        max = windowSum;
        // calculate sum of other window and compare
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i-k];
            max = Math.max(max, windowSum);
        }
        return max;
    }
}
