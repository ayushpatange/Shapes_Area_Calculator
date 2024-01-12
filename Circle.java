package shapes_area_calculator;

public class Circle extends Shapes  {
	
	static double pie= 3.14;
	double radius;
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
