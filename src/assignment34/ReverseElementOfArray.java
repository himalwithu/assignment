package assignment34;

import java.util.Scanner;

public class ReverseElementOfArray {
//34.	Write a program to reverse the element of an array.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = input.nextInt();

		int org[] = new int[size];
		System.out.println("Enter array elements: ");

		for (int i = 0; i < org.length; i++) {
			org[i] = input.nextInt();
		}
		System.out.println("Array elements before reversing is: ");
		for (int i = 0; i < org.length; i++) {
			System.out.print(org[i] + ",");
		}
		System.out.println();
		System.out.println("Array elements after reversing is: ");
		for (int i = org.length - 1; i >= 0; i--) {
			System.out.print(org[i] + ",");
		}
	}

}
