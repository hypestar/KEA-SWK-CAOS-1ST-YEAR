package reges.chapter08;

import java.awt.Point;

public class C08E15_RectangleContains {

	public static void main(String[] args) {
		Point p = new Point(6, 6);
		Rectangle rect = new Rectangle(0,0, 20, 50);
		
		if (rect.contains(p)){
			System.out.println("rect contains Point(6, 6)");
		}else{
			System.out.println("rect doesn't contain Point(6, 6)");
		}
		
		if (rect.contains(15,51)){
			System.out.println("rect contains the coordinate (15, 51)");
		}else{
			System.out.println("rect doesn't contain the coordinate (15, 51)");
		}
		
		System.out.print(rect);
	}

}
