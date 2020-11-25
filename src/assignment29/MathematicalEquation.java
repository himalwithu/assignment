package assignment29;

import java.util.Scanner;
//29.	Write a Program for the following Mathematical of series sum divided by factorial.

public class MathematicalEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find series sum: ");
		int n = input.nextInt();

		int fact = 1;
		double sum = 0;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			sum = sum + (i / fact);
		}
		System.out.println("The value of a is :" + sum);
	}
}
