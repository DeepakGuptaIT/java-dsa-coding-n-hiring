package com.firealgo.javabasicconcept.dataformatting;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		asMatchPredicateT();
		test02();

	}

	private static void test02() {
		boolean isMatched = Pattern.matches("[a-z]", "deepak");
		System.out.println(isMatched);
	}

	private static void asMatchPredicateT() {
		Predicate<String> str = Pattern.compile("aba").asMatchPredicate();
		boolean b = str.test("aba");
		System.out.println(b);
		
	}

}
