package assignment2;

/* 3.	Write a program to find sum and average of two numbers 
input by User (using Scanner class). */

import java.util.Scanner;

public class Average_Scanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int a = input.nextInt();
		System.out.println("Enter number2: ");
		int b=input.nextInt();
		int sum = a+b;
		float avg = (float) sum/2;
		System.out.println("Sum of "+a+ " and " +b+ " is: " + sum);
		System.out.println("Average of "+a+ " and " +b+ " is: " + avg);
		input.close();


	}

}
