package com.firealgo.problemsolving.math;

import java.util.Arrays;

public class TypeOfTrangle_3024 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5};


        System.out.println(triangleType(nums));
    }

    public static String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    private static boolean canFormATriangle(int[] nums) {
        int s1 = nums[0] + nums[1];
        int s2 = nums[0] + nums[2];
        int s3 = nums[1] + nums[2];
        return s1 > nums[2] && s2 > nums[1] && s3 > nums[0];
    }
}
