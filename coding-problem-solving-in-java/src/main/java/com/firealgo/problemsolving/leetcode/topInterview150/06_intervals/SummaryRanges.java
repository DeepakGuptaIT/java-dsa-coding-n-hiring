package com.firealgo.problemsolving.leetcode.topInterview150.intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        SummaryRanges solution = new SummaryRanges();

        int[][] testCases = {
//                {0, 2, 3, 4, 6, 8, 9},
                {0,1,2,4,5,7},
//                {},
//                {-1},
//                {1, 3, 5, 7},
//                {-3, -2, -1, 0, 1}
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test case " + (i + 1) + ":");
            System.out.println(solution.summaryRanges(testCases[i]));
            System.out.println("----------------------");
        }
    }

    public List<String> summaryRanges(int[] nums) {
        // TODO: implement logic
        if (nums.length == 0) return new ArrayList<>();
        if (nums.length == 1) return List.of(String.valueOf(nums[0]));
        List<String> res = new ArrayList<>();
        int left = 0;
        if (nums[0] + 1 != nums[1]) {
            res.add(String.valueOf(nums[0]));
            left++;
        }
        int n = nums.length;
        for (int i = 1; i < n; i++) {

            if (i < n - 1 && nums[i] != nums[i + 1] - 1) {

                if (left == i) res.add(String.valueOf(nums[left]));
                else res.add(nums[left] + "->" + nums[i]);
                left = i + 1;
            }
            if (i == n - 1) {
                if (left == i) res.add(String.valueOf(nums[left]));
                else res.add(nums[left] + "->" + nums[i]);
            }

        }
        return res;
    }

    public List<String> summaryRangesV2(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();

        List<String> list = new ArrayList<>();
        int start = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[i-1]+1) {
                addRange(list, start, nums[i-1]);
                start = nums[i];
            }

        }
        // add last range
        addRange(list, start, nums[nums.length-1]);

        return list;
    }

    private void addRange(List<String> list, int start, int end) {
        if(start == end) list.add(String.valueOf(start));
        else list.add(start + "->" + end);
    }

}
