package com.firealgo.problemsolving.leetcode.leetcode75.arraystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
 *
 */
public class KidsWiththeGreatestNumberOfCandies_1431 {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies((new int[]{2,3,5,1,3}), 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // first find the max number in given array
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> res = new ArrayList<>(candies.length);
        for(int i: candies) {
            if(i + extraCandies >= max) res.add(true);
            else res.add(false);
        }
        return res;
    }
}
