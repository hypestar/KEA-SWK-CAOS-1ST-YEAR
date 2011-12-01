package reges.chapter08;

public class C08E01_manhattanDistance {

	
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		p1.setLocation(4, -4);
		MyPoint p2 = new MyPoint();
		p2.setLocation(1, -1);
		
		System.out.print(p1.manhattanDistance(p2));

	}

}
