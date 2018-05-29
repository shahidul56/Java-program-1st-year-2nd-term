package Labtest;



public class squre extends Shape {

	double arm;
	
	public squre(String color, double arm) {
		super(color);
		this.arm=arm;
	}
	

public double getArea(double arm) {
	
	return area = arm*arm;
}


public String toString() {
	
	return super.toString()+" "+"Area of Square: "+ area;
}
	
}
