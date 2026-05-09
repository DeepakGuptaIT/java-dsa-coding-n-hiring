package com.firealgo.codingproblemsolvinginjava.leetcode.topInterview150.arrayAndStr;

public class JumpGame_55 {
    public static void main(String[] args) {
        System.out.println(canJump(
                new int[]{2, 3, 1, 1, 4}
        )); // true
        System.out.println(canJump(
                new int[]{3, 2, 1, 0, 4}
        )); // false
    }

    /**
     * 3. Greedy Approach (Optimal)
     * <p>
     * Core Idea:
     * Keep track of the farthest index you can reach at any point while scanning the array.
     * <p>
     * Initialize farthest = 0
     * <p>
     * For each index i,
     * <p>
     * if i > farthest → you can’t move further ⇒ return false
     * <p>
     * otherwise, update farthest = max(farthest, i + nums[i])
     * <p>
     * If you finish the loop, it means you can reach the end.
     * <p>
     * Time complexity: O(n)
     * <p>
     * Space complexity: O(1)
     * ✅ This is the optimal approach.
     */
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false;      // can't reach this index
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) return true; // can reach the end
        }
        return false;
    }

}
