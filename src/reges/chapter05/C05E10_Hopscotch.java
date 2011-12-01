package reges.chapter05;

public class C05E10_Hopscotch {

	public static void main(String[] args) {
		hopscotch(0);
	}

	public static void hopscotch(int hop) {
		int num = 1;

		System.out.printf("%8d\n", num);
		for (int i = 1; i <= hop; i++) {

			System.out.printf("%4d %8d\n", ++num, ++num);
			System.out.printf("%8d\n", ++num);
		}

	}
}
