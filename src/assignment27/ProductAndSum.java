package assignment27;

import java.util.Scanner;

public class ProductAndSum {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number: ");
		int originalNumber = input.nextInt(); 
		
		int sum = 0;
		int product = 1;
		
		System.out.println("Original number is: " + originalNumber);
		while (originalNumber != 0) {
			int temp = originalNumber % 10;
			sum = sum + temp;
			product = product * temp;
			
			originalNumber = originalNumber / 10;
		}
		System.out.println("sum of entered number is: " + sum);
		System.out.println("product of entered number is: " + product);

}

}


