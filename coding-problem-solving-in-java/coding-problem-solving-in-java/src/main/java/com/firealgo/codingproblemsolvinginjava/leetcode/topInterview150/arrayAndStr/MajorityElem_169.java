package com.firealgo.codingproblemsolvinginjava.leetcode.topInterview150.arrayAndStr;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MajorityElem_169 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> fr = new HashMap<>();
        for (int e : nums) {
            fr.put(e, fr.getOrDefault(e, 0) + 1);
        }
        int max = fr.values().stream().mapToInt(e -> e).max().getAsInt();
//        int key = fr.entrySet().stream().filter(e -> e.getValue() == max).findFirst().get().getKey();
//        return key;
        return fr.entrySet().stream().max(Comparator.comparing(e -> e.getValue())).get().getKey();

    }
}
