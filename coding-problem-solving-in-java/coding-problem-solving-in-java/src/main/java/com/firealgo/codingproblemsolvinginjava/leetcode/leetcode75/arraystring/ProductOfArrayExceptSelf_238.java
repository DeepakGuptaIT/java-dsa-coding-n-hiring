package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.arraystring;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        //Expected: [24,12,8,6]
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        int[] nums2 ={-1,1,0,-3,3}; //
        //Expected: [0,0,9,0,0]
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int pro = 1;
        int zeros = 0;
        for (int i : nums) {
             if(i != 0) pro *= i;
             else zeros++;
        }

        for (int i = 0; i < n; i++) {
            if(zeros > 0) {
                if(nums[i] != 0) ans[i] = 0;
                else if (zeros == nums.length) {
                    ans[i] = 0;
                } else ans[i] = pro;
            } else {
                ans[i] = pro / nums[i];
            }
        }
        return ans;
    }

    public static int[] productExceptSelfUsingPrefixAndSpaceOptimise(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }

    public static int[] productExceptSelfUsingPrefixAndSuffix(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }

    public static int[] productExceptSelfBrutForce(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product = product * nums[j];
                }
            }
            res[i] = product;
        }
        return res;
    }
}
