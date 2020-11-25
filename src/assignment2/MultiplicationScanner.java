package assignment2;
import java.util.Scanner;
public class MultiplicationScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int a = input.nextInt();
		System.out.println("Enter number2: ");
		int b=input.nextInt();
		int mul = a*b;
		System.out.println("Multiplication of "+a+ " and " +b+ " is: " + mul);
		input.close();

	}

}
