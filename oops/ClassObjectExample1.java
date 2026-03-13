package com.oops;

class Student {
	// Attributes
	String name;
	int age;
	String grade;
	double gpa;

	// Constructor - special method
	Student(String name, int age, String grade, double gpa) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.gpa = gpa;

	}

	Student() {
		this.name = "UnKnown";
		this.age = 0;
		this.grade = "N/A";
		this.gpa = 0.0;

	}

	// Method to display student information
	public void displayStudentInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Grade: " + grade);
		System.out.println("GPA: " + gpa);
		System.out.println("------");
	}

	// Method to check if student is honor student
	boolean isHonorStudent() {
		return gpa >= 3.5;
	}

	// Method to update GPA
	void updateGPA(double newGPA) {
		this.gpa = newGPA;
		System.out.println("GPA updated to: " + newGPA);
	}

}

public class ClassObjectExample1 {

	public static void main(String[] args) {

		// creating objects(instances of Student class)
		Student student1 = new Student("Tharun", 25, "A", 3.8);
		Student student2 = new Student("Krishna", 23, "B", 3.2);
		Student student3 = new Student();

		if (student1.isHonorStudent()) {
			System.out.println(student1.name + " is an honor student!");
		}
		if (student2.isHonorStudent()) {
			System.out.println(student2.name + " is an honor student!");
		}
		else {
			System.out.println(student2.name + " is not a honor student!");
		}
		
		student2.updateGPA(3.9);
		student2.displayStudentInfo();
		student3.displayStudentInfo();

	}

}
