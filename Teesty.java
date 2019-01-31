package Polyporphism_prac;

public class Teesty {

	public static void main(String[] args) {
		
		Shape[] s = new Shape[4];
		
		s[0] = new Shape();
		s[1] = new Circle(5.0);
	    s[2] = new Rectangle(4.5, 5.6);
		s[3] = new Triangle(12.6, 8.9);
		
		System.out.println(s[0].area());
		System.out.println(s[1].area());
		System.out.println(s[2].area());
		System.out.println(s[3].area());

	}

}
