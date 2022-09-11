
package com.firealgo.dsandalgo.ds.stack;

import java.util.Arrays;

public class MyDynamicStack {
	private int capacity;
	private int top;// this define the size of the stack
	private int[] stackArr;
	private static final int DEFAULT_CAPACITY = 2;

	public MyDynamicStack() {
		this(DEFAULT_CAPACITY);
	}

	public MyDynamicStack(int initialCapacity) {
		this.capacity = initialCapacity;
		stackArr = new int[capacity];
		top = -1;
	}

	/**
	 * This method adds new entry to the top of the stack
	 * 
	 * @param entry
	 * @throws Exception
	 */
	public void push(int entry) {
		if (this.isStackFull()) {
			System.out.println(("Stack is full. Increasing the capacity."));
			this.increaseStackCapacity();
		}
		System.out.println("Adding: " + entry);
		this.stackArr[++top] = entry;
	}

	/**
	 * This method removes an entry from the top of the stack.
	 * 
	 * @return
	 * @throws Exception
	 */
	public int pop() throws Exception {
		if (this.isStackEmpty()) {
			throw new Exception("Stack is empty. Can not remove element.");
		}
		int entry = this.stackArr[top--];
		System.out.println("Removed entry: " + entry);
		return entry;
	}

	/**
	 * This method returns top of the stack without removing it.
	 * 
	 * @return
	 */
	public long peek() {
		return stackArr[top];
	}

	public boolean isStackEmpty() {
		return (top == -1);
	}

	private void increaseStackCapacity() {
		int[] newStack = new int[this.capacity * 2];
		for (int i = 0; i < capacity; i++) {
			newStack[i] = this.stackArr[i];
		}
		this.stackArr = newStack;
		this.capacity = this.capacity * 2;

	}

	public boolean isStackFull() {
		return (top == capacity - 1);
	}

	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(stackArr, 0, top + 1));
	}

	public int size() {
		return top + 1;
	}

}
