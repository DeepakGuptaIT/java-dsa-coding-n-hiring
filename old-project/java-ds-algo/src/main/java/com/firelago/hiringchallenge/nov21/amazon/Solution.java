package com.firelago.hiringchallenge.nov21.amazon;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'searchSuggestions' function below.
	 *
	 * The function is expected to return a 2D_STRING_ARRAY. The function accepts
	 * following parameters: 1. STRING_ARRAY repository 2. STRING customerQuery
	 */

	public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
		// Write your code here
		List<List<String>> result = new ArrayList<>();
		final int len = customerQuery.length();
		if (len < 2) {
			return result;
		}
		char[] array = customerQuery.toCharArray();
		String key = "";// mo

		IntStream.range(2, len + 1).forEach(j -> {
			List<String> res = repository.stream().filter(e -> e.startsWith(customerQuery.substring(0, j))).sorted()
					.collect(Collectors.toList());
			result.add(res);
		});

		return result;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int repositoryCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> repository = IntStream.range(0, repositoryCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).collect(toList());

		String customerQuery = bufferedReader.readLine();

		List<List<String>> result = Result.searchSuggestions(repository, customerQuery);

		result.stream().map(r -> r.stream().collect(joining(" "))).map(r -> r + "\n").collect(toList()).forEach(e -> {
			try {
//				bufferedWriter.write(e);
				System.out.println(e);
			} catch (Exception ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
//		bufferedWriter.close();
	}
}
