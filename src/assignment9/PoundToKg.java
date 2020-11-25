package assignment9;

import java.util.Scanner;

public class PoundToKg {

	public static void main(String[] args) {
		/*9.	Write a program that converts pounds into kg. 
			The program prompts the user to enter a number of pounds, 
			converts it to kg and displays the result [1 pound is 0.454 kg].*/
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of pounds: ");
		double lb = input.nextDouble();
		
		double kg = 0.454 * lb;
		
		System.out.println(lb+" pound is "+kg+" kg");
		input.close();
		
	
	}

}
