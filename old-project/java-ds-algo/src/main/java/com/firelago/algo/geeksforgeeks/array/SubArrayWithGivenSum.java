package com.firelago.algo.geeksforgeeks.array;

import java.io.*;
import java.util.*;
import java.math.*;
/**
 * 
 * @author Deepak Kumar
 * @date Mar 30, 2021
 * @problem_link https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1/?track=md-arrays&batchId=144

1
12 5
1 2 3 7 5
 */
public class SubArrayWithGivenSum {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static String[] tokenize() throws IOException {
		return br.readLine().trim().split("\\s+"); // OR, .split(" ");
	}

	public static void main(String args[]) throws Exception {
		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < T; i++) {
			String[] strs = tokenize();
			int S = Integer.parseInt(strs[0]);
			int N = Integer.parseInt(strs[1]);
			int[] a = new int[N];
			strs = tokenize();
			for (int j = 0; j < N; j++) {
				a[j] = Integer.parseInt(strs[j]);
			}
			//System.out.println("T = "+T + ", N = "+N + ", Array = " +Arrays.toString(a));
			System.out.println(subarraySum(a, N, S));
			System.out.println(subarraySum2(a, N, S));
		}
		br.close();

	}
	
	static ArrayList<Integer> subarraySum(final int[] arr, final int n, final int sum) {// 1 2 3 7 5

		// Your code here// sum = 12
		int curr_sum = arr[0];
		int start = 0, i;// start index and endIndex
		// Your code here
		boolean found = false;
		for (i = 1; i <= n; i++) {// i= 0
			while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }
			
			if (curr_sum == sum) {
				found = true;
				break;
			}
			if (i < n)
			curr_sum += arr[i];//14
		}
		if(found)	
			return new ArrayList<>(Arrays.asList(start + 1, i));
		else 
			return new ArrayList<>(Arrays.asList(-1));
	}
	static int subarraySum2(int[] arr, int n, int sum) {// 1 2 3 7 5
		
		int curr_sum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If curr_sum exceeds the sum,
            // then remove the starting elements
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum,
            // then return true
            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println(
                    "Sum found between indexes " + start
                    + " and " + p);
                return 1;
            }

            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }

        System.out.println("No subarray found");
        return 0;
	}

}
