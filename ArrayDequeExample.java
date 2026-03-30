package com.collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		
		dq.addFirst(10);
		dq.addLast(20);
		dq.addLast(30);
		dq.offerFirst(50);
		dq.offerLast(60);
		
		System.out.println("Deque: " + dq);
		
	    System.out.println("First: " + dq.peekFirst());
        System.out.println("Last: " + dq.peekLast());
        
        System.out.println("First: " + dq.pollFirst());
        System.out.println("Last: " + dq.pollLast());
        
        System.out.println(dq.poll());

        
        
        
        System.out.println("After removal: " + dq);
		

	}

}
