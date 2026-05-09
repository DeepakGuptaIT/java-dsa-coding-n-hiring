package com.firelago.rivision;

import java.util.Arrays;

public class Queue {

	private int front = 0, rear = -1;
	private int size;
	private int capacity;
	private int defaultCapacity = 10;
	private int queueArr[];

	public Queue(int capacity) {
		this.capacity = capacity;
		queueArr = new int[this.capacity];
		size = 0;
	}

	public int size() {
		return size;

	}

	public boolean isFull() {
		return (capacity == size);
	}

	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("queue is full!");
			return;
		}
		rear++;
		if(rear >= capacity && capacity > size) {
			rear = 0;
		}
		size++;
		queueArr[rear] = item;
		
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty!");
			return 0;
		}
//		front ++;
		if(front >= capacity && capacity > size) {
			front = 0;
		}
		System.out.println("removed item is: "+ queueArr[front]);
		front++;
		size--;
		return queueArr[front];
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue que = new Queue(5);
		que.enqueue(3);
		que.enqueue(4);
		que.enqueue(5);
		que.dequeue();
		que.dequeue();
		que.dequeue();

	}

}
