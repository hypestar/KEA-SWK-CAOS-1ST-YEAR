package reges.chapter08;

import java.awt.Point;

public class C08E10_getSlope {
	
	public static void main(String[] args) {
		Line line1 = new Line(new Point(1, 5), new Point(5,6));
		System.out.println("The slope of the line = " + line1.getSlope());
	}

}
