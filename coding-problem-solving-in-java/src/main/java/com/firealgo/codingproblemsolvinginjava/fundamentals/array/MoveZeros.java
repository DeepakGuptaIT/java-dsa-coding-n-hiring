package com.firealgo.codingproblemsolvinginjava.fundamentals.array;

/**
 * <h2>Move All Zeros to End</h2>
 * 
 * <p>
 * <strong>Problem:</strong> Given an array of integers, move all 0s to the end
 * while maintaining the relative order of the non-zero elements.
 * Try to do it in-place (no extra array).
 * </p>
 * 
 * <p>
 * <strong>Example:</strong><br>
 * Input: [0, 1, 0, 3, 12]<br>
 * Output: [1, 3, 12, 0, 0]
 * </p>
 * 
 * <p>
 * <strong>Approach:</strong> Use two pointers - one to scan and one to place
 * non-zero elements.<br>
 * Time Complexity: O(n)<br>
 * Space Complexity: O(1)
 * </p>
 * 
 * @author DSA Practice
 * @version 1.0
 */
public class MoveZeros {

    /**
     * Moves all zeros to the end of the array in-place.
     * 
     * <p>
     * Algorithm:
     * 1. Use pointer 'insert' to track where next non-zero element should go
     * 2. Scan through array with pointer 'current'
     * 3. When non-zero element found, swap with element at 'insert'
     * 4. This maintains relative order and avoids moving zeros multiple times
     * </p>
     * 
     * @param nums array containing integers including zeros
     */
    public static void moveZeroes(int[] nums) {
        int insertPosition = 0; // Position where next non-zero should be placed

        // First pass: move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPosition++] = nums[i];
            }
        }

        // Second pass: fill remaining positions with zeros
        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }
    }

    /**
     * Alternative approach using swap method (more efficient as it minimizes
     * writes).
     * 
     * @param nums array containing integers including zeros
     */
    public static void moveZeroesOptimized(int[] nums) {
        int insertPosition = 0;

        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                // Only swap if positions are different
                if (insertPosition != current) {
                    int temp = nums[insertPosition];
                    nums[insertPosition] = nums[current];
                    nums[current] = temp;
                }
                insertPosition++;
            }
        }
    }

    /**
     * Main method for testing the solution.
     */
    public static void main(String[] args) {
        // Test case 1
        int[] test1 = { 0, 1, 0, 3, 12 };
        moveZeroes(test1);
        System.out.println("Test 1 (moveZeroes):");
        printArray(test1); // [1, 3, 12, 0, 0]

        // Test case 2
        int[] test2 = { 0, 1, 0, 3, 12 };
        moveZeroesOptimized(test2);
        System.out.println("Test 2 (moveZeroesOptimized):");
        printArray(test2); // [1, 3, 12, 0, 0]

        // Test case 3: No zeros
        int[] test3 = { 1, 2, 3 };
        moveZeroes(test3);
        System.out.println("Test 3 (no zeros):");
        printArray(test3); // [1, 2, 3]

        // Test case 4: All zeros
        int[] test4 = { 0, 0, 0 };
        moveZeroes(test4);
        System.out.println("Test 4 (all zeros):");
        printArray(test4); // [0, 0, 0]
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
