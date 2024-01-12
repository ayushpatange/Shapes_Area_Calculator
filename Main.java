package shapes_area_calculator;

public class Main{

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		Triangle tri= new Triangle();
		Circle cir= new Circle();

		double rec1= rec.printArea(60, 5);
		double tri1= tri.printArea(10, 10);
		double cir1= cir.printArea( 5.4);
		
		System.out.println("Area Of Rectangle Is = "+ rec1+ " meter Square");
		System.out.println("Area of Triangle Is ="+ tri1 + " meter Square");
		System.out.println("Area Of Circle Is = " + cir1 + " meter Square");
	}

}
