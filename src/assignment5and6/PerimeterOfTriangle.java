package assignment5and6;

import javax.swing.JOptionPane;

public class PerimeterOfTriangle {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog ("Enter side a: ");
		String b = JOptionPane.showInputDialog("Enter side b: ");
		String c = JOptionPane.showInputDialog("Enter side c: ");
		
		float perimeter = Float.parseFloat(a) + Float.parseFloat(b) + Float.parseFloat(c);
		JOptionPane.showInternalMessageDialog(null, "Perimeter of triangle is: " +perimeter) ;

	}

}
