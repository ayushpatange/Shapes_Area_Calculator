package shapes_area_calculator;

public class Triangle extends Shapes {

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
