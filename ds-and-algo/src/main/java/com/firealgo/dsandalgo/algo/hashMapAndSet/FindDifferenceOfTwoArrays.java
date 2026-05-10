package com.firealgo.dsandalgo.algo.hashMapAndSet;

import java.util.*;

/**
 * LeetCode 2215: Find the Difference of Two Arrays
 * <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75">Problem Link</a>
 * Approach: Hashing using HashSet
 *
 * Why HashSet?
 * - Removes duplicates automatically
 * - Provides O(1) lookup
 *
 * Goal:
 * - Find elements in nums1 but not in nums2
 * - Find elements in nums2 but not in nums1
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */
public class FindDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        // Step 1: Convert arrays to sets (removes duplicates)
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        /**
         * Step 2: Find unique elements
         *
         * result1 → elements in set1 but not in set2
         * result2 → elements in set2 but not in set1
         */
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        // Elements present in set1 but not in set2
        for (int num : set1) {
            if (!set2.contains(num)) {
                result1.add(num);
            }
        }

        // Elements present in set2 but not in set1
        for (int num : set2) {
            if (!set1.contains(num)) {
                result2.add(num);
            }
        }

        /**
         * Step 3: Combine results
         *
         * Output format:
         * [result1, result2]
         */
        List<List<Integer>> result = new ArrayList<>();
        result.add(result1);
        result.add(result2);

        return result;
    }
}