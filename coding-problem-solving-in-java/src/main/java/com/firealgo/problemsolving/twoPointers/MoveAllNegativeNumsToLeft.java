package com.firealgo.problemsolving.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Problem:
 Rearrange the array so that all negative numbers come before all positive numbers,
 while keeping their relative order unchanged.
 Input:  [3, -2, -1, 5, -4, 7, 2]
 Output: [-2, -1, -4, 3, 5, 7, 2]
 Constraints:

 Do it in-place (no extra array)

 O(n) time, O(1) space

 Maintain the original order (i.e., don’t just swap randomly)
 */
public class MoveAllNegativeNumsToLeft {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveAllNegativeNumsToLeft2(new int[]{3, -2, -1, 5, -4, 7, 2})));
    }

    private static int[] moveAllNegativeNumsToLeft(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }

    private static int[] moveAllNegativeNumsToLeft2(int[] arr) {
        List<Integer> negList = new ArrayList<>();
        List<Integer> posList = new ArrayList<>();
        for (int j : arr) {
            if (j < 0) negList.add(j);
            else posList.add(j);
        }
        negList.addAll(posList);

        return negList.stream().mapToInt(i -> i).toArray();
    }
}
