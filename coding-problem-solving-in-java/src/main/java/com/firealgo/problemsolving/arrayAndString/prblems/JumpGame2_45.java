package com.firealgo.problemsolving.arrayAndString.prblems;

public class JumpGame2_45 {
    public static void main(String[] args) {
//        System.out.println(canJump(
//                new int[]{2, 3, 1, 1, 4}
//        )); // true
//        System.out.println(canJump(
//                new int[]{0}
//        )); // 0
        System.out.println(canJump(
                new int[]{1,2,1,1,1}
        )); // 0
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
    public static int canJumpOld(int[] nums) {
        int count = 0;
        int maxReach = 0;
        if (nums.length < 2) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return -1;      // can't reach this index
            maxReach = Math.max(maxReach, i + nums[i]);
            count++;
            if (maxReach >= nums.length - 1) return count; // can reach the end

        }
        return count;
    }

    public static int canJump(int[] nums) {
        if (nums.length < 2) return 0;

        int jumps = 0;
        int maxReach = 0;
        int endOfCurrentJump = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);

            // When we reach the end of current jump, we must jump
            if (i == endOfCurrentJump) {
                jumps++;
                endOfCurrentJump = maxReach;
            }
        }

        return jumps;
    }

}
