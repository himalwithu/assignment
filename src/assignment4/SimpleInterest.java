package assignment4;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		/*4.	Write a program to calculate Simple Interest input by the user. 
		 Simple Interest = P*T*R/100 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Principal: ");
		double p = input.nextDouble();
		
		System.out.println("Enter Time in years: ");
		double t=input.nextDouble();
		
		System.out.println("Enter rate:");
		double r = input.nextDouble();
		
		double si = p*t*r/100;
		
		System.out.println("Simple Interest is: " +si );
		input.close();

		
	}

}
