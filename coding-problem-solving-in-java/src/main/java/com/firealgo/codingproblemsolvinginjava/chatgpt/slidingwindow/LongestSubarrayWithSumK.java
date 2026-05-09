package com.firealgo.codingproblemsolvinginjava.chatgpt.slidingwindow;

public class LongestSubarrayWithSumK {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 10};

        int K = 14;

//        int result = longestSubarrayWithSumAtMostK(arr, K);
        int result2 = longestSubarrayWithSumAtMostK(new int[]{6, 1, 2, 3}, 3);
        System.out.println("Longest subarray length = " + result2);
    }

    private static int longestSubarrayWithSumAtMostK(int[] arr, int K) {
        int sum = 0;
        int maxLen = 0;
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
            if(sum > K) {
                sum = sum - arr[i];
                i++;
            } else {
                maxLen = Math.max(maxLen , j - i + 1);
            }

        }
        return maxLen;
    }
}
