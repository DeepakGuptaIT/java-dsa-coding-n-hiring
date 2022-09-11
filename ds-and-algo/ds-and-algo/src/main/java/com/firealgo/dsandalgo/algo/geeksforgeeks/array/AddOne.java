package com.firealgo.dsandalgo.algo.geeksforgeeks.array;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.math.*;

/**
 * 
 * @author Deepak Kumar
 * @date Mar 28, 2021
 * @problem_link https://practice.geeksforgeeks.org/problems/plus-one/1/
 */
public class AddOne {

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
			List<Integer> arr = Arrays.stream(a).boxed().collect(Collectors.toList());
			increment(arr, N);
		}
		br.close();

	}
	
	static List<Integer> increment(List<Integer> arr , int N) {
        // code here
		String str = arr.stream().map(e -> e+"").collect(Collectors.joining());
		int value = Integer.parseInt(str) + 1;
		str = String.valueOf(value);
		char[] ch = str.toCharArray();
//		ArrayList<Integer> result = str.chars().boxed().collect(Collectors.toCollection(ArrayList::new));
//		List<Integer> result = Arrays.stream(ch).boxed().collect(Collectors.toList());
		System.out.println(Arrays.toString(ch));
		return arr;
		
        
    }
	

}
