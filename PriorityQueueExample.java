package com.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(30);
		pq.add(10);
		pq.add(20);
		pq.offer(40);
		
		System.out.println("Queue: " + pq);
		
		System.out.println("Peek (smallest): " + pq.peek());
		
		System.out.println("Removed: " + pq.poll());
		
		System.out.println("After removal :" + pq);
		


	}

}
