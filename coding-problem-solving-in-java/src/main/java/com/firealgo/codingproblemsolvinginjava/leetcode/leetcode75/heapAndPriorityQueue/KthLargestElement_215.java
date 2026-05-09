package com.firealgo.codingproblemsolvinginjava.leetcode.leetcode75.heapAndPriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement_215 {
    public static void main(String[] args) {
        int[] arr = {6,5,3,3,3,6};//{3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("The " + k + "th largest element is: " + findKthLargestUsingHeap(arr, k));
        System.out.println("The " + k + "th largest element is: " + findKthLargestUsingSorting(arr, k));
    }

    public static int findKthLargestUsingSorting(int[] nums, int k) {
        Arrays.parallelSort(nums);
        return nums[nums.length- k];
    }

    public static int findKthLargestUsingHeap(int[] nums, int k) {
        // Min heap to store the K largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);

            // If heap size exceeds K, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        // The root of the heap is the Kth largest element
        return minHeap.peek();
    }
}
