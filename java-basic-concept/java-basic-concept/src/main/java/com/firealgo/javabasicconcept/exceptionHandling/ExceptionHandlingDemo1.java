package com.firealgo.javabasicconcept.exceptionHandling;

import java.io.File;
import java.io.IOException;

public class ExceptionHandlingDemo1 {
	
	public static void main(String[] args) {
		checkFinally();

	}

	private static int checkFinally() {
		// TODO Auto-generated method stub
		int i =5;
		try {
			i =10;
			File file = new File("abc.txt");
			file.createNewFile();
			System.out.println("file created");
//			return i;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			i = 10;
//			return i;
		}
		System.out.println(i);
		return i;
		
		
	}

}
