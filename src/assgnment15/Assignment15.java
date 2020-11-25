package assgnment15;
//another method: look at day 9 video at the end
import java.util.Scanner;

public class Assignment15 {
/*15.Write a program that receives an ASCII code (between 0 – 128) 
and display its character [example: 97 (input) ->a(output)].*/
	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		System.out.println("Enter ASCII code between 0 to 128: ");
		int a = input.nextInt();
		
		System.out.println("The corresponding character is: " + (char)a);

	}

}
