package reges.chapter04;

import java.util.*;

public class C04E13_PrintPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		printPalindrome(console);
	}

	public static void printPalindrome(Scanner console) {
		boolean isPalindrome = false;
		String s = new String();
		String orgS;

		System.out.print("Enter some text and press enter : ");
		s = console.nextLine();

		orgS = s; // save the original string here
		s = s.toLowerCase(); // make it case-insensitive
		s.replaceAll("\\s", ""); // remove all blanks

		for (int i = 0; i < (s.length() / 2); i++) {
			if (!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {
				isPalindrome = false;
				break;
			} else {
				isPalindrome = true;
			}
		}
		if (isPalindrome) {
			System.out.print(orgS + " is a palindrome.");
		} else if (!isPalindrome) {
			System.out.print(orgS + " is not palindrome.");
		}

	}

}
