package com.firealgo.codingproblemsolvinginjava.hackerEarthPractise;

import java.util.Arrays;

/**
 * Problem:
 * Given an array containing only:
 * 0s, 1s and 2s
 *
 * Sort the array in-place in O(n) time.
 *
 * Example:
 * Input:  [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 *
 * This problem is famously known as:
 * Dutch National Flag Algorithm
 *
 * ---------------------------------------------------
 * APPROACH 1: Counting Sort
 * ---------------------------------------------------
 * Count number of 0s, 1s and 2s
 * Then overwrite array
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * ---------------------------------------------------
 * APPROACH 2: Dutch National Flag (Optimal)
 * ---------------------------------------------------
 * Maintain 3 regions:
 *
 * [0 ... low-1]     → all 0s
 * [low ... mid-1]   → all 1s
 * [mid ... high]    → unknown
 * [high+1 ... n-1]  → all 2s
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class SortColors {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 2, 1, 0};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
// Use either solution
//        sortUsingCounting(arr);
        sortColors(arr);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    /* =========================================================
       APPROACH 1: COUNTING SORT
       ========================================================= */

    /**
     * Count occurrences of 0, 1 and 2
     * Then rebuild array
     */
    public static void sortUsingCounting(int[] nums) {

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        // Count frequencies
        for (int num : nums) {

            if (num == 0) {
                zeroCount++;
            } else if (num == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
        }

        // Rewrite array
        int index = 0;

        while (zeroCount-- > 0) {
            nums[index++] = 0;
        }

        while (oneCount-- > 0) {
            nums[index++] = 1;
        }

        while (twoCount-- > 0) {
            nums[index++] = 2;
        }
    }

    /* =========================================================
       APPROACH 2: DUTCH NATIONAL FLAG (OPTIMAL)
       ========================================================= */

    /**
     * Optimal in-place one-pass solution
     *
     * Core Idea:
     * - Move 0s to left
     * - Move 2s to right
     * - Keep 1s in middle
     *
     * Pointers:
     * low  → next position for 0
     * mid  → current element
     * high → next position for 2
     */
    public static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        /**
         * Process elements until mid crosses high
         */
        while (mid <= high) {

            /**
             * Case 1:
             * Current element is 0
             *
             * Swap with low pointer
             * Expand both low and mid
             */
            if (nums[mid] == 0) {

                swap(nums, low, mid);

                low++;
                mid++;
            }

            /**
             * Case 2:
             * Current element is 1
             *
             * 1 is already in correct middle region
             */
            else if (nums[mid] == 1) {
                mid++;
            }

            /**
             * Case 3:
             * Current element is 2
             *
             * Swap with high pointer
             * Reduce high
             *
             * IMPORTANT:
             * Do NOT increment mid here
             * because swapped element from right
             * still needs processing
             */
            else {

                swap(nums, mid, high);

                high--;
            }
        }
    }

    /* =========================================================
       HELPER METHOD
       ========================================================= */

    /**
     * Swap two elements in array
     */
    private static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}