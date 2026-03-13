package com.array;

public class ArrayExample {

	public static void main(String[] args) {
		// method 1 - array declaration and initialization
		int[] numbers = { 10, 20, 30, 40, 50 };

		int[] scores = new int[5];
		scores[0] = 85;
		scores[1] = 90;
		scores[2] = 78;
		scores[3] = 92;
		scores[4] = 88;

		// Accessing elements
		System.out.println("First element: " + numbers[0]);
		System.out.println("Last element: " + numbers[numbers.length - 1]);

		// Array length
		System.out.println("Array length: " + numbers.length);

		// Iterating through array using for loop
		System.out.println("\nArray elements using for loop:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// Enhanced for loop(for-each)
		System.out.println("\nArray elements using enhanced for loop");
		for (int num : numbers) {
			System.out.println(num);
			
		}
		
		//Finding Sum and average
		int sum = 0;
		for(int num : numbers) {
			sum +=num;
		}
		double average = (double) sum/numbers.length;
		System.out.println("\nSum: " + sum );
		System.out.println("Average: " + average );
		
		//Finding maximum element in array
		int max = numbers[0];
		for(int num : numbers) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println("Maxium: " + max);


	}

}
