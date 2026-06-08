package com.firealgo.problemsolving.leetcode.topInterview150.slidingwindow;

public class MinimumSizeSubarraySum {

    // TODO: Implement your logic here
    public static int minSubArrayLen(int target, int[] nums) {
        // write your code
        int currSum = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];
            while (currSum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                currSum -= nums[left++];
            }
        }

        return (minLen != Integer.MAX_VALUE) ? minLen : 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int result = minSubArrayLen(target, nums);
        System.out.println("Minimum length subarray: " + result);
    }
}
