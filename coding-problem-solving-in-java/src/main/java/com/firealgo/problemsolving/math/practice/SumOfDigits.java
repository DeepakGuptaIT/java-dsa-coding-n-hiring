package com.firealgo.problemsolving.math.practice;

/**
 * Problem: Sum of Digits
 * <p>
 * Given an integer, calculate the sum of all its digits.
 * <p>
 * Example:
 * Input:  12345
 * Output: 15
 * <p>
 * Explanation:
 * 1 + 2 + 3 + 4 + 5 = 15
 */
public class SumOfDigits {

    public static void main(String[] args) {

        int number = 1729;

        int result = sumOfDigits(number);

        System.out.println("Sum of digits: " + result);
        System.out.println("Is Magic Number: " + isMagicNumber2(number));
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }

        return sum;
    }
    private static boolean isMagicNumber(int number) {
        int sum = sumOfDigits(number);
        while (sum > 9) {
            sum = sumOfDigits(sum);
        }
        return sum == 1;
    }
    private static boolean isMagicNumber2(int number) {
        if(number == 1) return true;
        if(number <= 9) return false;
        int sum = sumOfDigits(number);
        return isMagicNumber2(sum);
    }


}