package com.firelago.java.core.string;

import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Java11StringNewApiTest {

	public static void main(String[] args) {
//		isBlankT();
		stripT();
//		lines();
//		repeat();
		
		
		

	}
	private static void repeat() {
		// TODO Auto-generated method stub
		System.out.println("abc\t".repeat(3));
		
	}
	private static void lines() {
		String s = "abc\ndef\nghi\r\njkl";
//		System.out.println(s);
		s.lines().forEach(System.out::println);
		List<String> list = s.lines().collect(Collectors.toList());
//		System.out.println(list);
		
	}
	/**
	 * strip() is �Unicode-aware� evolution of trim().
	 */
	
	private static void stripT() {
		
		System.out.println("a"+" \njay viru ".strip() + "b");
		
	}
	/**
	 * Empty Strings and Strings with only white spaces are treated as blank.
	 */
	private static void isBlankT() {
		String s = "\t\n";//true
		boolean b = s.isBlank();
		System.out.println(b);
		
	}

}
