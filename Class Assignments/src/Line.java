
public class Line {
	private Point p1;
	private Point p2;
	
	public Line(Point inputP1, Point inputP2) {
		this.p1 = inputP1;
		this.p2 = inputP2;
	}
	
	public Point getP1() {
		return this.p1;
	}
	
	public Point getP2() {
		return this.p2;
	}
	
	public String toString() {
		return "[(" + (int) p1.getX() + ", " + (int) p1.getY() + "), (" + (int) p2.getX() + ", " + (int) p2.getY() + ")]";

	}
	
	public double getSlope() {
		if (this.p1.getX() == this.p2.getX()) {
			throw new IllegalStateException();
		} else {
			return (double) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
		}
	}

}
