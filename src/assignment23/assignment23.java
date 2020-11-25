package assignment23;
import java.util.Scanner;

public class assignment23 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i<=number; i++) {
			
			sum = i+sum;
			
		}
		System.out.println("Sum of " + number +"th is:" + sum);
	}

}
