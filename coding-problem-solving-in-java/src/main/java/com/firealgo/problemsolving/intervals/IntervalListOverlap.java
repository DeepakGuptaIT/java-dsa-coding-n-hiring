package com.firealgo.problemsolving.intervals;

import java.util.Arrays;

public class IntervalListOverlap {
    public static boolean hasOverlap(int[][] intervals) {
        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Compare adjacent intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[i - 1][1]) {
                return true; // Found overlapping intervals
            }
        }
        return false;
    }

    public static int countOverlap(int[][] intervals) {
        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 0;
        // Compare adjacent intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[i - 1][1]) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[][] intervals = {{1, 5}, {6, 9}, {4, 8}};
        System.out.println("Does the list have overlapping intervals? " + hasOverlap(intervals));
        System.out.println("Maximum overlapping intervals: " + countOverlap(intervals));
    }
}