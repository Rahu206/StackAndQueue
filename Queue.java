package com.queue;

public class Queue<T> {
	LinkedList<T> queue = new LinkedList<>();

	/**
	 * It is use to add elements in the queue
	 * 
	 * @param data
	 */
	public void enqueue(T data) {
		queue.add(data);
	}
	/**
	 * It is use to remove elements from the queue
	 * @return
	 */
	public int dequeue() {
		return queue.pop();
	}

	/**
	 * It prints all the elements present in the queue
	 */
	public void show() {
		queue.show();
	}

}