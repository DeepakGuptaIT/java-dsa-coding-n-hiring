package com.firealgo.codingproblemsolvinginjava.leetcode.googleIntQ.intervalOverlap;

/**
 * <a href="https://leetcode.com/discuss/post/6762636/google-swe-l3-interview-experience-selec-dm2l/">...</a>
 */
public class IntervalOverlap {
    public static boolean isOverlap(int[] interval1, int[] interval2) {
        return interval1[0] <= interval2[1] && interval2[0] <= interval1[1];
    }

    public static void main(String[] args) {
        int[] interval1 = {1, 5};
        int[] interval2 = {4, 8};
        System.out.println("Do intervals overlap? " + isOverlap(interval1, interval2));
    }
}