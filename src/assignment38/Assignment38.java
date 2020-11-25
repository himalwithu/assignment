package assignment38;
//38.	Write a program to check whether a given string is palindrome or not.
import java.util.Scanner;
public class Assignment38 {

	public static void main(String[] args) {
		String s1, s2 = "";
	      Scanner input = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      s1 = input.next();
	 
	      for ( int i = s1.length() - 1; i >= 0; i-- )
	         s2 = s2 + s1.charAt(i);
	 
	      if (s1.equals(s2)) {
	         System.out.println("Given word is a palindrome");
	      }else {
	         System.out.println("Given word is not a palindrome");
	 
	   }
	}
}







