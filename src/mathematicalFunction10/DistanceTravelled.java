package mathematicalFunction10;

import java.util.Scanner;

public class DistanceTravelled {

	//10.	Write a Program for the following Mathematical Function.
	 // S = ut + 1/2 at^2

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter initial velocity (u) on m/s: ");
		double u = input.nextDouble();
		
		System.out.println("Enter acceleration (a) on m/s^2: ");
		double a = input.nextDouble();
		
		System.out.println("Enter time (t) on sec: ");
		double t = input.nextDouble();
		
		double S = u*t + 0.5 *a * t * t;
		
		System.out.println("Distance travelled (S): " +S + " m");
input.close();
	}

}
