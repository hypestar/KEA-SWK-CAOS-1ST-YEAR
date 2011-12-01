package reges.chapter08;

import java.awt.Point;

public class Line {
	private Point p1, p2;

	public Line() {
		this(new Point(0, 0), new Point(1, 1));
	}

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Line(int x1, int y1, int x2, int y2) {
		this(new Point(x1, y1), new Point(x2, y2));
	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	@Override
	public String toString() {
		return "[(" + p1.x + ", " + p1.y + "), (" + +p2.x + ", " + p2.y + ")]";

	}

	public double getSlope() {
		return (double) (p2.y - p1.y) / (double) (p2.x - p1.x);
	}

	public double getSlope(Point p1, Point p2) {
		return (double) (p2.y - p1.y) / (double) (p2.x - p1.x);
	}

	public boolean isCollinear(Point p) {
		if ((p.x == p1.x) && (p.x == p2.x)) { // vertical line
			return true;
		}

		if (getSlope(p, p1) == getSlope() && getSlope(p, p2) == getSlope()) {
			return true;
		}
		return false;
	}
}
