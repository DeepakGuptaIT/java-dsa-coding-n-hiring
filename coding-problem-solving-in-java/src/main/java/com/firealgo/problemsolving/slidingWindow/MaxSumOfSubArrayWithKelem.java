package com.firealgo.problemsolving.slidingWindow;

//import static com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.slidingwindow.MaximumSumOfSubArrayOfSizeK.maxSum;


//https://www.geeksforgeeks.org/dsa/window-sliding-technique/
public class MaxSumOfSubArrayWithKelem {
    public static void main(String[] args){
        int arr[] = {5, 2, -1, 0, 3};
        int arr2[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum2(arr2, n, k));
    }

    private static int maxSum2(int[] arr, int n, int k) {
        // find the sum of first window
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        // remaining window
        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
