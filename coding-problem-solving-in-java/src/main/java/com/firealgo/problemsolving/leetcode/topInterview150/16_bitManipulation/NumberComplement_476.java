package com.firealgo.problemsolving.leetcode.dailyChallenge;

public class NumberComplement_476 {
    public static void main(String[] args) {
        System.out.println(findComplementUsingXOR(5));
    }
    private static int findComplement(int num) {
        // Convert int to binary String
        String binary = Integer.toBinaryString(num);
        char[] chars = binary.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '1') chars[i] = '0';
            else chars[i] = '1';
        }
        return Integer.parseInt(new String(chars), 2);
    }

    // https://leetcode.com/problems/number-complement/solutions/5671548/100-0-easy-solution-with-explanation/
    public static int findComplementUsingXOR(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();

        int mask = (1 << bitLength) - 1;
        //Note: 1<<1 = 10(=2 in decimal) ; i<<2 = 100(4);i<<3 = 1000(=8)

        return num ^ mask;
    }
}
