package com.firealgo.dsandalgo.algo.geeksforgeeks.array;

import java.io.*;
import java.util.*;
import java.math.*;

//https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1
/*
2
5
1 2 3 4 5 
6
1 2 3 4 5 6


*/
public class WaveArray {

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
				a[j] = Integer.parseInt(strs[j]);// 1,2,3,4,5
			}
			int[] r = new int[N];
			//System.out.println("T = "+T + ", N = "+N + ", Array = " +Arrays.toString(a));
			for(int x=0,y=1;x< N;x= x+2,y= y+2) {// x=4 , y=5
				if(y<N) {
					r[x]=a[y];//4
					r[y] = a[x];//3
					
				} else {
					r[x] = a[x];
				}
				
			}//r = 2, 1, 4, 3, 
			System.out.println(Arrays.toString(r));
		}
		br.close();

	}
	

}
