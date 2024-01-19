package shapes_area_calculator;

// This is a Main class Which has 3 object of child classes.

public class Main{

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();  // object of rectangle class
		Triangle tri= new Triangle();    //  object of Triangle Class 
		Circle cir= new Circle();        //  object of Circle Class

		// Calculating the Area of all shapes given
		
		double rec1= rec.printArea(60, 5);
		double tri1= tri.printArea(10, 10);
		double cir1= cir.printArea( 5.4);

		// To Display Area of all shapes given.
		
		System.out.println("Area Of Rectangle Is = "+ rec1+ " meter Square");
		System.out.println("Area of Triangle Is ="+ tri1 + " meter Square");
		System.out.println("Area Of Circle Is = " + cir1 + " meter Square");
	}

}
