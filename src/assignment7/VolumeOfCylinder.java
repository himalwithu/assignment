package assignment7;

import java.util.Scanner;

//7.	Write a program that reads the radius and length of a cylinder 
//and computes volume
public class VolumeOfCylinder {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter radius of cylinder: ");
		double r = input.nextDouble();
		
		System.out.println("Enter length of cylinder: ");
		double l = input.nextDouble();
		
		final double PI = Math.PI;
		
		double v = PI * r * r * l;
		
		System.out.println("Volume of cylinder is: " +v);
		
		input.close();
		

	}

}
