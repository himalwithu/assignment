package assignment8;

import java.util.Scanner;

public class CelciusToFerenheit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter temperature in Celcius: ");
		double c = input.nextDouble();
		double f = 1.8 * c + 32;
		System.out.println("Temperature in Ferenheit is: " +f);

input.close();

	}

}
