package assignment5and6;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	
		System.out.println("Enter base : ");
		double b = input.nextDouble();
		
		System.out.println("Enter height");
		double h = input.nextDouble();
		
		double a = 0.5 * b * h ;
		
		System.out.println("Area of triangle is: " +a);
input.close();
	}

}
