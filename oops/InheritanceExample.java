package com.oops;

//Parent class (Superclass/Base class)
class Animal {
	String name;
	int age;

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void eat() {
		System.out.println(name + " is eating");
	}

	void sleep() {
		System.out.println(name + " is sleeping");
	}

	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Child class (Subclass/Derived class)
class Dog extends Animal {
	String breed;

	Dog(String name, int age, String breed) {
		super(name, age); // Calling parent class constructor
		this.breed = breed;
	}

	// Child class specific method
	void bark() {
		System.out.println(name + " is barking: Woof! Woof!");
	}

	// Overriding parent method
	@Override
	void makeSound() {
		System.out.println(name + " barks");
	}

	void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Breed: " + breed);
	}
}

class Cat extends Animal {
	String color;

	Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public void meow() {
		System.out.println(name + "Says: Meow");
	}

	@Override
	void makeSound() {
		System.out.println(name + " meows");

	}

}
//Multilevel Inheritance

class Puppy extends Dog {
	int months;

	Puppy(String name, int age, String breed, int months) {
		super(name, age, breed);
		this.months = months;
	}

	void play() {
		System.out.println(name + " the puppy is playing ");
	}

}

public class InheritanceExample {

	public static void main(String[] args) {
		Dog dog = new Dog("Buddy",3,"Golden Retriever");
		dog.displayInfo();  
		dog.eat();				// Inherited from Animal
		dog.sleep();			// Inherited from Animal
		dog.bark();				// Dog's own method
		dog.makeSound();		// Overridden method
		
		System.out.println("age: " + dog.age);
		System.out.println("name: " +dog.name);
		
        System.out.println("\n---");
        
        
        Cat cat = new Cat("Whiskers", 2,"White");
        cat.eat();
        cat.meow();
        cat.makeSound();
        
        
        System.out.println("\n---");
        
        Puppy puppy = new Puppy("max",0,"Labrador",3);
        puppy.eat();
        puppy.bark();
        puppy.play();
        puppy.displayInfo();
        
        System.out.println(puppy.months);


		

	}

}
