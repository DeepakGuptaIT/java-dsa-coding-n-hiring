package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.twopointer;

public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
        int[] height2 = {2,3,4,5,18,17,6};
        System.out.println(maxArea(height2));

    }

    /**
     logic: use two pointer. move only one pointer at a time.
     */
    public static int maxArea(int[] arr) {
       int max = Integer.MIN_VALUE;
       int j = arr.length-1;
       int i = 0;
        while (i < j) {
            int area = Math.min(arr[i], arr[j]) * (j-i);
            if(area > max) {
                max = area;
            }
            if(arr[i] > arr[j]) j--;
            else i++;
        }
        return max;
    }
}
