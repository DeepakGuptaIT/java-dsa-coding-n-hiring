package com.firealgo.problemsolving.arrayAndString.prblems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
 */
public class KidswiththeGreatestNumberFfCandies {
    public static void main(String[] args) throws IOException {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
//        Expected Output: [true,true,true,false,true]
        System.out.println(kidsWithCandies(candies, extraCandies));


    }

    /**
     * Idea:
     * create a new array having each element = candies[i] + extraCandies
     * find the greatest element in original array. Example - int max = 5 (3rd element)
     * compare each element in newArray with max. if it is >= max => it is true
     * Create boolean array are set true and false
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var out = new ArrayList<Boolean>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int candy : candies) {
            int sum = candy + extraCandies;
            if (sum >= max) out.add(true);
            else out.add(false);
        }

        return out;
    }
}
