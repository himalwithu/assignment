package assignment16;

import java.util.Scanner;

public class EvenOrOdd {

	public static void checkEvenOrOdd() {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number to see even or odd: ");
		int a = input.nextInt();
		if (a%2==0) {
			System.out.println("The entered number is even.");
		}else {
				System.out.println("The entered number is odd.");
			}
		}
	public static void main(String[] args) {
		checkEvenOrOdd();
	}

}
