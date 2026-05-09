package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.twopointer;

import java.util.Arrays;

public class MoveZeros_283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);// expected = [1,3,12,0,0]
        System.out.println(Arrays.toString(nums));
    }
    private static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        // set all values after j with zero
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
