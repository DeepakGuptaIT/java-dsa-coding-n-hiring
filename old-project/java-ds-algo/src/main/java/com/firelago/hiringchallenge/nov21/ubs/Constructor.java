package com.firelago.hiringchallenge.nov21.ubs;

public class Constructor {
	
	static String str;
	public void Constructor() {
		System.out.println("In constructor");
		str = "Hello World";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c = new Constructor();
		System.out.println(str);

	}

}
