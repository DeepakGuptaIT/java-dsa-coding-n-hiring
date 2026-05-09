package com.firealgo.codingproblemsolvinginjava.leetcode.randomQ.Hashing;

import java.util.*;
import java.util.stream.Collectors;

public class DiffOfTwoArray_2215 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}, nums2 = {2, 4, 6};
        // Output: [[1,3],[4,6]]
        System.out.println(findDifference(nums1, nums2));

    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        var diff1 = new ArrayList<>(set1);
        diff1.removeAll(set2);
        var diff2 = new ArrayList<>(set2);
        diff2.removeAll(set1);

        return Arrays.asList(diff1, diff2);
    }
}
