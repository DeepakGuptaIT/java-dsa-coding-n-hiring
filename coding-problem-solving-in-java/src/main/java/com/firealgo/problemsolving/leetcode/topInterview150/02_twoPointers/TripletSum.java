package com.firealgo.problemsolving.leetcode.problems.twopointer;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/3sum/description/">Leet Code Link</a>
 */
public class TripletSum {
    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 1, 2, -1, -4}; // Output: [[-1,-1,2],[-1,0,1]]
        System.out.println(threeSum(nums1));
    }

    public static List<List<Integer>> threeSumOld(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = nums[i];
            int b = -nums[i];
            Map<Integer, Integer> map = new HashMap<>();// value -> index
            for (int j = i; j < n; j++) {
                int x = nums[j];
                int y = b - nums[j];
                if (map.containsKey(y) && map.get(y) != i) {
                    res.add(List.of(a, y, x));
                }
                map.put(x, j);
            }
        }
        return res;
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Important to handle duplicates
        Set<List<Integer>> res = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            int a = nums[i];
            int target = -a;
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                int x = nums[j];
                int y = target - x;
                if (map.containsKey(y)) {
                    List<Integer> triplet = Arrays.asList(a, y, x);
                    triplet.sort(Integer::compareTo); // Ensure consistent order
                    res.add(triplet); // Set ensures uniqueness
                }
                map.put(x, j);
            }
        }

        return new ArrayList<>(res);
    }
    


}
