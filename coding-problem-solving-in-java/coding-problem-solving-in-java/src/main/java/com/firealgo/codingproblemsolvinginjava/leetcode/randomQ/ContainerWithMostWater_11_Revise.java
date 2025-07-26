package com.firealgo.codingproblemsolvinginjava.leetcode.randomQ;

public class ContainerWithMostWater_11_Revise {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};//49
        int[] arr2 = {1, 1}; //1
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] arr) {
        int maxArea = 0;
        int j = arr.length - 1;
        int i = 0;
        while (i < j) {
            int area;
            if (arr[i] < arr[j]) {
                area = arr[i] * (j - i);
                i++;

            } else {
                area = arr[j] * (j - i);
                j--;
            }
            maxArea = Integer.max(area, maxArea);

        }
        return maxArea;


    }
}
