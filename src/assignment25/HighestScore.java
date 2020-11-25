package assignment25;

import java.util.Scanner;

public class HighestScore {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number of students: ");
		int numOfStudent = input.nextInt();
		
		int maxScore = 0;
		String studentName = "";
		
		for (int i = 1; i<= numOfStudent; i++) {
			System.out.println("Enter name of Student: ");
			String name = input.next();
			
			System.out.println("Enter student's score: ");
			int score = input.nextInt();
			
			if (score > maxScore) {  
				maxScore = score;
				studentName = name;
		}
				
		}
		System.out.println("The name of student with highest score is: " + studentName);
		System.out.println("The max score is: " +maxScore);
	}

}
