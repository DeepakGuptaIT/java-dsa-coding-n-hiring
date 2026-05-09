package com.firelago.algo.geeksforgeeks.array;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.math.*;

/**
 * 
 * @author Deepak Kumar
 * @date Mar 21, 2021
 * @problem_link https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
 * Input :
 2
 9
 3 3 4 2 4 4 2 4 4
 4
 1 2 4 6
 * 
 * 
 */
public class MajorityElement {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static String[] tokenize() throws IOException {
		return br.readLine().trim().split("\\s+"); // OR, .split(" ");
	}

	public static void main(String args[]) throws Exception {
		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine().trim());
			int[] a = new int[N];
			String[] strs = tokenize();
			for (int j = 0; j < N; j++) {
				a[j] = Integer.parseInt(strs[j]);
			}
			//System.out.println("T = "+T + ", N = "+N + ", Array = " +Arrays.toString(a));
			int majorityEl = majorityElement(a, N);
			System.out.println(majorityEl == -1 ? "No Majority Element": majorityEl);
		}
		br.close();

	}

	private static int majorityElement(int[] a, int n) {
		final int MIN_COUNT = n/2;
		Map<Integer, Long> map = new HashMap<>();
		map = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
		Optional<Map.Entry<Integer,Long>> v = map.entrySet().stream().filter(e -> e.getValue() >= MIN_COUNT).findFirst();
		if(v.isPresent())
			return v.get().getKey();
		else return -1;
	}

}
