package com.loops;

public class LoopsExample {

	public static void main(String[] args) {
		// For Loop
		System.out.println("==== For Loop === ");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		// Enhanced for loop (for-each)
		System.out.println("\n==== Enhanced For loop ===");
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int num : numbers) {
			System.out.println(num);
		}

		// WHILE LOOP
		// condition is checked before entering the loop
		System.out.println("\n=== While Loop ====");
		int j = 1;
		while (j <= 5) {
			System.out.println(j);
			j++;

		}

		// DO_WHILE LOOP
		// Executes at least once, condition checked at the end
		System.out.println("\n ==== DO WHILE LOOP ====");
		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k <= 5);

		// Nested Loops
		System.out.println("\n === Nested Loops (MUltiplication Table) ===");
		for (int i = 1; i <= 3; i++) {
			for (int m = 1; m <= 5; m++) {
				System.out.println(i * m);
			}
			System.out.println();

		}

		// Break Statement - used to exits the loop
		System.out.println("\n=== Break Statement ====");
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				break;
			}
			System.out.println(i);
		}
		
		//CONTINUE STATEMENT - it skips the current iteration
		
		System.out.println("\n=== Continue Statement ===");
		for(int i = 1; i<=10; i++) {
			if(i%2==0) {
				continue;
			}
		System.out.println(i);
		}

	}

}
