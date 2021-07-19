package com.queue;

public class LinkedList<T> {
	Node<T> head;
	// add elements to the linked list
	public void add(T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;
		if (head == null) {
			head = newNode;
		} else {
			Node<T> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
	}

	
	public void show() {
		Node<T> node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	
	public void popLast() {
		Node<T> node = head;
		Node<T> secondlastNode = head;
		while (node.next != null) {
			secondlastNode = node;
			node = node.next;
		}
		secondlastNode.next = null;
	}

	
	
	

}


