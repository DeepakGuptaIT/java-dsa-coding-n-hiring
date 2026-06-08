package com.firealgo.problemsolving.fundamentals.array;

/**
 * <h2>Merge Sorted Array - LeetCode 88</h2>
 * 
 * <p>
 * <strong>Problem:</strong> You are given two integer arrays nums1 and nums2,
 * sorted in non-decreasing order,
 * and two integers m and n, representing the number of valid elements in nums1
 * and nums2 respectively.
 * Merge nums2 into nums1 as one sorted array in-place.
 * </p>
 * 
 * <p>
 * <strong>Example:</strong><br>
 * Input: nums1 = [1,2,2,0,0,0], m = 3, nums2 = [2,5,6], n = 3<br>
 * Output: [1,2,2,2,5,6]
 * </p>
 * 
 * <p>
 * <strong>Approach:</strong> Two-pointer technique starting from the end to
 * avoid overwriting elements.
 * Time Complexity: O(m + n)<br>
 * Space Complexity: O(1)
 * </p>
 * 
 * @author DSA Practice
 * @version 1.0
 */
public class MergeSortedArray {

    /**
     * Merges nums2 into nums1 as one sorted array (in-place).
     * 
     * <p>
     * Strategy: Compare elements from the end of both arrays and place the larger
     * one at the end of nums1, moving backwards. This prevents overwriting unseen
     * elements in nums1.
     * </p>
     * 
     * @param nums1 first sorted array with extra space at the end
     * @param m     number of valid elements in nums1
     * @param nums2 second sorted array
     * @param n     number of valid elements in nums2
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // pointer for nums1's valid part
        int j = n - 1; // pointer for nums2
        int k = m + n - 1; // pointer for final position in nums1

        // Merge from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 still has remaining elements, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        // If nums1 still has elements, they're already in correct place
    }

    /**
     * Alternative approach using extra space (easier to understand).
     * 
     * @param nums1 first sorted array
     * @param m     number of valid elements in nums1
     * @param nums2 second sorted array
     * @param n     number of valid elements in nums2
     * @return merged sorted array
     */
    public static int[] mergeWithExtraSpace(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1
        while (i < m) {
            result[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2
        while (j < n) {
            result[k++] = nums2[j++];
        }

        return result;
    }

    /**
     * Main method for testing the solution.
     */
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        merge(nums1, 3, new int[] { 2, 5, 6 }, 3);
        System.out.println("Test 1 - Merge in-place:");
        printArray(nums1); // [1, 2, 2, 3, 5, 6]

        // Test case 2
        int[] result = mergeWithExtraSpace(
                new int[] { 1 },
                1,
                new int[] {},
                0);
        System.out.println("Test 2 - Merge with extra space:");
        printArray(result); // [1]
    }

    /**
     * Utility method to print array contents.
     * 
     * @param arr array to print
     */
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println();
    }
}
