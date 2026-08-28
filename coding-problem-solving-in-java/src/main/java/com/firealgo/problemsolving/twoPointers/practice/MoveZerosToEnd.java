package com.firealgo.problemsolving.twoPointers.practice;

/**
 * Pattern: Two Pointer Pattern — Same Direction
 *
 * Problem: Move Zeros to End
 *
 * Given an integer array, move all 0s to the end of the array
 * while maintaining the relative order of non-zero elements.
 *
 * The solution must be done in-place without creating another array.
 *
 * Example:
 * Input:  {0, 1, 0, 3, 12}
 * Output: {1, 3, 12, 0, 0}
 *
 * Explanation:
 * The relative order of non-zero elements (1, 3, 12) is preserved.
 */
public class MoveZerosToEnd {
    private static void moveZeros(int[] arr) {
       int j=0;
       // move all non zeros to front
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0) {
                arr[j++] = arr[i];
            }
        }
        // fill zeros at remaining position
        while (j < arr.length) {
            arr[j++] = 0;

        }

    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


}