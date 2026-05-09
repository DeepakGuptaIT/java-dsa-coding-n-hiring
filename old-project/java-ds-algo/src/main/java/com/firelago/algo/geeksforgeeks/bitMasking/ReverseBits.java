package com.firelago.algo.geeksforgeeks.bitMasking;

import java.io.*;
import java.util.*;
import java.math.*;

public class ReverseBits {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static String[] tokenize() throws IOException {
		return br.readLine().trim().split("\\s+"); // OR, .split(" ");
	}

	public static void main(String args[]) throws Exception {
		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine().trim());
//			System.out.println(reverseBits(N));
			System.out.println(numberOfSetBits(N));
			//System.out.println("T = "+T + ", N = "+N + ", Array = " +Arrays.toString(a));
		}
		br.close();

	}

	private static int reverseBits(int N) {
		// TODO Auto-generated method stub
		String s = Integer.toBinaryString(N);
//		StringBuilder sb = new StringBuilder(s);
//		sb.reverse();
		int res = Integer.parseInt(new StringBuilder(s).reverse().toString(), 2);
		return res;
	}
	private static int numberOfSetBits(int N) {
		String s = Integer.toBinaryString(N);
		s = s.replaceAll("0", "");
		return s.length();
	}

}
