package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class AraayListExample {

	public static void main(String[] args) {
		//Creating ArrayList
		ArrayList<String> fruits = new ArrayList<>();
		
		//Adding elements
		System.out.println("==== Adding Elements ====");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Apple"); //Duplicates allowed
		System.out.println("Fruits: " + fruits);
		
		//Add at specific index
		fruits.add(1, "Grapes");
        System.out.println("After adding Grapes at index 1: " + fruits);
      
        // Get element
        System.out.println("\n=== Getting Elements ===");
        System.out.println("Element at index 0: " + fruits.get(0));
        System.out.println("Element at index 2: " + fruits.get(2));

     // Size
        System.out.println("\n=== Size ===");
        System.out.println("Size: " + fruits.size());
        
        // Check if contains
        System.out.println("\n=== Contains ===");
        System.out.println("Contains 'Banana': " + fruits.contains("Banana"));
        System.out.println("Contains 'Watermelon': " + fruits.contains("Watermelon"));
        
     // Index of
        System.out.println("\n=== Index Of ===");
        System.out.println("Index of 'Orange': " + fruits.indexOf("Orange"));
        System.out.println("Last index of 'Apple': " + fruits.lastIndexOf("Apple"));
        
     // Update element
        System.out.println("\n=== Updating ===");
        fruits.set(2, "Pineapple");
        System.out.println("After updating index 2: " + fruits);
        
        
        fruits.remove(0); // Remove an element
        System.out.println("After removing index 0: " + fruits);
        
        // Iterating - Method 1: for loop
        System.out.println("\n=== Iteration - For Loop ===");
        for(int i =0;i<fruits.size();i++) {
        	System.out.println(fruits.get(i));
        }
        
        // Iterating - Method 2: Enhanced for loop
        System.out.println("\n=== Iteration - Enhanced For ===");
        for(String fruit : fruits) {
        	System.out.println(fruit);
        }
        
     // Iterating - Method 4: forEach with lambda (Java 8+)
        System.out.println("\n=== Iteration - Lambda ===");
        fruits.forEach(fruit -> System.out.println(fruit));
        
        // Sorting
        System.out.println("\n=== Sorting ===");
        Collections.sort(fruits);
        System.out.println("Sorted: " + fruits);
        
     // Clear
        System.out.println("\n=== Clear ===");
        ArrayList<String> tempList = new ArrayList<>(fruits);
        tempList.clear();
        System.out.println("After clear: " + tempList);
        System.out.println("Is empty: " + tempList.isEmpty());
        


	}

}
