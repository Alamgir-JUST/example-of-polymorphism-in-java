package Polyporphism_prac;

public class Rectangle extends Shape{
	double length,width;
	
	Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	double area() {
			System.out.println("Area of rectangle is : ");
			return (length*width);
		}
	
}
