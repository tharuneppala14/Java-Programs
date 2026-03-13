package com.java;

public class OperatorsExample {

	public static void main(String[] args) {

		int a = 10, b = 5;

		// Arithmetic operators
		System.out.println("==== Arithmetic Operators ===");
		System.out.println("Addition (a+b): " + (a + b));
		System.out.println("Subtraction (a-b): " + (a - b));
		System.out.println("Multiplication (a*b): " + (a * b));
		System.out.println("Division (a/b): " + (a / b));
		System.out.println("Modulus (a%b): " + (a % b));

		// Relational operators
		System.out.println("==== Relational Operators ===");
		System.out.println("a == b: " + (a == b));
		System.out.println("a != b: " + (a != b));
		System.out.println("a > b: " + (a > b));
		System.out.println("a < b: " + (a < b));
		System.out.println("a <= b:" + (a <= b));
		System.out.println("a >= b:" + (a >= b));

		System.out.println("=== Logical operators ===");
		boolean x = true, y = false;
		System.out.println("X && y (AND): " + (x && y));
		System.out.println("X || y (OR): " + (x || y));
		System.out.println("!x (Not): " + (!x));

		System.out.println("=== Assignment operators ===");
		int c = 10;
		c += 5; // c=c+5
		System.out.println("c +=5: " + c);
		c -= 3;
		System.out.println("c-=3: " + c);

		System.out.println("==== Unary operators ===");
		int num = 10;
		System.out.println("Original: " + num);
		System.out.println("Post-increment (num++): " + (num++));
		System.out.println("After-post-increment: " + num);
		System.out.println("Pre-increment (++num):" + (++num));

		System.out.println("=== Ternary operator ===");
		int max = (a > b) ? a : b;
		System.out.println("Maximum of a and b: " + max);

	}

}
