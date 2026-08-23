package com.firealgo.problemsolving.twoPointers;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum_167 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))); // [1,2]
    }

    private static int[] twoSum(int[] numbers, int target) {
        int end = numbers.length - 1;
        int start = 0;
        int sum = 0;
        while (start < end) {
            sum = numbers[start] + numbers[end];
            if (sum > target) end--;
            else if (sum < target) {
                start++;
            } else {
                return new int[]{start+1, end+1};
            }
        }

        return null;
    }
}
