package reges.chapter03;

import java.util.Scanner;

public class C03E11_PadString {

	public static void main(String[] args) {
		String s;
		int padNum;
		Scanner console = new Scanner(System.in);

		System.out.print("Enter string : ");
		s = console.next();
		System.out.print("Enter desired string length : ");
		padNum = console.nextInt();
		System.out.print("The padded string looks like this : "
				+ padString(s, padNum));
	}

	public static String padString(String s, int padNum) {
		StringBuffer sb = new StringBuffer();

		if (s.length() < padNum) {
			sb.append(s);
			for (int i = 1; i <= padNum - s.length(); i++) {
				sb.append(" ");
			}
			s = sb.toString();
		} else if (s.length() > padNum) {
			s = s.substring(0, padNum);
		}
		return s;
	}
}
