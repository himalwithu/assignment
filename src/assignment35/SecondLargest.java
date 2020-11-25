package assignment35;

import java.util.Scanner;

//35.	Write a function to find the second largest number in a given array.
public class SecondLargest {

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
		System.out.print("Given elements of array in ascending order: ");
		for (int i = 0; i < asc.length; i++) {
			System.out.print(asc[i] + ",");
		}
		System.out.println();
		System.out.println("Second largest number in the given array is:" + asc[asc.length - 2]);
	}
}
