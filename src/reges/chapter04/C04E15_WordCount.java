package reges.chapter04;

import java.util.*;

public class C04E15_WordCount {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double x, y;

		System.out.print("Enter x value (double) : ");
		x = console.nextDouble();
		System.out.print("Enter y value (double) : ");
		y = console.nextDouble();
		System.out.print("The point : (" + x + "," + y + ")" + " is in Quadrant " + quadrant(x, y));
	
	}

	public static int quadrant(double x, double y) {
		int quadrantNum = 0;
		if (x > 0 && y > 0){
			quadrantNum = 1;
		}else if (x < 0 && y > 0) {
			quadrantNum = 2;
		}else if (x < 0 && y < 0) {
			quadrantNum = 3;
		}else if (x > 0 && y < 0) {
			quadrantNum = 4;
		}
		
		return quadrantNum;
	}
}
