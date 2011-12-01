package reges.chapter03;

import java.util.*;

public class C03E12_Vertical {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		processName(console);

	}

	public static void processName(Scanner console) {
		String firstName, lastName;

		System.out.print("Please your name and last name (no middlename please) : ");
		firstName = console.next();
		lastName = console.next();
		System.out.println();
		System.out.print("Your name in reverse order is : " + lastName + ", " + firstName);

	}

}
