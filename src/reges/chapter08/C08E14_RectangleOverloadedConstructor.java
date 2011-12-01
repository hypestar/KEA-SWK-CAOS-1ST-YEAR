package reges.chapter08;

import java.awt.Point;

public class C08E14_RectangleOverloadedConstructor {

	public static void main(String[] args) {
		Point p = new Point(6, 6);
		Rectangle rect = new Rectangle(p, 20, 50);
		System.out.print(rect);
	}

}
