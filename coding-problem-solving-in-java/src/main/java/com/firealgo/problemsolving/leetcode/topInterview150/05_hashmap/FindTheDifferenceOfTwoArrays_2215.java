package com.firealgo.problemsolving.leetcode.leetcode75;

import java.util.*;

/**
 * LeetCode 2215:
 * Find the Difference of Two Arrays
 *
 * Problem Link:
 * https://leetcode.com/problems/find-the-difference-of-two-arrays/
 *
 * Problem:
 * Given two integer arrays nums1 and nums2,
 * return:
 *
 * 1. Distinct integers present in nums1 but not in nums2
 * 2. Distinct integers present in nums2 but not in nums1
 *
 * Example:
 * nums1 = [1,2,3]
 * nums2 = [2,4,6]
 *
 * Output:
 * [[1,3],[4,6]]
 *
 * ---------------------------------------------------------
 * APPROACH: HashSet
 * ---------------------------------------------------------
 *
 * Why HashSet?
 * - Removes duplicates automatically
 * - O(1) average lookup time
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 */
public class FindTheDifferenceOfTwoArrays_2215 {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        System.out.println(findDifference(nums1, nums2));
    }

    /**
     * Returns:
     * [
     *   elements only in nums1,
     *   elements only in nums2
     * ]
     */
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        /* =====================================================
           STEP 1: Convert arrays to sets
           ===================================================== */

        // Removes duplicates automatically
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        /* =====================================================
           STEP 2: Find elements present only in set1
           ===================================================== */

        List<Integer> onlyInNums1 = new ArrayList<>();

        for (int num : set1) {

            // If element not present in set2
            if (!set2.contains(num)) {
                onlyInNums1.add(num);
            }
        }

        /* =====================================================
           STEP 3: Find elements present only in set2
           ===================================================== */

        List<Integer> onlyInNums2 = new ArrayList<>();

        for (int num : set2) {

            // If element not present in set1
            if (!set1.contains(num)) {
                onlyInNums2.add(num);
            }
        }

        /* =====================================================
           STEP 4: Prepare final output
           ===================================================== */

        return List.of(onlyInNums1, onlyInNums2);
    }
}