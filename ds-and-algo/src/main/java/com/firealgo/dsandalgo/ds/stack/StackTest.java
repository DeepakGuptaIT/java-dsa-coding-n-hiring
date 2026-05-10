package com.firealgo.dsandalgo.ds.stack;

public class StackTest {

    public static void main(String[] args) {

		fullTest();
	}

	private static void fullTest() {
		MyDynamicStack stack = new MyDynamicStack(2);

		System.out.println("==== PUSH TEST (with resize) ====");
		stack.push(10);
		stack.push(20);
		stack.push(30); // should trigger resize
		stack.push(40);

		System.out.println("Stack: " + stack);
		System.out.println("Size: " + stack.size());

		System.out.println("\n==== PEEK TEST ====");
		System.out.println("Top element: " + stack.peek());

		System.out.println("\n==== POP TEST ====");
		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());

		System.out.println("Stack after pop: " + stack);
		System.out.println("Size: " + stack.size());

		System.out.println("\n==== PUSH AGAIN ====");
		stack.push(50);
		stack.push(60);
		System.out.println("Stack: " + stack);

		System.out.println("\n==== EMPTY CHECK ====");
		while (!stack.isStackEmpty()) {
			System.out.println("Popped: " + stack.pop());
		}

		System.out.println("Is stack empty? " + stack.isStackEmpty());

		System.out.println("\n==== EDGE CASE: POP ON EMPTY ====");
		try {
			stack.pop(); // should throw exception
		} catch (Exception e) {
			System.out.println("Expected Exception: " + e.getMessage());
		}

		System.out.println("\n==== EDGE CASE: PEEK ON EMPTY ====");
		try {
			stack.peek(); // should throw exception
		} catch (Exception e) {
			System.out.println("Expected Exception: " + e.getMessage());
		}
	}
}