package com.firealgo.hiringchallengejava.hackerearth.barklays_fullstack_0622;

public class FindComplexyty02 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int k = 3;
		int result = findNoInArray(a, k);
		System.out.println(result);
		// Complexity = log(N); as it is binarySearchAlgorithm
	}

	/**
	 * return the index of the element found else return -1
	 * 
	 * @param a
	 * @param k
	 * @return
	 */
	private static int findNoInArray(int[] a, int k) {
		// TODO Auto-generated method stub
		int l = 0;
		int h = a.length - 1;
		while (l <= h) {
			int mid = l + h >> 1;
			if (a[mid] == k) {
				return mid;
			}
			if (a[mid] > k)
				l = mid + 1;
			else
				h = mid - 1;
		}
		return -1;

	}

}
