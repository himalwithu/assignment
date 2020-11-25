package Question14;

import java.util.Scanner;

/*14.Write a program to relate two integers entered by the user 
using = =or > or < sign. */

public class Integer {

	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);
System.out.println("enter a:");
int a = input.nextInt();
System.out.println("Enter b:");
int b = input.nextInt();

if (a==b) {
	System.out.println("a and b are equal.");
}
if (a<b) {
	System.out.println("a is less than b.");
}

if (a>b) {
	System.out.println("a is greater than b.");
	
	input.close();
}
	}
}

