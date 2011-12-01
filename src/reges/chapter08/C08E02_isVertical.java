package reges.chapter08;

public class C08E02_isVertical {

	
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		p1.setLocation(5, 2);
		MyPoint p2 = new MyPoint();
		p2.setLocation(5, 1);
		
		if (p1.isVertical(p2)){
			System.out.print("p1 and p2 are vertical");	
		}else{
			System.out.print("p1 and p2 are not vertical");
		}
		

	}

}
