-package com.strings;

public class StringExample {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World"; // String literal(Stored in string pool)
		String str3 = new String("hello"); // Using new keyword (stored in heap)

		System.out.println("=== String Creation ===");
		System.out.println("str1: " + str1);
		System.out.println("str3:" + str3);

		// String Concatenation
		System.out.println("\n=== Concatenation ===");
		String str4 = str1 + " " + str2;
		System.out.println("Concatenation: " + str4);
		String str5 = str1.concat("").concat(str2);
		System.out.println("using concat(): " + str5);

		// Length
		System.out.println("\n=== Length ===");
		System.out.println("Length of " + str4 + ": " + str4.length());

		// Character at index
		System.out.println("/n=== Character access ===");
		System.out.println("Character at index 0: " + str4.charAt(0));
		System.out.println("Character at index 6: " + str4.charAt(6));

		// Substring
		System.out.println("\n=== Substring ===");
		System.out.println("Substring(0,5): " + str4.substring(0, 5));
		System.out.println("Substring(6): " + str4.substring(6));

		// Case conversion
		System.out.println("\n=== Case Conversion");
		System.out.println("Uppercase: " + str4.toUpperCase());
		System.out.println("Lowercase: " + str4.toLowerCase());

		// Trim(removes leading and trailing whitespace)
		System.out.println("\n=== Trim ===");
		String str6 = "  Hello world   ";
		System.out.println("original: " + str6);
		System.out.println("trimmed: '" + str6.trim() + "'");

		// Starts with and ends with
		System.out.println("\n=== Starts/Ends With ===");
		System.out.println("Starts with 'Hello': " + str4.startsWith("Hello"));
		System.out.println("Ends with 'World':" + str4.endsWith("World"));

		// Replace
		System.out.println("\n=== Replace ===");
		System.out.println("Replace 'World' with 'Java': " + str4.replace("World", "Java"));
		System.out.println("Replace all 'l' with 'L': " + str4.replace('l', 'L'));

		// Split
		System.out.println("/n=== Split ===");
		String sentence = "Java is a programming language";
		String[] words = sentence.split(" ");
		System.out.println("Words in sentence:");
		for (String word : words) {
			System.out.print("- " + word);

		}
		  // Contains
        System.out.println("\n=== Contains ===");
        System.out.println("Contains 'World': " + str4.contains("World"));
        System.out.println("Contains 'Java': " + str4.contains("Java"));

     // Index of
        System.out.println("\n=== Index Of ===");
        System.out.println("Index of 'World': " + str4.indexOf("World"));
        System.out.println("Index of 'l': " + str4.indexOf('l'));
        System.out.println("Last index of 'l': " + str4.lastIndexOf('l'));
        
        // Equals and EqualsIgnoreCase
        System.out.println("\n=== Comparison ===");
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));
        
        // CompareTo (lexicographical comparison)
        System.out.println("\n=== CompareTo ===");
        System.out.println("'Apple'.compareTo('Banana'): " + "Apple".compareTo("Banana"));
        System.out.println("'Banana'.compareTo('Apple'): " + "Banana".compareTo("Apple"));
        System.out.println("'Apple'.compareTo('Apple'): " + "Apple".compareTo("Apple"));
        
        // IsEmpty and isBlank
        System.out.println("\n=== Empty/Blank Check ===");
        String empty = "";
        String blank = "    ";
        System.out.println("Empty string isEmpty(): " + empty.isEmpty());
        System.out.println("Blank string isEmpty(): " + blank.isEmpty());
        System.out.println("Blank string isBlank(): " + blank.isBlank());
        
     // Join (Java 8+)
        System.out.println("\n=== Join ===");
        String joined = String.join("-", "2024", "11", "18");
        System.out.println("Joined string: " + joined);
		// Format
		System.out.println("\n=== Format ===");
		String formatted = String.format("Name: %s,Age: %d, Grade: %.2f", "Tharun", 20, 85.5);
		System.out.println(formatted);
		
		// Immutability demonstration
        System.out.println("\n=== Immutability ===");
        String original = "Hello";
        System.out.println("Original: " + original);
        original.concat(" World");  // This doesn't change original
        System.out.println("After concat (not assigned): " + original);
        original = original.concat(" World");  // Need to reassign
        System.out.println("After concat (assigned): " + original);
	}

}
