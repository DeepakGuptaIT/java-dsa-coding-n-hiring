package com.firealgo.problemsolving.chatgpt.twopointer;

import java.util.Arrays;

/**
 Given an array of integers, move all 0s to the end while maintaining the relative order of the non-zero elements.
 Try to do it in-place (no extra array).
 Input:  [0, 1, 0, 3, 12]
 Output: [1, 3, 12, 0, 0]
 Constraints

 Modify the array in place (O(1) extra space)

 Try to do it in O(n) time.
 */
public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveAllZeros(new int[]{0, 1, 0, 3, 12})));
        System.out.println(Arrays.toString(moveAllZeros(new int[]{0, 0})));
        System.out.println(Arrays.toString(moveAllZeros(new int[]{4, 5})));
    }

    private static int[] moveAllZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        for (; j < arr.length; j++) {
            arr[j] = 0;
        }
        return arr;
    }

}
