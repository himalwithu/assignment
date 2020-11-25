package swapAssignment11;

import java.util.Scanner;

public class WithoutVariable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Value of a after swap: " +a);
		System.out.println("Value of b after swap: " +b);
		
		input.close();

	}

}
