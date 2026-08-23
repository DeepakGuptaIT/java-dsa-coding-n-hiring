package com.firealgo.problemsolving.slidingWindow.practice;

public class MinSizeSubArraySum {

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 2, 4, 3};
        int k = 7;

        int result = minSizeSubArraySum(arr, k);

        System.out.println("Minimum subarray length: " + result);
    }

    private static int minSizeSubArraySum(int[] arr, int k) {
        // TODO: Implement sliding window logic
        int i=0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            while (sum >= k) {
                minLen = Math.min(minLen, j-i+1);
                // shrink
                sum -= arr[i];
                i++;
            }
            if(j == arr.length -1) System.out.println(i + " & j= " + j);
        }

        return minLen;
    }
}