package assignment22;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number to display multiplication table:");
		int number = input.nextInt();
		
		for (int i = 1; i<=10; i++) {
			int table = number * i;
			System.out.println(number + " X " + i  + " = " + table);
		}

	}

}
