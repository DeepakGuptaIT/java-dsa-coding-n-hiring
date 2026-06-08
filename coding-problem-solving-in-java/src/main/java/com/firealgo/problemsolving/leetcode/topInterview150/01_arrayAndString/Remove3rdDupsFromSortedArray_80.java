package com.firealgo.problemsolving.leetcode.topInterview150.arrayAndStr;

import java.util.Arrays;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

public class Remove3rdDupsFromSortedArray_80 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        // Output: 5, nums = [0,1,4,0,3,_,_,_]
        System.out.println(removeDuplicates(nums)); // 5
        System.out.println(Arrays.toString(nums));
    }

    private static int removeDuplicates(int[] nums) {
        int j = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[j-2] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
