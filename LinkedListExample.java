package com.collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		//Creating LinkedList
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		//Adding elements
		System.out.println("=== Adding Elements ===");
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		System.out.println("LinkedList: " + numbers);
		
		// Add at first and last
        System.out.println("\n=== Add First/Last ===");
        numbers.addFirst(5);
        numbers.addLast(40);
        System.out.println("After addFirst(5) and addLast(40): " + numbers);
        // Get first and last
        System.out.println("\n=== Get First/Last ===");
        System.out.println("First element: " + numbers.getFirst());
        System.out.println("Last element: " + numbers.getLast());
        
        // Remove first and last
        System.out.println("\n=== Remove First/Last ===");
        numbers.removeFirst();
        System.out.println("After removeFirst(): " + numbers);
        numbers.removeLast();
        System.out.println("After removeLast(): " + numbers);
        
        // Using as Queue (FIFO)
        System.out.println("\n=== Queue Operations ===");
        LinkedList<String> queue = new LinkedList<>();
        
        
        // offer - add to end
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("Queue: " + queue);
        
        // poll - remove from beginning
        System.out.println("Polled: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
        
        // peek - view first element without removing
        System.out.println("Peek: " + queue.peek());
        System.out.println("Queue after peek: " + queue);
        
        
        
        
	}

}
