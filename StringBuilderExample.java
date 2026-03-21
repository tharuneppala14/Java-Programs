package com.strings;

public class StringBuilderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("Initial: " + sb);
		System.out.println("Capacity: " + sb.capacity()); // Default 16 + length

		// Append
		System.out.println("\n=== Append ===");
		sb.append("World");
		System.out.println("After append: " + sb);

		sb.append(" ").append(2024); // Method chaining
		System.out.println("After chaining: " + sb);
		
		//Insert
		System.out.println("\n=== Insert ===");
		sb.insert(5, ",");
		System.out.println("After insert: " + sb);
		sb.insert(0, ">>");
		System.out.println("Insert at beginning: " + sb);
		
		//Replace
		System.out.println("\n=== replace ====");
		System.out.println("Before Replace:  " + sb);
		sb.replace(0, 3, "**");
		System.out.println("After replace: " + sb);
		
		//Reverse
		System.out.println("\n==== Reverse ====");
		StringBuilder sb2 = new StringBuilder("Java Programming");
		System.out.println("Original: " + sb2);
		sb2.reverse();
		System.out.println("Reversed: " + sb2);
		
		 // Length and Capacity
        System.out.println("\n=== Length and Capacity ===");
        System.out.println("Length: " + sb2.length());
        System.out.println("Capacity: " + sb2.capacity());
        
        //Substring
        System.out.println("\n=== Substring ===");
        StringBuilder sb4 = new StringBuilder("Hello World");
        System.out.println("Substring (0,5): " + sb4.substring(0,5));
        
        //Converting to String
        System.out.println("\n===Substring ===");
        String finalString = sb.toString();
        System.out.println("Converting to String: " + finalString);
        
        //Performance comparison
        System.out.println("\n=== Performance Comparison ===");
        
        //Using String (slow for may concatenations)
        long startTime = System.currentTimeMillis();
        String str = "";
        for(int i = 0; i<10000; i++) {
        	str = str+i; // Creates new String object each time 
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String concatenation time: " + (endTime - startTime) + "ms");
        
        
        //Using StringBuilder (fast)
        startTime = System.currentTimeMillis();
        StringBuilder sbpref = new StringBuilder();
        for(int i = 0; i<10000; i++) {
        	sbpref.append(i);  // Modifies same object
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder append time: " + (endTime - startTime) + "ms");
        
        // StringBuffer (thread-safe but slightly slower than StringBuilder)
        System.out.println("\n=== StringBuffer ===");
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");
        sbuf.insert(5, ",");
        System.out.println("StringBuffer: " + sbuf);
        
        
     // Practical example: Building a CSV
        System.out.println("\n=== Practical Example: CSV Builder ===");
        StringBuilder csv = new StringBuilder();
        csv.append("Name,Age,Grade\n");
        csv.append("John,20,A\n");
        csv.append("Alice,22,B\n");
        csv.append("Bob,21,A\n");
        System.out.println(csv.toString());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
        
		
		
		
		
		
		
		
		
		
		
	}

}
