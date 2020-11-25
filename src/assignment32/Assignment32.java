package assignment32;

import java.util.Scanner;

public class Assignment32 {

	public static void main(String[] args) {

// Option 1: With given value	:
		int[] option1 = new int[5];
		option1[0] = 1;
		option1[1] = 2;
		option1[2] = 3;
		option1[3] = 4;
		option1[4] = 5;

		int sum1 = option1[0] + option1[1] + option1[2] + option1[3] + option1[4];

		System.out.println("Sum of given 5 array using option 1: " + sum1);

// Option 2: asking user to enter value using scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size = input.nextInt();
		int option2[] = new int[size];

		int sum2 = 0;
		for (int i = 0; i < option2.length; i++) {
			System.out.println("Enter elements: ");
			option2[i] = input.nextInt();

		}

		for (int i = 0; i < option2.length; i++) {

			sum2 = sum2 + option2[i];
		}
		System.out.println("Sum of given array using option 2: " + sum2);
	}
}
