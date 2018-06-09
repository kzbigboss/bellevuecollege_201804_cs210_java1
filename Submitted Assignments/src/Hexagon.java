/*
 * Mark Kazzaz
 * 2018-06-05
 * Bellevue College, CS210
 * Chapter 8 Quiz
 */

public class Hexagon {
	
	// define fields
	private Point center;
	private double side;
	
	// define constructors; default + specific
	// ---default constructor
	public Hexagon() {
		this(new Point(0,0), 0.0);
	}
	
	// ---specific constructor
	public Hexagon(Point c, double s) {
		this.center = c;
		this.side = s;
	}
	
	// accessors
	public Point getCenter() {
		return this.center;
	}
	
	public double getSide() {
		return this.side;
	}
	
	public double area() {
		return Math.pow(side, 2) * ( (3 * Math.sqrt(3)) / 2);
	}
	
	public double perimeter() {
		return side * 6.0;
	}
	
	// mutators
	public void setCenter(Point c) {
		this.center = c;
	}
	
	public void setSide(double s) {
		this.side = s;
	}
	

}
