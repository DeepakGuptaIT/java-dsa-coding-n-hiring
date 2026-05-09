package com.firelago.java.core.assignments;

@SuppressWarnings("unused")
public class VaildLiteralsVariablesAndAssignment {

	public static void main(String[] args) {
		intergerLiterals();
		booleanLiterals();
		charLiterals();

	}

	private static void charLiterals() {
		// A char literal is represented by a single character in single quotes
		char a = 'a';
		char b = '@';

	}

	private static void booleanLiterals() {
		// only true and false
		boolean flag = true;

	}

	private static void intergerLiterals() {
		// Java 7, numeric literals can be declared using underscore characters (_),
		// ostensibly to improve readability
		int i = 10_00;
		// binary number
		i = 0b1010;// 10
		System.out.println(i);
		// octal number
		int octal = 06;
		octal = 010;// 8
		System.out.println(octal);

	}

}
