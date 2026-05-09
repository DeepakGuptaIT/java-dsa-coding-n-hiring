package com.firealgo.codingproblemsolvinginjava.leetcode.topInterview150.intervals;

//https://leetcode.com/problems/merge-intervals/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_56 {
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {8, 10},
                {2, 6},
                {15, 18}
        };
        System.out.println(Arrays.deepToString(merge(intervals)));

    }

    public static int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        int[] start = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(start[1] >= arr[i][0]) {
                start[1] = Math.max(start[1], arr[i][1]) ;
            } else {
                list.add(start);
                start = arr[i];
            }
        }
        // add last interval
        list.add(start);
        return list.toArray(new int[0][]);
    }
}
