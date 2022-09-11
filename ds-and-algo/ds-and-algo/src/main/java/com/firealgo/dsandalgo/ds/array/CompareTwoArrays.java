package com.firealgo.dsandalgo.ds.array;

import java.util.Arrays;
//Emp {name, sal};
//List<Emp> eList;
//
//OUTPUT : Set of empName where sal > 5000
public class CompareTwoArrays {

	public static void main(String[] args) {
		// 1. test two arrays are equal
		int a[] = { 7, 8, 5 };
		int b[] = { 7, 8, 5 };
		String str = String.valueOf(a);
		String str2 = String.valueOf(b );
		System.out.println(a);
		if(str.equals(str2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		
//		int[] arr4 = new int[5];
//		isEqualArrays(arr1, arr2);
//		System.out.println(equals(arr1, arr2));
//
//		// 2. test two array contains equal elements
//		int a[] = { 1, 1, 3, 4, 5 };
//		int a2[] = { 5, 4, 3, 1, 1 };
//		System.out.println("Have equal contents ? => " + contentsEqual(a, a2));
//		char a4[] = { 'H','e','l','l','o' };
//		char a5[] = { 'e','H','l','l','o' };
//		System.out.println("Have equal chars ? => " + equalContentsChar(a4, a5));

	}

	private static void isEqualArrays(int[] arr1, int[] arr2) {
//		int arr1[] = {1, 2, 3};
//        int arr2[] = {1, 2, 3};
		if (Arrays.equals(arr1, arr2)) // Same as arr1.equals(arr2)
			System.out.println("Same");
		else
			System.out.println("Not same");
	}

	public static boolean equals(int[] a, int[] a2) {
		if (a == a2)
			return true;
		if (a == null || a2 == null)
			return false;

		int length = a.length;
		if (a2.length != length)
			return false;

		for (int i = 0; i < length; i++) {
			if (a[i] != a2[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean contentsEqual(int[] a, int[] a2) {
		if (a == a2)
			return true;
		if (a == null || a2 == null)
			return false;

		int length = a.length;
		if (a2.length != length)
			return false;

		Arrays.sort(a);
		Arrays.sort(a2);
		for (int i = 0; i < length; i++) {
			if (a[i] != a2[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean equalContentsChar(char[] a, char[] a2) {
		if (a == a2)
			return true;
		if (a == null || a2 == null)
			return false;

		int length = a.length;
		if (a2.length != length)
			return false;

		Arrays.sort(a);
		Arrays.sort(a2);
		for (int i = 0; i < length; i++) {
			if (a[i] != a2[i]) {
				return false;
			}
		}
		return true;
	}

}
