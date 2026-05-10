package com.firealgo.dsandalgo.ds.stack;

import java.util.Arrays;

/**
 * Dynamic Stack Implementation using Array
 *
 * Key Idea:
 * - Stack follows LIFO (Last In First Out)
 * - Backed by array → resized dynamically when full
 *
 * Internal Representation:
 * - top → index of last inserted element
 * - size = top + 1
 *
 * Example:
 * push(10), push(20)
 * stack = [10, 20]
 * top = 1
 */
public class MyDynamicStack {

	private int capacity;     // current capacity of array
	private int top;          // index of top element (-1 means empty)
	private int[] stackArr;

	private static final int DEFAULT_CAPACITY = 2;

	public MyDynamicStack() {
		this(DEFAULT_CAPACITY);
	}

	public MyDynamicStack(int initialCapacity) {
		this.capacity = initialCapacity;
		this.stackArr = new int[capacity];
		this.top = -1; // stack initially empty
	}

	/* ================= PUSH ================= */

	/**
	 * Push element onto stack
	 *
	 * Steps:
	 * 1. Check if stack is full
	 * 2. Resize if needed
	 * 3. Increment top and insert
	 *
	 * Time Complexity:
	 * - Amortized O(1)
	 * - Worst case O(n) (during resize)
	 */
	public void push(int entry) {

		// If stack is full → double capacity
		if (isStackFull()) {
			increaseStackCapacity();
		}

		// Increment top FIRST, then assign
		stackArr[++top] = entry;
	}

	/* ================= POP ================= */

	/**
	 * Remove and return top element
	 *
	 * Steps:
	 * 1. Check if empty
	 * 2. Return element at top
	 * 3. Decrement top
	 *
	 * Time Complexity: O(1)
	 */
	public int pop() {

		if (isStackEmpty()) {
			throw new RuntimeException("Stack is empty. Cannot pop.");
		}

		int value = stackArr[top];

		// Optional: clear reference (good practice for GC)
		stackArr[top] = 0;

		top--;

		return value;
	}

	/* ================= PEEK ================= */

	/**
	 * Returns top element without removing it
	 *
	 * Time Complexity: O(1)
	 */
	public int peek() {

		if (isStackEmpty()) {
			throw new RuntimeException("Stack is empty.");
		}

		return stackArr[top];
	}

	/* ================= UTIL ================= */

	/**
	 * Check if stack is empty
	 */
	public boolean isStackEmpty() {
		return top == -1;
	}

	/**
	 * Check if stack is full
	 */
	private boolean isStackFull() {
		return top == capacity - 1;
	}

	/**
	 * Double the stack capacity
	 *
	 * Why doubling?
	 * → Ensures amortized O(1) complexity
	 *
	 * Uses System.arraycopy (faster than manual loop)
	 */
	private void increaseStackCapacity() {

		int newCapacity = capacity * 2;
		int[] newStack = new int[newCapacity];

		// Copy old elements
		System.arraycopy(stackArr, 0, newStack, 0, capacity);

		stackArr = newStack;
		capacity = newCapacity;
	}

	/**
	 * Current number of elements in stack
	 */
	public int size() {
		return top + 1;
	}

	/**
	 * Debug representation
	 *
	 * Only prints valid elements (0 → top)
	 */
	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(stackArr, 0, top + 1));
	}
}