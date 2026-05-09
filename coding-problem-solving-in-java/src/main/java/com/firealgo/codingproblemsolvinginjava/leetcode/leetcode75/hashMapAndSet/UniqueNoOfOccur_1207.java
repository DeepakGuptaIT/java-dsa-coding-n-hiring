package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.hashMapAndSet;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNoOfOccur_1207 {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences((new int[]{1,2,2,1,1,3,3})));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        var map = new HashMap<Integer, Integer>();
        for (int e: arr) {
            map.put(e, map.getOrDefault(e,0)+1);
        }
        System.out.println(map);

        var set = new HashSet<Integer>();
        for(int e : map.values()) {
            if(!set.add(e)) return false;
        }
        return true;

    }
}
