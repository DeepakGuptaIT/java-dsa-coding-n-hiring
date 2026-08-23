package com.firealgo.problemsolving.hashmap;

// https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueNumberOfOccurances {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
        int[] arr2 = {1, 2};
        System.out.println(uniqueOccurrences(arr2));
    }

    // normal count calculation is faster than groupby.
    public static boolean uniqueOccurrences(int[] arr) {
        var countOccurences  = new HashMap<Integer, Integer>();
        // store all the occurences in hashMap of every key
        for (int i : arr) {
            countOccurences.put(i, countOccurences.getOrDefault(i, 0) + 1);
        }
        // // check if any occurence is repeated twice using hashset
        var set = new HashSet<>();
        for(int v: countOccurences.values()) {
            if(!set.add(v)) {
                return false;
            }
        }
        return true;

    }
    public static boolean uniqueOccurrencesV1(int[] arr) {
        var map = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // I have to find it all value in values are unique
        var set = new HashSet<>();
        for(Long v: map.values()) {
            if(!set.add(v)) {
                return false;
            }
        }
        return true;

    }

}
