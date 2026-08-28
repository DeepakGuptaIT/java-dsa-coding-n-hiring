package com.firealgo.problemsolving.twoPointers.practice;

/**
 * Pattern: Two Pointer Pattern — Opposite Direction
 * <p>
 * Problem: Two Sum in a Sorted Array
 * <p>
 * Given a sorted array and a target value, find two numbers
 * whose sum equals the target.
 * <p>
 * Example:
 * Input:  arr = {1, 2, 3, 4, 6}, target = 6
 * Output: 2, 4
 * <p>
 * Explanation:
 * arr[1] + arr[3] = 2 + 4 = 6
 */
public class TwoSumSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;

        int[] result = twoSum(arr, target);

        System.out.println(result[0] + ", " + result[1]);
    }

    private static int[] twoSum(int[] arr, int target) {
        int i = 0, j = arr.length-1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if(sum == target) {
                return new int[] {arr[i], arr[j]};
            }
            if(sum > target) j--;
            else i++;
        }
        return new int[]{};
    }
}