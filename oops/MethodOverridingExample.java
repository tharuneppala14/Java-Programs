package com.oops;

class Shape {
	String color;

	Shape(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println("Drawing a shape");
	}

	public double calculateArea() {
		return 0.0;
	}

	public void displayColor() {
		System.out.println("Color: " + color);
	}
}

class Circle extends Shape {
	double radius;

	Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle with radius: " + radius);
	}

	@Override
	public double calculateArea() {
		return 3.14159 * radius * radius;
	}

	public void draw1() {
		System.out.println("Drawing a circle with radius: " + radius);
	}

}

class Rectangle extends Shape {
	double length;
	double width;

	Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle: " + length + " x " + width);
	}

	@Override
	public double calculateArea() {
		return length * width;
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		Shape shape1 = new Circle("Red", 5.0);
		Shape shape2 = new Rectangle("Blue", 10.0, 5.0);

		System.out.println(shape1.color);
		shape1.draw();
		System.out.println("Area: " + shape1.calculateArea());

		System.out.println(shape2.color);
		shape2.draw();
		System.out.println("Rectangele: " + shape2.calculateArea());

	}

}
