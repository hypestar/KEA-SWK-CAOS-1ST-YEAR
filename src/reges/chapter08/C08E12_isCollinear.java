package reges.chapter08;

import java.awt.Point;

public class C08E12_isCollinear {
	
	public static void main(String[] args) {
		Line line1 = new Line(0, 5, 5, 10);
		Point p = new Point(10, 15);
		if (line1.isCollinear(p)){
			System.out.println("Point p and line1 are collinear");	
		}else{
			System.out.println("Point p and line1 are not collinear");
		}
		
	}
}
