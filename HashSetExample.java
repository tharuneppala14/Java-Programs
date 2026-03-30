package com.collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		// Adding elements

		System.out.println("=== Adding Elements ===");
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Mango");
		set.add("Apple"); // Duplicate - won't be added
		System.out.println("HashSet: " + set);

		System.out.println("Size: " + set.size()); // 4, not 5

		// Contains
		System.out.println("\n=== Contains ===");
		System.out.println("Contains 'Apple': " + set.contains("Apple"));
		System.out.println("Contains 'Grapes': " + set.contains("Grapes"));

		// Remove
		System.out.println("\n=== Remove ===");
		set.remove("Banana");
		System.out.println("After removing Banana: " + set);

		// HashSet with integers
		System.out.println("\n=== Integer HashSet ===");
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10); // Duplicate
		numbers.add(40);

		System.out.println("Numbers: " + numbers);

		// Set operations
		System.out.println("\n=== Set Operations ===");
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);

		HashSet<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);

		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);

		// Union
		HashSet<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("Union: " + union);

		// Intersection
		HashSet<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection: " + intersection);

		// Difference
		HashSet<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println("Difference (Set1 - Set2): " + difference);

		// isEmpty
		System.out.println("\n=== Is Empty ===");
		System.out.println("Is set empty: " + set.isEmpty());
		
		 // Clear
        set.clear();
        System.out.println("After clear, is empty: " + set.isEmpty());
        
        
        
     // Practical example: Remove duplicates from array
        System.out.println("\n=== Remove Duplicates ===");
        Integer[] arrayWithDuplicates = {1, 2, 3, 2, 4, 1, 5, 3};
        HashSet<Integer> uniqueSet = new HashSet<>();
        
        System.out.print("Original array: ");
        for (int num : arrayWithDuplicates) {
            System.out.print(num + " ");
            uniqueSet.add(num);
        }
        
        System.out.println("\nUnique elements: " + uniqueSet);

	}

}
