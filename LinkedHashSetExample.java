package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		 LinkedHashSet<String> set = new LinkedHashSet<>();

	        set.add("Java");
	        set.add("Python");
	        set.add("C++");
	        set.add("Java"); // duplicate

	        System.out.println(set);

	}

}
