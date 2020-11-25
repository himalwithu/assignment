package assignment8;

import java.util.Scanner;

public class FerenheitToCelcius {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter temperature in Ferenheit: ");
		float f = input.nextFloat();
		float c = ((f-32)*5)/9;
		System.out.println("Temperature in celcius is: " +c);
input.close();
	}

}
