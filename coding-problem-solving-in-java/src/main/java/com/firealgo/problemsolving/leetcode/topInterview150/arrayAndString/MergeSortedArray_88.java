package com.firealgo.problemsolving.leetcode.topInterview150.arrayAndString;

import java.util.Arrays;

/**
 * LeetCode 88 - Merge Sorted Array
 *
 * Problem Link:
 * https://leetcode.com/problems/merge-sorted-array/
 *
 * Problem:
 * You are given two sorted integer arrays nums1 and nums2.
 *
 * nums1 has a length of m + n, where:
 * - The first m elements represent the valid sorted elements.
 * - The last n elements are placeholders (0s) and should be ignored.
 *
 * nums2 has a length of n and contains n sorted elements.
 *
 * Merge nums2 into nums1 as one sorted array.
 *
 * The final sorted array should be stored inside nums1.
 *
 * Example:
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6], n = 3
 *
 * Output:
 * [1,2,2,3,5,6]
 */
public class MergeSortedArray_88 {

    public static void main(String[] args) {

        /* ==========================================
           CASE 1: Example from LeetCode
           ========================================== */
        test(
                new int[]{1, 2, 3, 0, 0, 0},
                3,
                new int[]{2, 5, 6},
                3
        );

        /* ==========================================
           CASE 2: nums1 has no valid elements
           ========================================== */
        test(
                new int[]{0},
                0,
                new int[]{1},
                1
        );

        /* ==========================================
           CASE 3: nums2 is empty
           ========================================== */
        test(
                new int[]{1},
                1,
                new int[]{},
                0
        );

        /* ==========================================
           CASE 4: All nums2 elements are smaller
           ========================================== */
        test(
                new int[]{4, 5, 6, 0, 0, 0},
                3,
                new int[]{1, 2, 3},
                3
        );

        /* ==========================================
           CASE 5: All nums2 elements are larger
           ========================================== */
        test(
                new int[]{1, 2, 3, 0, 0, 0},
                3,
                new int[]{4, 5, 6},
                3
        );

        /* ==========================================
           CASE 6: Duplicate values
           ========================================== */
        test(
                new int[]{1, 2, 2, 0, 0, 0},
                3,
                new int[]{2, 2, 3},
                3
        );

        /* ==========================================
           CASE 7: Negative numbers
           ========================================== */
        test(
                new int[]{-5, -2, 0, 0, 0},
                2,
                new int[]{-4, -1, 3},
                3
        );

        /* ==========================================
           CASE 8: Both arrays contain same values
           ========================================== */
        test(
                new int[]{1, 1, 1, 0, 0, 0},
                3,
                new int[]{1, 1, 1},
                3
        );
    }

    /**
     * Merge nums2 into nums1 in-place.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int i = 0, j = 0;
        while (i < m && j < n) {


        }




    }

    /**
     * Helper method to execute test cases.
     */
    private static void test(int[] nums1, int m, int[] nums2, int n) {

        System.out.println("--------------------------------------------------");
        System.out.println("nums1 = " + Arrays.toString(nums1) + ", m = " + m);
        System.out.println("nums2 = " + Arrays.toString(nums2) + ", n = " + n);

        merge(nums1, m, nums2, n);

        System.out.println("Result = " + Arrays.toString(nums1));
    }
}