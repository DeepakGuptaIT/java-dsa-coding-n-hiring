package com.firealgo.problemsolving.leetcode.topInterview150.arrayAndStr;

import java.util.Arrays;
import java.util.Comparator;

public class HIndex_274 {
    public static void main(String[] args) {
        System.out.println(hIndexV2(new int[]{3, 0, 6, 1, 5}));
    }

    /**
     Approach:
     sort the array in desc order
     */
    public static int hIndex(int[] citations) {
        int[] nums = Arrays.stream(citations).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] < i+1)) {
                return i;
            }
        }
        return nums.length;

    }


    public static int hIndexV2(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];

        // Count how many papers have i citations
        for (int c : citations) {
            if (c >= n) count[n]++;
            else count[c]++;
        }

        int papers = 0;
        // Traverse from high to low
        for (int i = n; i >= 0; i--) {
            papers += count[i];
            if (papers >= i) {
                return i;
            }
        }
        return 0;
    }

}
