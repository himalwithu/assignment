package assignment24;

import java.util.Scanner;

public class Factorial {

	
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			System.out.println("Enter number: ");
			int number = input.nextInt();
			
			int factorial = 1;
			
			for (int i = 1; i<=number; i++) {
				
				factorial = i*factorial;
				
			}
			System.out.println("factorial of " + number + " is: " + factorial);
		}

	}