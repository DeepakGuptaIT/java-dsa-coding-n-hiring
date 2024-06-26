package com.firelago.ds.recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial of 5 = " + factorial(5));
	}

	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}
