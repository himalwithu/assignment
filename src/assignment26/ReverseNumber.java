package assignment26;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number: ");
		int originalNumber = input.nextInt(); 
		
		int reverseNumber = 0;
		
		System.out.println("Original number is: " + originalNumber);
		while (originalNumber != 0) {
			int temp = originalNumber % 10;
			reverseNumber = reverseNumber *10 + temp;
			originalNumber = originalNumber / 10;
		}
		System.out.println("reversed number is: " + reverseNumber);
	}
}