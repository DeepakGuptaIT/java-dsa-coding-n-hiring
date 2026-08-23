package com.firealgo.problemsolving.slidingWindow;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/
public class MaxSumDistinctSubarray {

    public static void main(String[] args) {
        MaxSumDistinctSubarray solver = new MaxSumDistinctSubarray();

        // Test case 1: basic valid distinct subarrays
        int[] nums1 = {1, 5, 4, 2, 9, 9, 9};
        int k1 = 3;
        System.out.println(solver.maximumSubarraySum(nums1, k1));
        // Expected: 15 (subarray [4,2,9])

        // Test case 2: all duplicates
        int[] nums2 = {4, 4, 4, 4};
        int k2 = 2;
        System.out.println(solver.maximumSubarraySum(nums2, k2));
        // Expected: 0 (no valid subarray)

        // Test case 3: exact k-length array with all distinct
        int[] nums3 = {10, 20, 30};
        int k3 = 3;
        System.out.println(solver.maximumSubarraySum(nums3, k3));
        // Expected: 60 (entire array)

        // Test case 4: window slides with duplicates
        int[] nums4 = {1, 2, 3, 2, 4, 5};
        int k4 = 3;
        System.out.println(solver.maximumSubarraySum(nums4, k4));
        // Expected: 12 (subarray [3,2,4] is valid, sum=9; subarray [2,4,5] sum=11 → max=11)

        // Test case 5: k larger than array length
        int[] nums5 = {1, 2};
        int k5 = 3;
        System.out.println(solver.maximumSubarraySum(nums5, k5));
        // Expected: 0 (window cannot be formed)

        // Test case 6: single element subarrays
        int[] nums6 = {7, 1, 5, 3};
        int k6 = 1;
        System.out.println(solver.maximumSubarraySum(nums6, k6));
        // Expected: 7 (single element, just the max value)
    }

    /**
     * Finds the maximum sum of any subarray of length k with distinct elements.
     *
     * @param nums input array
     * @param k    length of the subarray
     * @return maximum sum of a distinct subarray of length k
     */
    public long maximumSubarraySum(int[] nums, int k) {
        // TODO: implement sliding window + hash map logic here
        if(k > nums.length) return -1;
        Map<Integer, Integer> freq = new HashMap<>(k);
        long winSum = 0;
        long maxSum = 0;

        int n = nums.length;
        // calculate first window sum
        for (int i = 0; i < k; i++) {
            winSum += nums[i];
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        if (freq.size() == k) {
            maxSum = winSum;
        }
        for (int i = k; i < n; i++) {
            int in = nums[i];
            int out = nums[i - k];

            // add new elem
            winSum += in;
            freq.put(in, freq.getOrDefault(in, 0) + 1);

            // remove out elem
            winSum -= out;
            if (freq.get(out) == 1) freq.remove(out);
            else freq.put(out, freq.get(out) - 1);
            if (freq.size() == k) {
                maxSum = Math.max(maxSum, winSum);
            }
        }

        return maxSum;
    }
}
