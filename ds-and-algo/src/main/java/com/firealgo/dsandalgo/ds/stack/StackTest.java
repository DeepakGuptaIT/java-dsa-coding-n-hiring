package com.firealgo.dsandalgo.ds.stack;

public class StackTest {

	public static void main(String[] args) throws Exception {
		myDynamicStackT();

	}

	private static void myDynamicStackT() throws Exception {
		MyDynamicStack stack = new MyDynamicStack();
//		stack.pop();
		for (int i = 1; i < 10; i++) {
			stack.push(i);
		}
		for (int i = 1; i < 4; i++) {
			try {
				stack.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("stack =>" + stack);
		stack.push(0);
		System.out.println("stack =>" + stack);
		System.out.println(stack.peek() + "\t" + stack.size());
	}

}
