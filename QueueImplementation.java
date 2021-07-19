package com.queue;

public class QueueImplementation {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.dequeue();
		queue.enqueue(70);
	
		queue.show();

	}

}
