package com.firealgo.dsandalgo.algo.geeksforgeeks.greedy;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.math.*;
/*
 1
 5 12
 */
/**
 * 
 * @author Deepak Kumar
 * @date Mar 28, 2021
 * @problem_link https://practice.geeksforgeeks.org/problems/largest-number-with-given-sum-1587115620/1
 */
public class LargestNumberWithGivenSum {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static String[] tokenize() throws IOException {
		return br.readLine().trim().split("\\s+"); // OR, .split(" ");
	}

	public static void main(String args[]) throws Exception {
		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < T; i++) {
			String[] strs = tokenize();
			int N = Integer.parseInt(strs[0]);
			int S = Integer.parseInt(strs[1]);
			
			//System.out.println("T = "+T + ", N = "+N + ", Array = " +Arrays.toString(a));
			System.out.println(largestNumber(N, S));
		}
		br.close();

	}

	private static String largestNumber(int n, int s) {//n =5 , s= 12
		int[] r = new int[n];
		int sum = s>=9? 9: s;//9
		r[0] = sum;
		for(int i=1;i< n;i++) {
			int rem = s - sum;
			if(rem > 0) {
				if(rem >=9) {
					r[i] = 9;
				} else {
					r[i]=rem;
				}
				sum = sum + r[i];
				
			} else {
				break;
			}
		}
		if(sum != s) {
			return "-1";
		}
		String res = Arrays.stream(r).boxed().map(e -> String.valueOf(e)).collect(Collectors.joining());
		return res;
		
		
		
	}

}
