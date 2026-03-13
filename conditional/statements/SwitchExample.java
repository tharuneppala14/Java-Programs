package com.conditional.statements;

public class SwitchExample {

	public static void main(String[] args) {
		int day = 3;
		String dayName;

		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid day";

		}
		System.out.println("Day: " + dayName);

		// switch with characters

		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Good!");
			break;
		case 'C':
			System.out.println("Average");
			break;
		case 'D':
			System.out.println("Below Average");
			break;
		default:
			System.out.println("Invalid grade");

		}

		// Switch with Strings

		String month = "January";
		switch (month) {
		case "January":
		case "February":
		case "December":
			System.out.println("Winter month");
			break;
		case "March":
		case "April":
		case "May":
			System.out.println("Spring month");
			break;
		default:
			System.out.println("Rainy Month");

		}

	}

}
