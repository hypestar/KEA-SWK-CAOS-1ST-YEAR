package reges.chapter03;

import java.util.*;

public class C03E13_PrintReverse {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a string and press enter : ");
		System.out.println("Reverse string looks like this : "
				+ getReverse(console.nextLine()));

	}

	public static String getReverse(String s) {
		String reverse = new String();

		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;

	}
}
