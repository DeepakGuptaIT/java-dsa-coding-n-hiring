package com.firealgo.problemsolving.hashmap.top;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 *
 * https://leetcode.com/problems/two-sum/description/
 *
 * Example:
 * Input:  nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 *
 * Approach:
 * Store each number and its index in a HashMap.
 * For every number, check whether its complement already exists.
 *
 * Time:  O(n)
 * Space: O(n)
 */
public class TwoSum_1 {

    public static void main(String[] args) {
        TwoSum_1 solution = new TwoSum_1();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public int[] twoSum(int[] nums, int target) {
        // Store number -> index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the required complement was already seen
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store current number and its index
            map.put(nums[i], i);
        }

        // No valid pair found
        return new int[]{};
    }
}