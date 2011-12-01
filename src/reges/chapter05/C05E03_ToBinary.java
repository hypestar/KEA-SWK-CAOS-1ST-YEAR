package reges.chapter05;

import java.util.Scanner;

public class C05E03_ToBinary {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int dec = -1;

		while (true) {
			System.out.println("Decimal to binary converter. enter 0 to exit");
			System.out.print("enter a decimal number : ");
			dec = console.nextInt();
			if (dec == 0)
				break;
			printBinary(dec);
		}
	}

	public static void printBinary(int dec) {
		StringBuffer binary = new StringBuffer();
		boolean isNegative = false;

		if (dec < 0) {
			isNegative = true;
			dec = Math.abs(dec);
		}

		while (dec != 0) {
			binary.append(dec % 2);
			dec = dec / 2;
		}
		if (isNegative)
			binary.append("-");
		System.out.println("Binary = " + binary.reverse().toString());
	}
}
