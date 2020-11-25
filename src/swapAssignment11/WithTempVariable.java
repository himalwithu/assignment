package swapAssignment11;
import java.util.Scanner;
public class WithTempVariable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Enter a: ");
		int a = input.nextInt();
		
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
      int temp;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Result of a after swap: " +a);
		System.out.println("Result of b after swap: " +b);
		
		input.close();
		
		

	}

}
