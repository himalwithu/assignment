package assignment21;

import java.util.Scanner;

public class NameOfTheDay {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your choice between 1 through 7: ");
		int number = input.nextInt();
		
		switch(number) {
		case 1: 
			System.out.println("Sunday.");
			break;
			
		case 2: 
			System.out.println("Monday.");
			break;
			
		case 3: 
			System.out.println("Tuesday.");
			break;
			
		case 4: 
			System.out.println("Wednesday.");
			break;
			
		case 5: 
			System.out.println("Thursday.");
			break;
			
		case 6: 
			System.out.println("Friday.");
			break;
			
		case 7: 
			System.out.println("Saturday.");
			break;
			
			default:
				System.out.println("You entered wrong choice.");
				break;
		}
			
		}

	}

