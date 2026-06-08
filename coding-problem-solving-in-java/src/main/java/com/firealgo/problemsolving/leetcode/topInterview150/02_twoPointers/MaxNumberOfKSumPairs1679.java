package com.firealgo.problemsolving.leetcode.leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://leetcode.com/problems/max-number-of-k-sum-pairs/description/

public class MaxNumberOfKSumPairs1679 {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4};
//        System.out.println(maxOperations(nums, 5));// expected=2
        int[] nums2 = {3,1,3,4,3};
        System.out.println(maxOperationsUsingSortingAndSlidingWindow(nums2, 6));// expected= 1
    }

    //

    /**
     Beats 86%
     Logic: Sort the array -> create two pointer one at beginning and other at the end -> run the loop and check sum.
     */
    public static int maxOperationsUsingSortingAndSlidingWindow(int[] arr, final int k) {
        Arrays.parallelSort(arr);
        int i =0, j= arr.length-1;
        int counter = 0;
        while (i<j) {
            int sum = arr[i] + arr[j];
            if(sum == k) {
                i++;
                j--;
                counter++;
            } else if (sum > k) {
                j--;
            } else {
                i++;
            }
        }
        return counter;

    }

    // Getting Time limit exceed
    public static int maxOperations(int[] nums, final int k) {
        var map = Arrays.stream(nums).boxed().collect(Collectors.toMap(Function.identity(), e -> k-e, (v1, v2) -> v1));
        var foundIndices = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(foundIndices.contains(i)) continue;
            int x = nums[i];
            int y = k-x;
            if(x < k && map.containsKey(y)) {
                int j = i+1;
                while (j< nums.length) {
                    if(foundIndices.contains(j) || nums[j] != y) {
                        j++;
                    } else break;
                }
                if(j< nums.length && nums[j] == y) {
                    foundIndices.add(j);
                    ++count;
                }

            }

        }
        return count;

    }
}
