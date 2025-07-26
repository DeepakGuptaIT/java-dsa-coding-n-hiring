package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.arraystring;

public class IncreasingTripletSeq_334 {
    public static void main(String[] args) {
        var ob = new IncreasingTripletSeq_334();
        int[] nums = {5,6,3,1,10};
        System.out.println(ob.increasingTriplet2(nums));
    }
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = 0;

        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                c = num;
                return true;
            }
        }
        System.out.format("value of a, b and c is %s, %s, %s", a,b,c);
        return false;
    }

    public boolean increasingTriplet2(int[] nums) {
        int prev1 = Integer.MAX_VALUE;
        int prev2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > prev2 && prev2 > prev1) {
                return true;
            }

            if (nums[i] > prev1) {
                prev2 = nums[i];
            } else {
                prev1 = nums[i];
            }
        }

        return false;
    }
}
