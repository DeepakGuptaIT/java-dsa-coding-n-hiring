package com.firealgo.codingproblemsolvinginjava._2025.aug;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75
public class FindTheDiffOfTwoArrays {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3},new int[]{2, 4, 6}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var set1 = new HashSet<>(Arrays.asList(nums1));
        var set2 = new HashSet<>(Arrays.asList(nums2));
        return null;
    }
}
