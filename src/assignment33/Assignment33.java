package assignment33;

import java.util.Scanner;

public class Assignment33 {
//33.	Write a Program to display numbers in ascending order in array
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = input.nextInt();

		int asc[] = new int[size];
		System.out.println("Enter array elements: ");

		for (int i = 0; i < asc.length; i++) {
			asc[i] = input.nextInt();
		}

		for (int i = 0; i < asc.length; i++) {
			for (int j = 0; j < asc.length; j++) {
				int temp;
				if (asc[j] > asc[i]) {
					temp = asc[i];
					asc[i] = asc[j];
					asc[j] = temp;
				}
			}
		}
		System.out.println("Array elements in ascending order is: ");

		for (int i = 0; i < (asc.length - 1); i++) {
			System.out.print(asc[i] + ", ");
		}
		System.out.print(asc[asc.length - 1]);
	}

}
