package com.collections;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		  TreeMap<Integer, String> map = new TreeMap<>();

	        map.put(3, "Java");
	        map.put(1, "Python");
	        map.put(2, "C++");

	        System.out.println("Map: " + map);

	        System.out.println("Get key 2: " + map.get(2));

	        System.out.println("First Key: " + map.firstKey());
	        System.out.println("Last Key: " + map.lastKey());

	        System.out.println("Higher than 1: " + map.higherKey(1));
	        System.out.println("Lower than 3: " + map.lowerKey(3));

	        map.pollFirstEntry();
	        System.out.println("After pollFirst: " + map);

	        map.remove(2);
	        System.out.println("After remove: " + map);

	}

}
