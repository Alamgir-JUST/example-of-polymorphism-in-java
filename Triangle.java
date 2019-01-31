package Polyporphism_prac;

public class Triangle extends Shape{
	double base,height;
	
	Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	double area() {
		System.out.println("Area of triangle is : ");
		return base*height;
	}
}
