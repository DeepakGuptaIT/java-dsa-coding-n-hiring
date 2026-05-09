package com.firealgo.codingproblemsolvinginjava.leetcode.randomQ;

import java.util.Arrays;

public class RemoveDuplicateInSortedArray26 {
    public static void main(String[] args) {
        int[] nums = {5};//{0,0,1,1,1,2,2,3,3,4};
        System.out.println("original nums = "+ Arrays.toString(nums));
        int k = removeDuplicates(nums);
        System.out.println("k = "+ k);
        System.out.println("nums = "+ Arrays.toString(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
