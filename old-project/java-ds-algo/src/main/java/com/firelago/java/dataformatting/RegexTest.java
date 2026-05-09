package com.firelago.java.dataformatting;

import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		asMatchPredicateT();

	}

	private static void asMatchPredicateT() {
		var str = Pattern.compile("aba").asMatchPredicate();
		boolean b = str.test("aba");
		System.out.println(b);
		
	}

}
