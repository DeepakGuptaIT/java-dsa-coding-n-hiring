package com.firealgo.problemsolving.arrayAndString.top;

import java.util.Arrays;

/**
 * Reverse an Array
 * <p>
 * Problem Link:
 * https://www.geeksforgeeks.org/program-to-reverse-an-array/
 * <p>
 * Problem:
 * Reverse the elements of an array.
 * <p>
 * Example:
 * Input:  [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * <p>
 * -------------------------------------------------------
 * APPROACH 1: Using Extra Array
 * -------------------------------------------------------
 * Create a new reversed array
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * <p>
 * -------------------------------------------------------
 * APPROACH 2: In-Place Reversal (Optimal)
 * -------------------------------------------------------
 * Swap elements from both ends
 * <p>
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ReverseAnArray {

    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(original));

        /* ================= EXTRA ARRAY APPROACH ================= */

        int[] reversed = reverseUsingExtraArray(original);

        System.out.println("\nReversed Using Extra Array:");
        System.out.println(Arrays.toString(reversed));

        /* ================= IN-PLACE APPROACH ================= */

        reverseInPlace(original);

        System.out.println("\nReversed In-Place:");
        System.out.println(Arrays.toString(original));
    }

    /* =========================================================
       APPROACH 1: USING EXTRA ARRAY
       ========================================================= */

    /**
     * Create a new reversed array
     *
     * Example:
     * original[0] -> reversed[last]
     * original[1] -> reversed[last-1]
     */
    public static int[] reverseUsingExtraArray(int[] arr) {

        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }

    /* =========================================================
       APPROACH 2: IN-PLACE REVERSAL (OPTIMAL)
       ========================================================= */

    /**
     * Reverse array in-place using two pointers
     *
     * Core Idea:
     * - Swap first and last
     * - Move inward
     *
     * Example:
     * [1,2,3,4,5]
     *
     * Swap:
     * 1 ↔ 5
     * 2 ↔ 4
     *
     * Result:
     * [5,4,3,2,1]
     */
    public static void reverseInPlace(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        /**
         * Continue until pointers cross
         */
        while (left < right) {

            swap(arr, left, right);

            left++;
            right--;
        }
    }

    /* =========================================================
       HELPER METHOD
       ========================================================= */

    /**
     * Swap two elements in array
     */
    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}