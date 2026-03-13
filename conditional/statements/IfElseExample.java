package com.conditional.statements;

public class IfElseExample {

	public static void main(String[] args) {
		int number = 15;

		// simple if-else

		if (number > 0) {
			System.out.println("Positive Number");
		} else if (number < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Zero");
		}

		// Nested if-else

		int age = 20;
		if (age >= 18) {
			if (age >= 65) {
				System.out.println("Senior citizen");
			} else {
				System.out.println("Adult");
			}

		} else {
			System.out.println("Minor");
		}

		// Grade calculation example

		int marks = 85;
		if (marks >= 90) {
			System.out.println("Grade: A+");
		} else if (marks >= 80) {
			System.out.println("Grade: A");
		} else if (marks >= 70) {
			System.out.println("Grade: B");
		} else if (marks >= 60) {
			System.out.println("Grade: C");
		} else {
			System.out.println("Grade: F");
		}

	}

}
