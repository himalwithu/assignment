package assignment36;

import java.util.Scanner;

//36.	Write a function to find duplicate elements in an array.
public class Assignment36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = input.nextInt();

		int dup[] = new int[size];
		System.out.println("Enter array elements: ");

		for (int i = 0; i < dup.length; i++) {
			dup[i] = input.nextInt();
		}
		System.out.print("Any Duplicate elements? ");
		int counter = 0;
		for (int i = 0; i < dup.length; i++) {
			for (int j = i + 1; j < dup.length; j++) {
				if (dup[i] == dup[j]) {
					System.out.print(dup[j] + ",");
					counter++;

				}

			}

		}
		if (counter == 0) {
			System.out.print("No Duplicate present.");

		}

	}
}
