package com.firealgo.problemsolving.twoPointers.practice;

/**
 * Pattern: Two Pointer Pattern — Same Direction
 *
 * Problem: Remove Duplicates from Sorted Array
 *
 * Given a sorted array, remove duplicates in-place and return
 * the number of unique elements.
 *
 * The first k elements of the array should contain the unique elements.
 *
 * Example:
 * Input:  arr = {1, 1, 2, 2, 3}
 * Output: 3
 *
 * Modified array:
 * {1, 2, 3, ...}
 *
 * Explanation:
 * There are 3 unique elements: 1, 2, and 3.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};

        int result = removeDuplicates(arr);

        System.out.println("Unique elements: " + result);

        // Print the unique elements
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // note array is sorted
    private static int removeDuplicates(int[] arr) {
        // TODO: Implement same-direction two pointer logic
        int j = 1; // slow pointer
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[j-1]) {
                arr[j] = arr[i];
                j++;
            }
        }

        return j;
    }
}