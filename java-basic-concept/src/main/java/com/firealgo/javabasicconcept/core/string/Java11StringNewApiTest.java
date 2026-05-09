package com.firealgo.javabasicconcept.core.string;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.*;

@SuppressWarnings("unused")
public class Java11StringNewApiTest {

	public static void main(String[] args) {
//		isBlankT();
//		stripT();
		lines();
//		repeat();
		
		
		

	}
	private static void repeat() {
		// TODO Auto-generated method stub
		out.println("abc\t".repeat(3));
		
	}
	private static void lines() {
		String s = "abc\ndef\nghi\r\njkl";
		out.println(s);
		s.lines().forEach(out::println);
		List<String> list = s.lines().collect(Collectors.toList());
		out.println(list);
		
	}
	/**
	 * strip() is �Unicode-aware� evolution of trim().
	 */
	
	private static void stripT() {
		
		out.println("a"+" \njay viru ".strip() + "b");
		
	}
	/**
	 * Empty Strings and Strings with only white spaces are treated as blank.
	 */
	private static void isBlankT() {
		String s = "\t\n";//true
		boolean b = s.isBlank();
		out.println(b);
		
	}

}
