package com.firelago.algo.geeksforgeeks.greedy;

import java.io.*;
import java.util.*;
import java.math.*;

/**
 * 
 * @author Deepak Kumar
 * @date Mar 28, 2021
 * @problem_link
 * 
 *               Input - 1 2 4 1 5 8 10 Output = 5
 */
public class MinimizeTheHeight {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static String[] tokenize() throws IOException {
		return br.readLine().trim().split("\\s+"); // OR, .split(" ");
	}

	public static void main(String args[]) throws Exception {
		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < T; i++) {
			String[] strs = tokenize();
			int K = Integer.parseInt(strs[0]);
			int N = Integer.parseInt(strs[1]);
			strs = tokenize();
			int[] a = new int[N];
			for (int j = 0; j < N; j++) {
				a[j] = Integer.parseInt(strs[j]);
			}
			int res = getMinDiff(a, N, K);
			System.out.println(res);
			// System.out.println("T = "+T + ", N = "+N + ", Array = " +Arrays.toString(a));
		}
		br.close();

	}

	private static int getMinDiff(int[] a, int n, int k) {// [1, 5, 8, 10]
		int avg = (int) Arrays.stream(a).average().getAsDouble();// 6
		int min = 0, max = 0;
		for (int i = 0; i < n; i++) {
			int val = a[i];// a = 3, 7, 6, 8
			if (val < avg && (avg - val) > k) {
				a[i] = val + k;
			} else if (val > avg && (val - avg) > k) {
				a[i] = val - k;
			}
			val = a[i];
			if (i == 0) {
				min = val;
				max = val;
			}
			if (min > val) {
				min = val;
			}
			if (max < val) {
				max = val;
			}
		}

		return max - min;
	}

	

}
