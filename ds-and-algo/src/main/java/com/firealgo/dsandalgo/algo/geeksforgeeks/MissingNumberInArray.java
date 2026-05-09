package com.firealgo.dsandalgo.algo.geeksforgeeks;

import java.io.*;
import java.util.*;
import java.math.*;

public class MissingNumberInArray {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static String[] tokenize() throws IOException {
		return br.readLine().trim().split("\\s+"); // OR, .split(" ");
	}
	
	

	public static void main(String args[]) throws Exception {
		long startTime = System.nanoTime();
		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine().trim());
			int[] a = new int[N-1];
			String[] strs = tokenize();
			for (int j = 0; j < N-1; j++) {
				a[j] = Integer.parseInt(strs[j]);
			}
			//System.out.println("T = "+T + ", N = "+N + ", Array = " +Arrays.toString(a));
			int missingNo = findMissingNumber(N, a);
			System.out.println(missingNo);
		}
		br.close();
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; 
		System.out.println("Execution Time(ms): "+duration);

	}

	private static int findMissingNumber(int n, int[] a) {
		int expectedSum = n*(n+1)/2;
		int arraySum = Arrays.stream(a).sum();
		
		return expectedSum - arraySum;
	}
	

	

}
