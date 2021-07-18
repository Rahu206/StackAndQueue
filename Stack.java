package com.stack;

public class Stack<T> {
	
	LinkedList<T> stack = new LinkedList<T>();

    /**
     * It is used to add elements to the stack
     *
     * @param data 
     */
    public void push(T data) {
        stack.addAtStart(data);
    }
    /**
     * It is used to find the first element in stack
     * @return
     */
    public T peek() {
    	return stack.peek();
    }
    
    /**
     * It removes the top most element of the stack
     */
    public void pop() {
    	stack.pop();
    }

    /**
     * It is used to display the elements in the stack
     */
    public void show() {
    	stack.show();
    }
}

