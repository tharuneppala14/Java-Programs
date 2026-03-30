package com.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Stack: " + stack);
		
		//pop(Remove)
		System.out.println("Removed: " + stack.pop());
		
		//peek
		System.out.println("Last element: " + stack.peek());
		
        System.out.println("Stack after : " + stack);


	}

}
