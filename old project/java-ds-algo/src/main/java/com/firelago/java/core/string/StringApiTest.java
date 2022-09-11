package com.firelago.java.core.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author uvdee
 * {@link https://www.journaldev.com/26288/java-11-new-methods-in-string-class}
 */
@SuppressWarnings("unused")
public class StringApiTest {

	public static void main(String[] args) {
//		createString();
//		joinTest();
		toCharArrayTest();
//		valueOfTest();
	}
	
	private static void createString() {
		//1. from char array to string
		System.out.println("----------------createString -------------------");

		String name = new String(new char[] {'a','b','c'});
		System.out.println(name);
		
	}
	/**
	 *  @since 1.8
	 */
	private static void joinTest() {
		System.out.println("----------------joinTest -------------------");
		List<String> list = new ArrayList<>(Arrays.asList("one","two","three"));
		String str = String.join("-", list);
		System.out.println(str);
	}
	private static void toCharArrayTest() {
		System.out.println("----------------toCharArrayTest -------------------");
		String name = "Jay";
		char[] arr = name.toCharArray();
		System.out.println(Arrays.toString(arr));
	}
	/**
	 * there are multiple valueOf method specified in docs.
	 * All these method returns the String representation of different inputs
	 * these are static methods.
	 */
	private static void valueOfTest() {
		System.out.println("----------------valueOfTest -------------------");
		//1.
		String val = String.valueOf(true);//"true"
		val = String.valueOf(new char[] {'a','b','c'});//"abc"
		val = String.valueOf(5);//"5"
		System.out.println(val);
	}
	
	private static void testBasicStringBuilerOp() {
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		sb.append("java", 1, 2);
		sb.delete(4, 6);
		sb.insert(3, false);
		System.out.println(sb);

	}

}
