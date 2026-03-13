package com.oops;

class Calculator {
	// method 1: Add two integers
	public int add(int a, int b) {
		System.out.println("Adding two integers");
		return a + b;
	}

	// method 2: Add three integers //different numbers taken 3
	public int add(int a, int b, int c) {
		System.out.println("Adding Three integers");
		return a + b + c;
	}

	// method 3 : Add two doubles
	public double add(double a, double b) {
		System.out.println("Adding two doubles");
		return a + b;
	}

	// Method 4: Add two strings (concatenation)
	public String add(String a, String b) { // Different types
		System.out.println("Concatenating Strings");
		return a + b;

	}
	// Method 5: Different order of parameters

	public void display(int a, String b) {
		System.out.println("Integer: " + a + ", String: " + b);

	}

	public void display(String b, int a) {
		System.out.println("String: " + b + ", Integer: " + a);
	}

}

class Area {
	// Area of circle
	public double calculateArea(double radius) {
		return 3.14159 * radius * radius;
	}

	// Area of Rectangle
	public double calculateArea(double length, double width) {
		return length * width;
	}

	// Area of triangle
	public double calculateArea(double base, double height, boolean isTriangle) {
		return 0.5 * base * height;

	}

}

public class MethodOverloadingExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		// Calling overloaded methods
		System.out.println("Result: " + calc.add(10, 20));
		System.out.println("Result: " + calc.add(10, 20, 30));
		System.out.println("Result: " + calc.add(10.5, 20.5));
		System.out.println("Result: " + calc.add("Hello", " World"));

		System.out.println();

		calc.display(100, "Test");
		calc.display("Test", 100);

		System.out.println("\n--- Area Calculator ---");

		Area areaclac = new Area();
		System.out.println("Cricle Area: " + areaclac.calculateArea(5.0));
		System.out.println("Rectangle Area: " + areaclac.calculateArea(10.0, 5.0));
		System.out.println("Triangle Area: " + areaclac.calculateArea(10.0, 5.0, true));

	}

}
