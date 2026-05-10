package com.firealgo.codingproblemsolvinginjava.techniques.twopointer;

/**
 * <h2>Container With Most Water - LeetCode 11</h2>
 * 
 * <p>
 * <strong>Problem:</strong> Given an integer array height of length n,
 * find two lines that together with the x-axis form a container,
 * such that the container contains the most water.
 * </p>
 * 
 * <p>
 * <strong>Example:</strong><br>
 * Input: height = [1,8,6,2,5,4,8,3,7]<br>
 * Output: 49<br>
 * Explanation: The max area is formed at index 1 and 8 (8 * 7 = 56)
 * </p>
 * 
 * <p>
 * <strong>Approach:</strong> Two-pointer technique starting from both ends.<br>
 * Time Complexity: O(n)<br>
 * Space Complexity: O(1)
 * </p>
 * 
 * @author DSA Practice
 * @version 1.0
 */
public class ContainerWithMostWater {

    /**
     * Finds the maximum area of water that can be contained.
     * 
     * <p>
     * Algorithm:
     * 1. Use two pointers: left at start, right at end
     * 2. Calculate area = min(height[left], height[right]) * (right - left)
     * 3. Move the pointer pointing to smaller height inward (to potentially find
     * taller line)
     * 4. Track maximum area found
     * </p>
     * 
     * @param height array of heights
     * @return maximum area that can be formed
     */
    public static int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate current area
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    /**
     * Returns both the maximum area and the indices that form it.
     * 
     * @param height array of heights
     * @return array containing [maxArea, leftIndex, rightIndex]
     */
    public static int[] maxAreaWithIndices(int[] height) {
        if (height == null || height.length < 2) {
            return new int[] { 0, 0, 0 };
        }

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int maxLeft = 0;
        int maxRight = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            if (currentArea > maxArea) {
                maxArea = currentArea;
                maxLeft = left;
                maxRight = right;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] { maxArea, maxLeft, maxRight };
    }

    /**
     * Main method for testing the solution.
     */
    public static void main(String[] args) {
        // Test case 1
        int[] test1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("Test 1 - [1,8,6,2,5,4,8,3,7]: " + maxArea(test1)); // 49

        // Test case 2
        int[] test2 = { 1, 1 };
        System.out.println("Test 2 - [1,1]: " + maxArea(test2)); // 1

        // Test case 3
        int[] test3 = { 2, 3, 4, 5, 18, 17, 6 };
        int[] result3 = maxAreaWithIndices(test3);
        System.out.println("Test 3 - [2,3,4,5,18,17,6]: maxArea = " + result3[0] +
                ", indices = [" + result3[1] + ", " + result3[2] + "]"); // 17

        // Test case 4
        int[] test4 = { 1, 2, 1 };
        System.out.println("Test 4 - [1,2,1]: " + maxArea(test4)); // 2
    }
}
