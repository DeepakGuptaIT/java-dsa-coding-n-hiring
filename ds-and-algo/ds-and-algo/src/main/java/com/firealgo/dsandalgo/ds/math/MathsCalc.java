package com.firealgo.dsandalgo.ds.math;

public class MathsCalc {

	public static void main(String[] args) {
		System.out.println(findGCD(3,8));

	}
	/**
	 * Utility method to find GCD of two numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	private static int findGCD(int number1, int number2) {
		// base case
		if (number2 == 0) {
			return number1;
		}
		return findGCD(number2, number1 % number2);
	}

}
