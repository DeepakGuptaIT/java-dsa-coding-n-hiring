package com.firealgo.javabasicconcept.functionalProgramming.methodReference;

import java.util.function.BiFunction;

interface Sayable {
	void say();
}

public class MethodReference {

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static int add(int a, int b) {
		return a + b;
	}

	// instance method
	public void saySomething2() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
//		refereceToStaticMethodDemo();
//		refereceToPredefinedStaticMethodDemo();
//		refereceToStaticMethodDemo2();
		refereceToInstanceMethodDemo();

	}

	private static void refereceToInstanceMethodDemo() {
		MethodReference methodReference = new MethodReference(); // Creating object  
        // Referring non-static method using reference  
            Sayable sayable = methodReference::saySomething2;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            Sayable sayable2 = new MethodReference()::saySomething2; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();
		
	}

	private static void refereceToStaticMethodDemo2() {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> adder = MethodReference::add;
		int result = adder.apply(5, 7);
		System.out.println(result);

	}

	private static void refereceToPredefinedStaticMethodDemo() {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(MethodReference::ThreadStatus);
		t1.start();

	}

	private static void refereceToStaticMethodDemo() {
		// Referring static method
		Sayable sayable = MethodReference::saySomething;
		// Calling interface method
		sayable.say();

	}

}
