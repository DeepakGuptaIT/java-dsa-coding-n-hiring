package com.firealgo.codingproblemsolvinginjava.mphasisUK;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicatesInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Integer[] arr = { 1, 2, 3, 4, 5, 4 };
//		findDuplicates(arr);
//		boolean flag = isDuplicate(arr);
//		char[] chArr = "Deepak".toCharArray();
//		flag = isDuplicateChar("Depak".toCharArray());
//		System.out.println(flag);
		int count = countDuplicateCharsInString("Deepak Kumar");
		System.out.println("number of duplicate chars => "+count);

	}

// count number of chars which are duplicate in given string.
	private static int countDuplicateCharsInString(String string) {
		int count = 0;
		if (string.isBlank()) {
			return 0;
		}
		char[] arr = string.toCharArray();
		var map = new HashMap<Character, Integer>();
		for (char c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		count = (int) map.entrySet().stream().filter(e-> e.getValue()>1).peek(System.out::println).count();
		
		return count;

	}

	private static void findDuplicates(Integer[] arr) {
		// TODO Auto-generated method stub
		var map = new HashMap<Integer, Integer>();
		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println(map);

	}

	// Java 8 stream
	public static <T> boolean isDuplicate(final T[] values) {
		return Arrays.stream(values).distinct().count() != values.length;
	}

	public static boolean isDuplicateChar(final char[] arr) {
//		  return Arrays.stream(values).distinct().count() != values.length;
		Stream<Character> cStream = IntStream.range(0, arr.length).mapToObj(i -> arr[i]);
		return cStream.distinct().count() != arr.length;
	}

	// TreeSet will remove the duplicated values
	public static <T> boolean isDuplicateUsingTree(final T[] values) {

		TreeSet set = new TreeSet<T>(Arrays.asList(values));
		if (set.size() != values.length) {
			return true;
		} else {
			return false;
		}

	}

}
