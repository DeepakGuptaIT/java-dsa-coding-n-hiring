package com.firealgo.dsandalgo.ds.queue;

import java.util.Arrays;

/**
 * 
 * @author uvdee
 *
 */
public class QueueImpl {
	private int capacity;
	private int front = 0;
	private int rear = -1;
	private int[] queueArr;
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 2;

	public QueueImpl() {
		this(DEFAULT_CAPACITY);
	}

	public QueueImpl(int initialCapacity) {
		this.capacity = initialCapacity;
		queueArr = new int[this.capacity];
	}

	public boolean isFull() {
		return (size == capacity);
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enQueue(int item) {
		if (isFull()) {
			// increase the capacity
			System.out.println("Queue is full, increase capacity...");
			increaseCapacity();
		}
		rear++;
		if (rear >= capacity && size != capacity) {
			rear = 0;
		}
		queueArr[rear] = item;
		size++;
		System.out.println("Adding: " + item);
	}

	public int deQueue() throws Exception {
		int item;
		if (isEmpty()) {
			throw new Exception("Underflow ! Unable to remove element from Queue");

		} else {
			item = queueArr[front];
			front++;
			if (front > capacity - 1) {
//				System.out.println("removed: " + queueArr[front - 1]);
				front = 0;
			} else {
			}
			System.out.println("removed: " + item);
			size--;
		}
		return item;
	}

	private void increaseCapacity() {
		int newCapacity = this.capacity * 2;
		int[] newArr = new int[newCapacity];
		// copy elements to new array, copy from rear to front
		int tmpFront = front;
		int index = -1;
		while (true) {
			newArr[++index] = this.queueArr[tmpFront];
			tmpFront++;
			if (tmpFront == this.queueArr.length) {
				tmpFront = 0;
			}
			if (size == index + 1) {
				break;
			}
		}
		// make new array as queue
		this.queueArr = newArr;
		System.out.println("New array capacity: " + this.queueArr.length);
		// reset front & rear values
		this.front = 0;
		this.rear = index;
		this.capacity = newCapacity;
	}

	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(queueArr, front, rear));
	}

}
