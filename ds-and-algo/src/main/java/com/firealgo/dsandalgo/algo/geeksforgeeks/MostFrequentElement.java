package com.firealgo.dsandalgo.algo.geeksforgeeks;

import java.io.*;
import java.util.*;
//import java.util.stream.Collectors;
import java.math.*;

/**
 * 
 * @author Deepak Kumar
 * @date Mar 20, 2021
 * @problem_link
 * @Sample Input
 1
 8
 3
 3 3 9 9  4 4 4 11
 1 1 3 4 5 6
  1 1 1 2 2 3
 */
public class MostFrequentElement {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static String[] tokenize() throws IOException {
		return br.readLine().trim().split("\\s+"); // OR, .split(" ");
	}

	public static void main(String args[]) throws Exception {
		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine().trim());
			int K = Integer.parseInt(br.readLine().trim());
			String[] strs = tokenize();
			int[] a = new int[strs.length];
			N = strs.length;
			for (int j = 0; j < N; j++) {
				a[j] = Integer.parseInt(strs[j]);
			}
			//System.out.println("T = "+T + ", N = "+N + ", Array = " +Arrays.toString(a));
			int[] ans = topK(a, K);
			
		}
		br.close();

	}

	private static int[] topK(int[] a, int k) {
		// TODO Auto-generated method stub
		int[] res = new int[k];
//		int n = a.length;
		Map<Integer, Long> map = Arrays.stream(a).boxed().collect(java.util.stream.Collectors.groupingBy(e -> e, HashMap::new, java.util.stream.Collectors.counting()));
		//{1=3, 2=2, 3=1}
		
		List<Map.Entry<Integer, Long>> list = new ArrayList<>( map.entrySet());
//		sort the list
		
		list.sort((o1, o2) -> {
			if(o1.getValue() == o2.getValue()) {
				return o2.getKey() - o1.getKey();
			} else {
				return (int) (o2.getValue() - o1.getValue());
			}
		});
		for (int i = 0; i < k; i++) {
			
			System.out.println(list.get(i).getKey());
			res[i] = list.get(i).getKey();
		}
		
		return res;
	}

}
