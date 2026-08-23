package com.firealgo.problemsolving.twoPointers;

import java.util.Arrays;

public class MoveZeros_283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroesAtEnd(nums);// expected = [1,3,12,0,0]
    }
    public static void moveZeroesAtEnd(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
