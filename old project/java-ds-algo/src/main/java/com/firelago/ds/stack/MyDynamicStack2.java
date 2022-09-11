package com.firelago.ds.stack;

import java.util.Arrays;

public class MyDynamicStack2 {
	private int top;
	private static final int DEFAULT_CAPACITY = 2;
	private int capacity;
	private int[] stackArr;

	public MyDynamicStack2() {
		this(DEFAULT_CAPACITY);

	}

	public MyDynamicStack2(int capacity) {
		this.capacity = capacity;
		top = -1;
		stackArr = new int[this.capacity];
	}

	public void push(int entry) throws Exception {
		if (isStackFull()) {
			throw new Exception("stack is full");
		}
		this.stackArr[++top] = entry;
	}

	public int pop() throws Exception {
		if (isStackEmpty()) {
			throw new Exception("stack is empty");
		}
		int entry = this.stackArr[--top];
		return entry;
	}
	
	public int peek() {
		return stackArr[top];
	}

	private boolean isStackFull() {
		return (capacity == top + 1);
	}

	private boolean isStackEmpty() {
		return top == -1;
	}
	
	public int size() {
		return top +1;
	}

}
