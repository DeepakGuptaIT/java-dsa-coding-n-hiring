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

        int[] arr = {1,1,2,2,2,3};

        int result = removeDuplicatesII(arr);

        System.out.println("Unique elements: " + result);

        // Print the unique elements
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicatesII(int[] arr) {
        int j = 0;

        // Fast pointer scans the entire array
        for (int i = 0; i < arr.length; i++) {
            if(j < 2 || arr[i] != arr[j-2]) {
                arr[j++] = arr[i];
            }

        }

        // slow represents the number of valid elements
        return j;
    }

    // note array is sorted
    // {1, 1, 2, 2, 3};
    private static int removeDuplicates(int[] arr) {
        int j = 0; // slow pointer
        for (int i = 1; i < arr.length; i++) {
            if(arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }

        }
        return j+1;
    }
}