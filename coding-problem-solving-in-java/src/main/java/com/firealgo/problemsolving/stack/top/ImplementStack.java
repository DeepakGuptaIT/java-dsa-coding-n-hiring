package com.firealgo.problemsolving.stack.top;

/**
 * Implement Stack using Array
 *
 * Stack follows LIFO:
 * Last In, First Out
 *
 * Working:
 *
 *        TOP
 *         ↓
 *       [30]  ← push / pop
 *       [20]
 *       [10]
 *       ----
 *
 * - push()    → adds an element to the TOP
 * - pop()     → removes and returns the TOP element
 * - peek()    → returns the TOP element without removing it
 * - isEmpty() → checks whether stack is empty
 * - isFull()  → checks whether stack is full
 * - size()    → returns the number of elements
 *
 * Time:
 * - push(): O(1)
 * - pop():  O(1)
 * - peek(): O(1)
 * - isEmpty(): O(1)
 * - isFull():  O(1)
 * - size():    O(1)
 *
 * Space: O(n)
 */
public class ImplementStack {

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);          // [10, 20, 30]
        System.out.println(stack.peek());   // 30
        System.out.println(stack.size());   // 3
        System.out.println(stack.isFull()); // true

        System.out.println(stack.pop());    // 30
        System.out.println(stack.pop());    // 20

        System.out.println(stack);          // [10]
        System.out.println(stack.size());   // 1
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.isFull());  // false
    }
}

class Stack {

    private final int[] elements;
    private int top = -1;

    public Stack(int capacity) {
        elements = new int[capacity];
    }

    /**
     * Add an element to the TOP of the stack.
     */
    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }

        elements[++top] = value;
    }

    /**
     * Remove and return the TOP element.
     */
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return elements[top--];
    }

    /**
     * Return the TOP element without removing it.
     */
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return elements[top];
    }

    /**
     * Check whether the stack is empty.
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Check whether the stack is full.
     */
    public boolean isFull() {
        return top == elements.length - 1;
    }

    /**
     * Return the number of elements currently in the stack.
     */
    public int size() {
        return top + 1;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i <= top; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(elements[i]);
        }

        return result.append("]").toString();
    }
}