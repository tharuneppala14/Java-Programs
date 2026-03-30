package com.collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TreeSet - automatically sorted

		System.out.println("=== TreeSet ===");
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(50);
		treeSet.add(20);
		treeSet.add(40);
		treeSet.add(10);
		treeSet.add(30);
		treeSet.add(20); // Duplicate - won't be added

		System.out.println("TreeSet (sorted): " + treeSet);

		// TreeSet methods
		System.out.println("\n=== TreeSet Methods ===");

		// size()
		System.out.println("Size: " + treeSet.size());

		// contains()
		System.out.println("Contains 20: " + treeSet.contains(20));

		// first() and last()
		System.out.println("First: " + treeSet.first());
		System.out.println("Last: " + treeSet.last());
		
		// higher() and lower()
        System.out.println("Higher than 10: " + treeSet.higher(10));
        System.out.println("Lower than 20: " + treeSet.lower(20));

        System.out.println("Floor of 25: " + treeSet.floor(25));
        System.out.println("Ceiling of 25: " + treeSet.ceiling(25));
	}

}
