package com.firealgo.codingproblemsolvinginjava.leetcode.topInterview150.arrayAndStr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
 * 27. Remove Element
 */
public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        // Output: 5, nums = [0,1,4,0,3,_,_,_]
        System.out.println(removeElement(nums, val)); // 5
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement2(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int e : nums) {
            if (e != val) {
                list.add(e);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();

    }
}