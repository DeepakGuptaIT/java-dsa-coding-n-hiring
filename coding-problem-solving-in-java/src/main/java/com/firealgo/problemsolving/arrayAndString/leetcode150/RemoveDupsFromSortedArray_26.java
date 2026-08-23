package com.firealgo.problemsolving.arrayAndString.leetcode150;

import java.util.Arrays;

public class RemoveDupsFromSortedArray_26 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 4};
        // Output: 5, nums = [0,1,4,0,3,_,_,_]
        int x = removeDuplicates(nums);
        System.out.println(x);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, x)));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
