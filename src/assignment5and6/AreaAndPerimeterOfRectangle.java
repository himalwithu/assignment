package assignment5and6;

import javax.swing.JOptionPane;

public class AreaAndPerimeterOfRectangle {

	public static void main(String[] args) {
		
	String l = JOptionPane.showInputDialog("Enter length: ");
	String b = JOptionPane.showInputDialog("Enter breadth: ");
	
	double a = Double.parseDouble(l) * Double.parseDouble(b);
	double p = 2* (Double.parseDouble (l) + Double.parseDouble(b));
	System.out.println("Area of a rectangle: " +a);
	System.out.println("Perimeter of a rectangle: " +p);
		
		
	}
}
