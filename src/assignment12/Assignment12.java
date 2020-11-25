package assignment12;

//12.	Write a program to accept the roll, name, and nationality of the person 
//and display those values in good format.
import javax.swing.JOptionPane;
public class Assignment12 {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Enter roll: ");
		int r = Integer.parseInt (a);
		
		String b = JOptionPane.showInputDialog("Enter name: ");
		String c = JOptionPane.showInputDialog("Enter nationality: ");
		
		System.out.println("Roll number = " +r);
		System.out.println("Name = " +b);
		System.out.println("Nationality = " +c);
		
		
	}

}
