package com.firelago.hiringchallenge.nov21.ubs;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			badMethod();
			System.out.println("A");
		} 
		catch(Exception ex) {
			System.out.println("B");
		}
		finally {
			System.out.println("C");
		}
		System.out.println("D");

	}

	private static void badMethod() {
		// TODO Auto-generated method stub
		
	}

}
