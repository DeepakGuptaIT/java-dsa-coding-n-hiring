package com.firelago.rivision;

import java.util.Arrays;

public class Stack {
	private int top;
	private int capacity;
	private int[] stackArr;
	private  static final int DEFAULT_CAPACITY = 5;
	
	

	public Stack(int capacity) {
		this.capacity = capacity;
		stackArr = new int[capacity];
		top = -1;
	}
	



	public Stack() {
		this(DEFAULT_CAPACITY);
	}
	
	public boolean isFull() {
		return (top == capacity-1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("stack is full");
		}
		stackArr[++top] = item;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty!");
		}
		int entry = stackArr[top--];
		System.out.println("Removed entry: " + entry);
		return entry;
	}
	
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(stackArr, 0, top + 1));
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty!");
		}
		return stackArr[top];
	}
	public int size() {
		return top+1;
	}
	
	




	public static void main(String[] args) throws Exception {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
//		stack.pop();
		stack.pop();
		System.out.println(stack);
	}

}
