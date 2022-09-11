package com.firealgo.dsandalgo.algo.geeksforgeeks;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.math.*;

public class ListIntersection {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static String[] tokenize() throws IOException {
		return br.readLine().trim().split("\\s+"); // OR, .split(" ");
	}

	public static void main(String args[]) throws Exception {
		int[] a = {4,4};
		int[] b = {1,2,4, 3, 5, 6};
		Set<Integer> set1 = Arrays.stream(a).boxed().collect(java.util.stream.Collectors.toSet());
		Set<Integer> set2 = Arrays.stream(b).boxed().collect(java.util.stream.Collectors.toSet());
		Set<Integer> intersect = set1.stream()
                .filter(set2::contains)
                .collect(java.util.stream.Collectors.toSet());
		set1.retainAll(set2);
		System.out.println(set1.size());
//		int T = Integer.parseInt(br.readLine().trim());
//		for (int i = 0; i < T; i++) {
//			int N = Integer.parseInt(br.readLine().trim());
//			int[] a = new int[N];
//			String[] strs = tokenize();
//			for (int j = 0; j < N; j++) {
//				a[j] = Integer.parseInt(strs[j]);
//			}
//			//System.out.println("T = "+T + ", N = "+N + ", Array = " +Arrays.toString(a));
//		}
		br.close();

	}

}
