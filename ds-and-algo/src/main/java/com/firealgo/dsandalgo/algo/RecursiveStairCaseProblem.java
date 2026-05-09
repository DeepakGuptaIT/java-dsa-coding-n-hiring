package com.firealgo.dsandalgo.algo;

/**
 * https://www.geeksforgeeks.org/count-ways-reach-nth-stair/
 * @author uvdee
 * below video is best explained -
 * https://www.youtube.com/watch?v=5o-kdjv7FD0&t=688s&ab_channel=CSDojo
 *
 */
public class RecursiveStairCaseProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int steps = 4;
		int count = countWays(steps);
		System.out.println(count);
		

	}

	private static int countWays(int s) {
		// 1. recursive approach .O(n) = 2^n. which is not good.
//		return fib(s);
		// 2. dynamicProgramming
		return dynamicPrgamming(s);
	}

	private static int dynamicPrgamming(int n) {
		if(n ==0 || n ==1) return 1;
		
		int[] arr = new int[n+1];
		arr[0] = 1; arr[1] = 1;
		for(int i =2; i<n+1; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[n];
	}

	private static int fib(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}

}
