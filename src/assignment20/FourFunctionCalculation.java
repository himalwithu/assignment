package assignment20;
import java.util.Scanner;
public class FourFunctionCalculation {

/*20.	Write a program to create the equivalent of a four-function calculator. 
The program to enter two integer’s numbers and an operator. It then carries out 
the specified arithmetic operator operation: addition, subtraction, multiplication 
or division of the two numbers. Finally, it displays the result. */

public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("Enter your choice between + , - , / or *");
char choice = input.next().charAt(0);

if (choice == '+'|| choice == '-' || choice =='/' || choice =='*' ) {
	System.out.println("Enter first number: ");
	int a = input.nextInt();
	System.out.println("Enter second number: ");
	int b = input.nextInt();
	
switch (choice) {
case '+' :
	 System.out.println("The sum of two number is " + (a+b));
break;
	 
	
case '-' :
    System.out.println("The difference of two number is " + (a-b));
    break;

case '/' :
    System.out.println("The division of two number is " + (a/b));
    break;

case '*' :
    System.out.println("The multiplication of two number is " + (a*b));
    break;

default:
		System.out.println("Wrong choice:");
		break;
	}

}else {	
	System.out.println("More code needed......");
}}}
	


