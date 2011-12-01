package reges.chapter08;

 class C08E17_RectangleIntersection {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5, 5, 10, 10);
		Rectangle rect2 = new Rectangle(0, 0, 10, 10);

		System.out.println("rect1 = " + rect1);
		System.out.println("rect2 = " + rect2);
		System.out.println("intersection rectangle = " + rect1.intersection(rect2));
	}
}


