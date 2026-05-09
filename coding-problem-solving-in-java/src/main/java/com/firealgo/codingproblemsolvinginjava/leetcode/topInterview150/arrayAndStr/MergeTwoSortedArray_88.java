package com.firealgo.codingproblemsolvinginjava.leetcode.topInterview150.arrayAndStr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Merge Two Array
//  https://leetcode.com/problems/merge-sorted-array/

public class MergeTwoSortedArray_88 {
    public static void main(String[] args) {

        int[] nums1 = {1, 5, 0, 0, 0};
        merge(nums1, 2, new int[]{2,4,6},3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;       // pointer for nums1's valid part
        int j = n - 1;       // pointer for nums2
        int k = m + n - 1;   // pointer for final position in nums1

        // merge from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // if nums2 still has remaining elements
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        // if nums1 still has elements, they are already in correct place
    }

    public static void mergeV1(int[] nums1, int m, int[] nums2, int n) {
        int min = Math.min(m, n);
        List<Integer> res = new ArrayList<>(m+n);
        int i = 0, j = 0;
        while (i < min || j < min) {
            if(i < min && nums1[i] < nums2[j]) {
                res.add(nums1[i]);
                i++;
            } else if(j < min) {
                res.add(nums2[j]);
                j++;
            }
        }
        if(m > n) {
            for (int k = i; k < m; k++) {
                res.add(nums1[k]);
            }
        } else if(m < n) {
            for (int k = j; k < n; k++) {
                res.add(nums1[k]);
            }
        }
        System.out.println(res);
    }
}