package Polyporphism_prac;

public class Circle extends Shape{
	
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}

	double area() {
		double p = Math.PI;
		
		System.out.println("Area of circle is : ");
		
		return p*radius*radius;
	}
}
