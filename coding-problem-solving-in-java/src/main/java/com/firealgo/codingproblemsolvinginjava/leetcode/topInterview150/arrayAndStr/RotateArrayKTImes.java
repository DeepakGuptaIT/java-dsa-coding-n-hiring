package com.firealgo.codingproblemsolvinginjava.leetcode.topInterview150.arrayAndStr;

import java.util.Arrays;

public class RotateArrayKTImes {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 3. **In-place with reversal algorithm** — this is the optimal one.
     * - First, normalize `k = k % n` (because rotating by n or multiples of n brings you back to original). :contentReference[oaicite:5]{index=5}
     * - Then:
     * 1. Reverse the entire array.
     * 2. Reverse the first k elements.
     * 3. Reverse the remaining n − k elements.
     * - Time: O(n); Space: O(1). :contentReference[oaicite:6]{index=6}
     */
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // step 1 - reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }

//        System.out.println(Arrays.toString(nums));
        // step 2 - reverse the first K elements
        for (int i = 0; i < k / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[k - i - 1];
            nums[k - i - 1] = temp;
        }
//        System.out.println(Arrays.toString(nums));
        // step 3 - Reverse the remaining n − k elements.
        int start = k, end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
