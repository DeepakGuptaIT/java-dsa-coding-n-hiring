package com.firealgo.codingproblemsolvinginjava.leetcode.randomQ;

import java.util.Arrays;

/**
 *
 *
 */
public class MoveZerosAtBeginning {

    public static void main(String[] args) {
        int[] nums = {12, 2, 3, 0, 1, 0};//{0, 1, 0, 3, 12}; // {1,3,12,0,0}
        int[] nums2 = {0}; // {0}
        int[] nums3 = {12, 2, 3}; // {12,2,3}
        System.out.println("Before: " + Arrays.toString(nums));
        moveZeroesAtStartV2(nums);
        System.out.println("After: " + Arrays.toString(nums));
    }

    private static void moveZeroesAtStartV2(int[] nums) {
        int n = nums.length;
        int j = n -1;
        for (int i = n-1; i >= 0; i--) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j--;
            }
        }
//        for (int i = 0; i <= n-(n-j); i++) {
//            nums[i] = 0;
//        }
        // Fill the beginning of the array with zeros
        while (j >= 0) {
            nums[j] = 0;
            j--;
        }

    }


}
