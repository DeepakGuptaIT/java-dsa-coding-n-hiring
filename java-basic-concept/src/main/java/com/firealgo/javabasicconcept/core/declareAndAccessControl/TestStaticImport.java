package com.firealgo.javabasicconcept.core.declareAndAccessControl;

import java.util.List;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.toHexString;
import static java.lang.System.out;

public class TestStaticImport {
	public static void main(String[] args) {
		out.println(MAX_VALUE);
		out.println(toHexString(42)); 
		System.out.println();
		List<String> s = null;
	}
}
