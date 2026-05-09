package com.firealgo.dsandalgo.algo.geeksforgeeks;

import java.io.*;
import java.util.*;
import java.math.*;

/**
 * 
 * @author Deepak Kumar
 * @date Mar 20, 2021
 * @problem_link https://practice.geeksforgeeks.org/problems/key-pair5616/1
 * 
 *               Question: Given an array Arr of N positive integers and another
 *               number X. Determine whether or not there exist two elements in
 *               Arr whose sum is exactly X.
 * @Sample Input
 2
 5
 4
 1 2 5 6 7
Test case 2 : 
1
6
24
12 3 4 1 6 9
 */
public class KeyPair {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static String[] tokenize() throws IOException {
		return br.readLine().trim().split("\\s+"); // OR, .split(" ");
	}

	public static void main(String args[]) throws Exception {
		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine().trim());
			int x = Integer.parseInt(br.readLine().trim());
			int[] a = new int[N];
			String[] strs = tokenize();
			for (int j = 0; j < N; j++) {
				a[j] = Integer.parseInt(strs[j]);
			}
			// System.out.println("T = "+T + ", N = "+N + ", Array = " +Arrays.toString(a));
			boolean ans = hasArrayThreeCandidates(a, N, x);
			System.out.println(ans ? "Yes" : "No");
		}
		br.close();

	}

	private static boolean hasArrayTwoCandidates(int[] a, int n, int x) {
		int l = 0, r = n - 1;
		Arrays.sort(a);
		/*
		 * for (int i = 0; i < n; i++) { if (sum == x) { return true; } else if(l < r) {
		 * 
		 * if (sum > x) { --r; } else { ++l; } if(l < r) { sum = a[l] + a[r]; } } else {
		 * return false; } }
		 */
		while (l < r) {
			if(a[l] + a[r] == x) return true;
			else if(a[l] + a[r] > x)
				--r;
			else ++l;
		}
		return false;
	}
	//https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1 
	// Find 3 numbers in the array whose sum is equal to x. return true or false.
	private static boolean hasArrayThreeCandidates(int[] a, int n, int x) {
		int l, r;
		Arrays.sort(a);
		/* Now fix the first element one by one and find the
        other two elements */
		for(int i = 0; i< n-2; i++) {
			l=i+1;
			r = n -1;
			while (l < r) {
				if(a[i] + a[l] + a[r] == x) return true;
				else if(a[i] + a[l] + a[r] > x)
					--r;
				else ++l;
			}
			
		}
		// If we reach here, then no triplet was found
		return false;
	}

}
