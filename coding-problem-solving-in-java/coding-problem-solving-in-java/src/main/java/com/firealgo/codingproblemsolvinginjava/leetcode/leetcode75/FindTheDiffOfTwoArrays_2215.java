package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Date - 18-aug-2024
 */
public class FindTheDiffOfTwoArrays_2215 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        // Output: [[1,3],[4,6]]
        System.out.println(findDifference(nums1,nums2));
    }

    public static List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {
        var set1 = Arrays.stream(nums1).boxed().distinct().toList();
        var set2 = Arrays.stream(nums2).boxed().distinct().toList();
        List<List<Integer>> out = new ArrayList<>(2);
        var diff1 = new ArrayList<>(set1);
        diff1.removeAll(set2);
        var diff2 = new ArrayList<>(set2);
        diff2.removeAll(set1);
//        System.out.println(diff1);
//        System.out.println(diff2);

        out.add(diff1);
        out.add(diff2);
        return out;
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        var set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        var diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);
        var diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);
//        System.out.println(diff1);
//        System.out.println(diff2);
        List<List<Integer>> out = new ArrayList<>(2);
        out.add(new ArrayList<>(diff1));
        out.add(new ArrayList<>(diff2));
    return out;
    }

    // fastest solution
    public static  List<List<Integer>> findDifference3(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for (int i : nums1) {
            s1.add(i);
        }

        for (int i : nums2) {
            s2.add(i);
        }

        for (int i : s1) {
            if (!s2.contains(i)) {
                ans.get(0).add(i);
            }
        }

        for (int i : s2) {
            if (!s1.contains(i)) {
                ans.get(1).add(i);
            }
        }

        return ans;
    }

}
