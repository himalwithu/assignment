package assignment19;
import java.util.Scanner;
public class TypesOfTriangle {
//more info: Day 10 video at 8 min
	public static void checkTypesOfTriangle () {
		Scanner input= new Scanner (System.in);
		System.out.println("Enter side a of triangle: ");
		int a = input.nextInt();
		System.out.println("Enter side b of triangle: ");
		int b = input.nextInt();
		System.out.println("Enter side c of triangle: ");
		int c = input.nextInt();
		
		if ((a==b) && (b==c)){
			System.out.println("Equilateral triangle.");
		}else if ((a==b) || (a==c) || (b==c)) {
			System.out.println("Isocelis triangle.");
		}else {
			System.out.println("Scalen triangle");
		}	
		}
	
	public static void main(String[] args) {
	checkTypesOfTriangle();	

	}

}
