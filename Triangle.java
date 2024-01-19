package shapes_area_calculator;

// This is a child class named as Triangle has abstract method inherited from Class Shapes.

public class Triangle extends Shapes {

	// Method to calculate area of triangle . It take two parameter lenght and breadth.
	
	double printArea(double lenght, double breadth) {
		double area= (lenght*breadth)/2;
		return area;
	}

	@Override
	double printArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}
