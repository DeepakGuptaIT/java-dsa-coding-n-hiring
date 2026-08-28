package com.firealgo.problemsolving.math.practice;

public class SumOfDigits2 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // gives unit digit
            num = num /10;
        }
        return sum;
    }
}
