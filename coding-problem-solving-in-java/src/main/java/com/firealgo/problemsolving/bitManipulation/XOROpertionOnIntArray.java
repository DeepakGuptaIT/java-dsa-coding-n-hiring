package com.firealgo.problemsolving.bitManipulation;

public class XOROpertionOnIntArray {
    public static void main(String[] args) {
        int[] arr = {7, 16, 8};
        int res = minXorOpToMakeEachElementZero(arr);
        System.out.println(res);
        System.out.println(Integer.toBinaryString(15));
        System.out.println(Integer.highestOneBit(6));
//        System.out.println(5 << 2);

    }


    private static int minXorOpToMakeEachElementZero2(int[] arr) {
        int count = 0;
        for (int e : arr) {
            count += Integer.bitCount(e);
        }
        return count;
//        int opCount = 0;
//        int ones = Integer.bitCount(num);
//        System.out.println(ones);
//        return ones;
    }

    private static int minXorOpToMakeEachElementZero(int[] arr) {
        int count = 0;
        for (int e : arr) {
            count += min_orerations_to_zero(e);
        }
        return count;
    }

    private static int min_orerations_to_zero(int num) {
        // To make a number zero , I can simply count the number of 1s in a number
        int operations = 0;
        while (num > 0) {
//            Find highest power of 2 less than or equal to zero
            int y = 1;
            while (y <= num) {
                y = y << 1;
            }
            y = y >> 1;
            // XOR num with y
            num = num ^ y;
            operations++;

        }
        return operations;
    }
}
