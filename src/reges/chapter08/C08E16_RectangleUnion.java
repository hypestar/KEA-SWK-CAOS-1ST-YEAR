package reges.chapter08;

 class C08E16_RectangleUnion {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(0,0, 20, 20);
		Rectangle rect2 = new Rectangle(1,1, 20, 20);

		System.out.println("rect1 = " + rect1);
		System.out.println("rect2 = " + rect2);
		System.out.println("union rectangle = " + rect1.union(rect2));
	}
}


