package assignment17;

import java.util.Scanner;

public class LeapYear {

	public static void checkLeapYear() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

			System.out.println("The year you entered is a Leap year.");
		} else {
			System.out.println("The year you entered is not a Leap year.");
		}

	}

	public static void main(String[] args) {
		checkLeapYear();

	}

}
