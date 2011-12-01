package reges.chapter08;

public class C08E03_slope {

	
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		p1.setLocation(5, 2);
		MyPoint p2 = new MyPoint();
		p2.setLocation(6, 1);
		
		System.out.print("The slope is = " + p1.slope(p2));
		
		

	}

}
