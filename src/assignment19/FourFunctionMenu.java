package assignment19;

import java.util.Scanner;

public class FourFunctionMenu {

	public static void checkFourFunctionMenu() {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your choice between + , - , / or *");
		char choice = input.next().charAt(0);
		int a=0;
		int b=0;
		if (choice == '+'|| choice == '-' || choice =='/' || choice =='*' ) {
		switch (choice) {
		case '+' :
			System.out.println("Enter first number: ");
			System.out.println("Enter second number: ");
		    System.out.println("The sum of two number is " + (a+b));
			
			default:
				System.out.println("Wrong choice:");
				break;
			}

		}else {	
			System.out.println("More code needed......");
		}}
		
	
	public static void main(String[] args) {
		checkFourFunctionMenu();

	}

}
