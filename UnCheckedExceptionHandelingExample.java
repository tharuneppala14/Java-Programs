package com.exception.handeling;

public class UnCheckedExceptionHandelingExample {

	public static void main(String[] args) {
		// Example 1: ArrayIndexOutOfBoundsException
		System.out.println("=== Example 1: Array Exception ===");
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println("Accessing index 5...");
			System.out.println(numbers[5]); // This will throw exception
			System.out.println("This line won't execute");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error : Index out of bounds");
			System.out.println("Exception message: " + e.getMessage());
		}
		System.out.println("Program continues....\n");
		
		
        // Example 2: ArithmeticException
        System.out.println("=== Example 2: Arithmetic Exception ===");
        try {
        	int result = 10 / 0;
        	
        } catch (ArithmeticException e) {
        	System.out.println("Error: Cannot divide by zero");
        	System.out.println("Exception: " + e);
        }
		System.out.println("Program continues....\n");
		
        // Example 3: Multiple catch blocks
		 // NullPointerException
		System.out.println("=== Example 3: Multiple Catch Blocks ===");
		try {
			String str = null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("Error: Null pointer exception");
		}catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } catch (Exception e) {
            // Generic exception handler (should be last)
            System.out.println("Error: Something went wrong");
        }
        System.out.println("Program continues...\n");
        
        // Example 5: Finally with exception
        System.out.println("=== Example 5: Finally with Exception ===");
        try {
        	int result = 10/0;
        }catch (ArithmeticException e) {
        	System.out.println("Exception caught");
        	
        } finally {
        	System.out.println("Finally block executes even after exception");
        }



	}

}
