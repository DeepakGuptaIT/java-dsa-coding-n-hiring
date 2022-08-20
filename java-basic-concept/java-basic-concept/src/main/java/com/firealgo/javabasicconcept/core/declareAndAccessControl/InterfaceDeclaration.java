package com.firealgo.javabasicconcept.core.declareAndAccessControl;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InterfaceDeclaration {

	public static void main(String[] args) {
		System.out.println(new C().add());
	}
}

//blank interface
interface I1 {

}

interface I2 {
	// variables are public static final by default.
	int rate = 5;

	void show();

	void calc() throws Exception;

	int add() throws FileNotFoundException;
}

class C implements I2 {

	@Override
	public void show() {
		System.out.println("Show me C");

	}
	//When we override a method -
	//	we can't narrow down the implementation. 
	// we can't throw broder Checked Exception.

	// we can throw narrower Exception or any RunTime or No Exception but not broder Exceptions
	// Exception
	@Override
	public void calc() throws IOException {

	}
//	  Compilation Failed :
//	  Exception Exception is not compatible with throws clause in I2.add()
	@Override
	public int add() {
		return I2.rate;
	}

}
