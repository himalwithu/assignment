package assignment2;
import java.util.Scanner;
public class DivisionScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int a = input.nextInt();
		System.out.println("Enter number2: ");
		int b=input.nextInt();
		double div = (float) a/b;
		System.out.println("Division of "+a+ " and " +b+ " is: " + div);
		input.close();

	}

}
