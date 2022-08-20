package com.firealgo.codingproblemsolvinginjava.hackerEarthPractise;

import java.util.Arrays;

/**
 * https://www.hackerearth.com/practice/interviews/code-explained?utm_source=new_practice
 * @author deepak
 * {@link https://youtu.be/V_RwZc-c6hs}
 * Problem statement - 
 * Given an array of zeros, ones and twos. 
 * Output - sort the array inplace.
 * Try to solve in O(n)
 */
public class ShortItUp {

	public static void main(String[] args) {
		// input1: {};
		// input1: {0};
		// input1: {0,1,2,0,2};
		int[] arr = {0,1,2,0,2};
		arr = sortArray(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		
	}

	private static int[] sortArray(int[] arr, int n) {
		int l_bound = 0;
		int r_bound = n-1;
		for(int i=0; i<= r_bound;) {
			if(arr[i] ==2) {
				arr[i] = arr[r_bound];
				arr[r_bound] =2;
				r_bound -=1;
			} else if(arr[i] ==1) {
				i++;
			} else {
				arr[i] = arr[l_bound];
				arr[l_bound] = 0;
				l_bound ++;
				i++;
			}
			
			
		}
		
		return arr;
	}

}
 