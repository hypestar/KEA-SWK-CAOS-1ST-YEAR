package reges.chapter04;

import java.util.*;

public class C04E14_SwapPairs {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String s;
		
		System.out.print("Enter some text and press enter : ");
		s = console.nextLine();

		System.out.print("swapPairs() returns :" + swapPairs(s));

	}

	public static String swapPairs(String s) {
		StringBuffer swapStringBuffer = new StringBuffer();
		int pos;
		for (int i = 0; i < s.length()/2;i++) { //for the number of char pairs
			pos = i * 2;
			swapStringBuffer.append(s.charAt(pos + 1));
			swapStringBuffer.append(s.charAt(pos));
		}

		if (s.length() % 2 != 0) { // if string has an odd number of chars then append the last char 
			swapStringBuffer.append(s.charAt(s.length() - 1));
		}
		return swapStringBuffer.toString();
	}

}
