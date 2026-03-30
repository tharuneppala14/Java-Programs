package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// Adding Key-value pairs

		System.out.println("=== Adding Elements ===");

		map.put("Tharun", 25);
		map.put("Alice", 30);
		map.put("Bob", 28);
		map.put("Charlie", 35);

		System.out.println("HashMap: " + map);

		map.put("Tharun", 26);

		System.out.println("After overwrites HashMap: " + map);

		// Get value by key

		System.out.println("\n=== Getting Values ===");
		System.out.println("Tharun's age: " + map.get("Tharun"));
		System.out.println("Alice's age: " + map.get("Alice"));
		System.out.println("Unknown key: " + map.get("David")); // Returns null

		// getOrDefault
		System.out.println("David's age (default): " + map.getOrDefault("David", 0));

		// Check if key/value exists
		System.out.println("\n=== Contains ===");
		System.out.println("Contains key 'Bob': " + map.containsKey("Bob"));
		System.out.println("Contains key 'Eve': " + map.containsKey("Eve"));
		System.out.println("Contains value 30: " + map.containsValue(30));

		// Size
		System.out.println("\n=== Size ===");
		System.out.println("Size: " + map.size());

		// Remove
		System.out.println("\n=== Remove ===");
		map.remove("Bob");
		System.out.println("After removing Bob: " + map);

		// Iteration - Method 1: Using keySet()
		System.out.println("\n=== Iteration - KeySet ===");
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));

		}

		// Iteration - Method 2: Using entrySet()
		System.out.println("\n=== Iteration - EntrySet ===");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());

		}
		
		// Iteration - Method 3: Using values()
        System.out.println("\n=== Iteration - Values Only ===");
        for (Integer age : map.values()) {
            System.out.println("Age: " + age);
        }

	}

}
