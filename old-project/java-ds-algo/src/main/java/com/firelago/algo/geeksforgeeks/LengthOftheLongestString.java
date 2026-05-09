package com.firelago.algo.geeksforgeeks;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.math.*;

/**
 * 
 * @author Deepak Kumar
 * @date Mar 20, 2021
 * @problem_link
 1
 geeksforgeeks
 */
public class LengthOftheLongestString {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static String[] tokenize() throws IOException {
		return br.readLine().trim().split("\\s+"); // OR, .split(" ");
	}

	public static void main(String args[]) throws Exception {
		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < T; i++) {
			String S = br.readLine().trim();
			System.out.println(longestUniqueSubsttr(S));
		}
		br.close();

	}
	// geeksforgeeks
	private static int longestUniqueSubsttr(String S) {
		// TODO Auto-generated method stub
		if(S.length() == 0 || S.length() == 1) {
			return S.length();
		}
		char[] chA = S.toCharArray();
		List<Character> list = new ArrayList<>();
		char prev = chA[0];
		HashMap<String,Integer> map = new HashMap<>();
		list.add(prev);
		boolean flag = false;
		for ( int i = 1; i< chA.length; i++) {
			char c = chA[i];
			if( c != prev) {
				list.add(c);
			} else {
				map.put(list.toString(), list.size());
				list.clear();
				list.add(c);
				flag = true;
			}
			prev = c;
		}
		if(!flag) {
			return S.length();
		}
		
		final int maxLength = map.values().stream().mapToInt(e -> e).max().getAsInt();
		/*
		 * TreeSet<String> names = map.entrySet().stream().filter(e ->
		 * e.getValue().longValue() == maxLength).map(Map.Entry::getKey)
		 * .collect(Collectors.toCollection(TreeSet::new)); StringBuilder sb = new
		 * StringBuilder(); for(Character c : list) { sb.append(c); }
		 */
		return maxLength;
	}

}
