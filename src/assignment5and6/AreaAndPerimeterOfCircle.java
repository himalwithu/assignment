package assignment5and6;

import java.util.Scanner;

public class AreaAndPerimeterOfCircle {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in) ;
		
		System.out.println("Enter radius: ");
		double r = input.nextDouble ();
		
		final double PI = Math.PI;
		
		double areaOfCircle = PI * r *r;
		double perimeter = 2 * PI * r;
		
		System.out.println("Area fo circle is : " +areaOfCircle);
		System.out.println("Perimeter of a circle is: " + perimeter);
		input.close();
	}

}
