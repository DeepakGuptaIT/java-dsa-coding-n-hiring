package com.firealgo.dsandalgo.practise.ds;

import java.util.EmptyStackException;

public class MyStack {
    private int top;
    private int[] arr;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        arr = new int[this.capacity];
        this.top = -1;
    }

    public MyStack() {
        this(3);
    }

    // push
    public int push(int item) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[++top] = item;
        return item;

    }

    // pop
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[top--];
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[top];
    }

    // size
    public int size() {
        return top + 1;
    }


    // isEmpty
    public boolean isEmpty() {
        return (top == -1);
    }


    // isFull
    public boolean isFull() {
        return (top == capacity - 1);
    }


}
