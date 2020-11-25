package assignment18;

import java.util.Scanner;

public class LargestNumber {

	public static void checkLargestNumber() {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter any number a: ");
		int a = input.nextInt();
		System.out.println("Enter any number b: ");
		int b = input.nextInt();
		System.out.println("Enter any number c: ");
		int c = input.nextInt();
		
		if ((a>b) && (b>c)) {
			System.out.println(a + " is largest number.");
		}
		else if ((b>c) && (b>a)) {
			System.out.println(b + " is largest number.");
		}
		else {
			System.out.println(c + " is largest number");
		}		
	}
	public static void main(String[] args) {
		
		checkLargestNumber();
			
	}
	}




	


