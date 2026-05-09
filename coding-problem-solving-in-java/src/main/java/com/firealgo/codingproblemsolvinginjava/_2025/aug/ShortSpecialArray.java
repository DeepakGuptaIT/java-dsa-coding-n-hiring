package com.firealgo.codingproblemsolvinginjava._2025.aug;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 * Problem - Given an array A[] consisting of only 0s, 1s, and 2s.
 * The task is to sort the array,
 * i.e., put all 0s first, then all 1s and all 2s in last.
 */
public class ShortSpecialArray {
    public static void main(String[] args) {
        int[] arr = {0,1};//{2, 1, 0, 1, 2, 2, 0};
        arr = shortArray(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    // Time complexity = O(n) + O(n) = O(n)
    private static int[] shortArray(int[] arr, int n) {
        var map = Arrays.stream(arr).boxed()
                .collect(groupingBy(Function.identity(), counting()));
        System.out.println(map);
        long x = map.get(0);
        long y = map.get(1);
        for (int i = 0; i < n; i++) {
            if(i <x) arr[i] = 0;
            else if (i< x+y) arr[i] = 1;
            else arr[i] = 2;
        }

        return arr;
    }

}
