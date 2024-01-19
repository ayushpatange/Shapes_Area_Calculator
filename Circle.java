package shapes_area_calculator;

// This is a child class named as circle. It has abstract method inherited from Class Shapes.
public class Circle extends Shapes  {
	
	static double pie= 3.14;
	double radius;
	// This method calculate Area of a circle by taking radius as parameter.
	double printArea( double radius) {
		double area= pie*(radius*radius);
		return area;
		
	}
	@Override
	double printArea() {
		// TODO Auto-generated method stub
		return 0;
		}
}
