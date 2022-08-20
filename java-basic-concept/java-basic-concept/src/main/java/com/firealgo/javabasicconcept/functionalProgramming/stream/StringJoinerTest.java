package com.firealgo.javabasicconcept.functionalProgramming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

@SuppressWarnings("unused")
public class StringJoinerTest {

	public static void main(String[] args) {
//		exOne();
		exTwo();
	}

	private static void exOne() {
		StringJoiner sj = new StringJoiner(":", "[", "]");
		sj.add("George").add("Sally").add("Fred");
		String desiredString = sj.toString();
		System.out.println(desiredString);

	}

	private static void exTwo() {
		List<String> cities = Arrays.asList("Milan", "London", "New York", "San Francisco");

		String citiesCommaSeparated = String.join(",", cities);

		System.out.println(citiesCommaSeparated);

		// Output: Milan,London,New York,San Francisco
	}

}
