package shapes_area_calculator;

// This is a child class named as Rectangle. It has abstract method inherited from Class Shapes.

public class Rectangle extends Shapes{

	// Method to calculate Area of rectangle. Its take lenght and breadth as parameter.
	
	double printArea(double lenght, double breadth) {
		double area= lenght*breadth;
		return area;
	}

	@Override
	double printArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	}
