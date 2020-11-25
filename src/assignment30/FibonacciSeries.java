package assignment30;

import java.util.Scanner;

//30.	Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find fibonacci series:");
		int n = input.nextInt();
		int fib1 = 1;
		int fib2 = 1;
		System.out.print(fib1 + " ");

		for (int i = 0; i <= n; i++) {
			System.out.print(fib2 + " ");

			int fib = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib;

		}

	}

}
