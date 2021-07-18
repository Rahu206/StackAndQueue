package com.stack;

public class StackMain {
	public static void main(String[] args) {
		
	Stack<Integer> stack = new Stack<Integer>();
	stack.push(70);
	stack.push(30);
	stack.push(56);
	stack.show();
	System.out.println();
    
    while(stack.peek() != null) {
    	System.out.println("Top most element of the stack is: "+stack.peek());
    	stack.pop();
    	stack.show();
    	
    }
}
}

