
public class Point {
	private int x;
	private int y;
	
	// exercise 8.1
	public int quadrant() {
		if (x == 0 | y ==0) {
			return 0;
		} else if (x > 0 & y >0) {
			return 1;
		} else if (x < 0 & y > 0) {
			return 2;
		} else if (x < 0 & y < 0) {
			return 3;
		} else {
			return 4;
		}
	}
	
	// exercise 8.2
	public void flip() {
		int temp = x;
		this.x = y * -1;
		this.y = temp * -1;
	}
	
	// exercise 8.3
	public int manhattanDistance(Point other) {
		int deltax = Math.abs(this.x - other.getX());
		int deltay = Math.abs(this.y - other.getY());
		return deltax + deltay;
	}
	
	
	// construct new point at origin (0,0)
	
	public Point() {
		this(0,0);
	}
	
	// constructs a new point with given (x , y) location
	public Point(int x, int y) {
		setLocation(x,y);
	}
	
	// returns the distance between this point and (0, 0)
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}
	
	// returns the x-coordinate of this point
	public int getX() {
		return x;
	}
	
	// returns the y-coordinate of this point
	public int getY() {
		return y;
	}
	
	// set this point's (x, y) location to the given values
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// returns a String representation of this point
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	// shifts this point's location by the given amount
	public void translate(int dx, int dy) {
		setLocation(x + dx, y + dy);
	}
	
}
