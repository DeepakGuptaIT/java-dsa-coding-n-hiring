package com.firelago.java.core.declareAndAccessControl;

import static java.lang.System.out; // 1 

import java.util.List;

import static java.lang.Integer.*; // 2 

public class TestStaticImport {
	public static void main(String[] args) {
		out.println(MAX_VALUE);
		out.println(toHexString(42)); 
		System.out.println();
		List<String> s = null;
	}
}
