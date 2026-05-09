package com.firealgo.dsandalgo.ds.queue;

import java.util.Arrays;

/**
 * 
 * @author uvdee
 *
 */
public class QueueImpl2 {
	private int front = 0;
	private int rear = -1;
	private int size = 0;
	private int capacity = 2;
	private static final int DEFAULT_CAPACITY = 0;
	private int[] queueArr;
	
	public QueueImpl2() {
		this(DEFAULT_CAPACITY);
	}

	public QueueImpl2(int capacity) {
		this.capacity = capacity;
		queueArr = new int[capacity];
	}
	public boolean isFull() {
		return size == capacity;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enQueue(int item) {
		if(isFull() ) {
			System.out.println("Queue is full ! Increasing the capacity...");
			this.increaseCapacity();
		}
		rear++;
		if(rear >= capacity && size != capacity) {
			rear = 0;
		}
		queueArr[rear] = item;
		size++;
		System.out.println("Adding: " + item);
	}

	private void increaseCapacity() {
		int[] newQueue = new int[capacity*2];
	}
	
	

}
