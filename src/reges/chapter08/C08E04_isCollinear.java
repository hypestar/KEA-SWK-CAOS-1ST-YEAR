package reges.chapter08;

public class C08E04_isCollinear {


	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		p1.setLocation(1, 2);
		MyPoint p2 = new MyPoint();
		p2.setLocation(2, 4);
		MyPoint p3 = new MyPoint();
		p3.setLocation(3, 6);

		if(p1.isCollinear(p2, p3)){
			System.out.print("p1, p2, and p3 are collinear");
		}else{
			System.out.print("p1, p2, and p3 are not collinear");
		}
	}

}
